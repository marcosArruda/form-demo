package br.com.marcos.model.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marcos on 05/11/16.
 */
public class QuestionDTO {
    private List<StatusDTO> statuses = new ArrayList<>();
    private String serviceName;
    private Long refServiceId;


    public List<StatusDTO> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<StatusDTO> statuses) {
        this.statuses = statuses;
    }

    public void addStatus(StatusDTO status){
        this.statuses.add(status);
    }


    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Long getRefServiceId() {
        return refServiceId;
    }

    public void setRefServiceId(Long refServiceId) {
        this.refServiceId = refServiceId;
    }
}
