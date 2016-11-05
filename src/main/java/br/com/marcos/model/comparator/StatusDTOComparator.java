package br.com.marcos.model.comparator;

import br.com.marcos.model.Office;
import br.com.marcos.model.dto.StatusDTO;

import java.util.Comparator;

/**
 * Created by marcos on 05/11/16.
 */
public class StatusDTOComparator implements Comparator<StatusDTO> {
    @Override
    public int compare(StatusDTO o1, StatusDTO o2) {
        return o1.getOfficeName().compareToIgnoreCase(o2.getOfficeName());
    }
}
