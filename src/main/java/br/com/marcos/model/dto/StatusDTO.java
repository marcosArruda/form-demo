package br.com.marcos.model.dto;


import java.io.Serializable;

/**
 * Created by marcos on 05/11/16.
 */
public class StatusDTO implements Serializable{
    private String officeName;
    private String status;
    private Long serviceId;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("StatusDTO{");
        sb.append("officeName='").append(officeName).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", serviceId=").append(serviceId);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StatusDTO statusDTO = (StatusDTO) o;

        if (getOfficeName() != null ? !getOfficeName().equals(statusDTO.getOfficeName()) : statusDTO.getOfficeName() != null)
            return false;
        if (getStatus() != null ? !getStatus().equals(statusDTO.getStatus()) : statusDTO.getStatus() != null)
            return false;
        return getServiceId() != null ? getServiceId().equals(statusDTO.getServiceId()) : statusDTO.getServiceId() == null;

    }

    @Override
    public int hashCode() {
        int result = getOfficeName() != null ? getOfficeName().hashCode() : 0;
        result = 31 * result + (getStatus() != null ? getStatus().hashCode() : 0);
        result = 31 * result + (getServiceId() != null ? getServiceId().hashCode() : 0);
        return result;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }
}
