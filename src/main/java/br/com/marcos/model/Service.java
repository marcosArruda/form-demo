package br.com.marcos.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by marcos on 24/10/16.
 */
@Entity
public class Service {

    public static final String OTHERS = "others";
    public static final String YES = "yes";
    public static final String NO = "no";

    /*
    "CREATE TABLE SERVICE " +
    "(" +
    " SERVICE_ID INT PRIMARY KEY          NOT NULL," +
    " OFFICE_ID              INT          NOT NULL, " +
    " SERVICE_NAME           CHAR(100)    NOT NULL, " +
    " SERVICE_DATE_UPDATED   TEXT         NOT NULL, " +
    " SERVICE_DATE_ADDDED    TEXT         NOT NULL, " +
    " STATUS                 TEXT         NOT NULL, " +
    " FOREIGN KEY(OFFICE_ID) REFERENCES OFFICE(OFFICE_ID) " +
    "); " +
    " " +
     */

    @Id
    @GeneratedValue
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name="OFFICE_ID")
    private Office office;

    @Column(name = "NAME", nullable = false)
    private String name;

    //@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "DATE_UPDATED", nullable = false)
    private Date dateUpdated;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "DATE_ADDED", nullable = false)
    private Date dateAdded;

    @Column(name = "STATUS", nullable = false)
    private String status;



    public Service(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Service service = (Service) o;

        if (getId() != null ? !getId().equals(service.getId()) : service.getId() != null) return false;
        if (getName() != null ? !getName().equals(service.getName()) : service.getName() != null) return false;
        if (getDateUpdated() != null ? !getDateUpdated().equals(service.getDateUpdated()) : service.getDateUpdated() != null)
            return false;
        if (getDateAdded() != null ? !getDateAdded().equals(service.getDateAdded()) : service.getDateAdded() != null)
            return false;
        return getStatus() != null ? getStatus().equals(service.getStatus()) : service.getStatus() == null;

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getDateUpdated() != null ? getDateUpdated().hashCode() : 0);
        result = 31 * result + (getDateAdded() != null ? getDateAdded().hashCode() : 0);
        result = 31 * result + (getStatus() != null ? getStatus().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        final StringBuffer sb = new StringBuffer("Service{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", dateUpdated=").append(df.format(dateUpdated));
        sb.append(", dateAdded=").append(df.format(dateAdded));
        sb.append(", status='").append(status).append('\'');
        //sb.append(", office=").append(office);
        sb.append('}');
        return sb.toString();
    }
}
