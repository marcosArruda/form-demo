package br.com.marcos.controllers;

import br.com.marcos.model.Office;
import br.com.marcos.model.Service;
import br.com.marcos.model.comparator.OfficeComparator;
import br.com.marcos.model.comparator.StatusDTOComparator;
import br.com.marcos.model.dto.*;
import br.com.marcos.repositories.OfficeRepository;
import br.com.marcos.repositories.ServiceRepository;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.sound.sampled.Line;
import java.util.*;

/**
 * Created by marcos on 24/10/16.
 */
@Controller
public class IndexController {

    @Autowired
    private OfficeRepository officeRepository;

    @Autowired
    private ServiceRepository serviceRepository;



    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model ){
        List<QuestionDTO> questions = new ArrayList<>();
        List<Office> offices = officeRepository.findAll();
        List<String> distinctNames = serviceRepository.findDistinctNames();
        OfficeComparator officeComparator = new OfficeComparator();
        StatusDTOComparator statusComparator = new StatusDTOComparator();

        Collections.sort(offices, officeComparator);

        for (String serviceName : distinctNames) {
            QuestionDTO questionDTO = new QuestionDTO();
            questionDTO.setServiceName(serviceName);
            questionDTO.setRefServiceId(serviceRepository.findFirstByName(serviceName).getId());
            questions.add(questionDTO);
        }

        for(QuestionDTO q : questions){
            List<StatusDTO> statuses = new ArrayList<>();
            for (Office office : offices) {
                for (Service service: office.getServices()) {
                    if(service.getName().equals(q.getServiceName())){
                        StatusDTO statusDTO = new StatusDTO();
                        statusDTO.setOfficeName(office.getName());
                        statusDTO.setServiceId(service.getId());
                        statusDTO.setStatus(service.getStatus());
                        statuses.add(statusDTO);
                    }
                }
            }
            Collections.sort(statuses, statusComparator);
            q.setStatuses(statuses);
        }


        DashboardFormDTO dto = new DashboardFormDTO();
        model.addAttribute("dashboardForm", dto);
        model.addAttribute("offices", offices);
        model.addAttribute("questions", questions);

        return "index" ;
    }

    @RequestMapping(value = "/edit-service/{serviceId}", method = RequestMethod.GET)
    public String editService(@PathVariable Long serviceId, Model model){
        LineFormDTO lineFormDTO = new LineFormDTO();
        List<Service> sameNameServices = serviceRepository.findAllByName(serviceRepository.findOne(serviceId).getName());
        List<StatusDTO> statuses = new ArrayList<>();
        List<String> usableStatuses = new ArrayList<>();
        usableStatuses.add(Service.YES);
        usableStatuses.add(Service.NO);
        usableStatuses.add(Service.OTHERS);

        for(Service service : sameNameServices){
            StatusDTO statusDTO = new StatusDTO();
            statusDTO.setServiceId(service.getId());
            statusDTO.setStatus(service.getStatus());
            statusDTO.setOfficeName(service.getOffice().getName());

            statuses.add(statusDTO);
        }
        lineFormDTO.setStatuses(statuses);
        model.addAttribute("lineForm", lineFormDTO);
        model.addAttribute("statuses", statuses);
        model.addAttribute("usableStatuses", usableStatuses);
        model.addAttribute("serviceName", sameNameServices.get(0).getName());
        return "edit-service-line" ;
    }

    @RequestMapping(value = "/save-changes-line", method = RequestMethod.POST)
    public String saveChangesLine(LineFormDTO lineFormDTO, Model model){
        for (StatusDTO dto : lineFormDTO.getStatuses()) {
            serviceRepository.updateStatus(dto.getServiceId(), dto.getStatus());
        }
        return "redirect:/";
    }
}
