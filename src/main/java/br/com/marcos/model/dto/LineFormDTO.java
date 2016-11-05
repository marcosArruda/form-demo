package br.com.marcos.model.dto;

import java.util.List;

/**
 * Created by marcos on 05/11/16.
 */
public class LineFormDTO {
    private List<StatusDTO> statuses;

    private String status;

    public List<StatusDTO> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<StatusDTO> statuses) {
        this.statuses = statuses;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
