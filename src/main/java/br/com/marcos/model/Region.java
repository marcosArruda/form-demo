package br.com.marcos.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by marcos on 24/10/16.
 */
@Entity
public class Region implements Serializable{
    @Id
    @GeneratedValue
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "DATE_UPDATED", nullable = false)
    private Date dateUpdated;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "DATE_ADDED", nullable = false)
    private Date dateAdded;

    @OneToMany(mappedBy = "region", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Office> offices;

    public Region(){
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

    public List<Office> getOffices() {
        return offices;
    }

    public void setOffices(List<Office> offices) {
        this.offices = offices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Region region = (Region) o;

        if (getId() != null ? !getId().equals(region.getId()) : region.getId() != null) return false;
        if (getName() != null ? !getName().equals(region.getName()) : region.getName() != null) return false;
        if (getDateUpdated() != null ? !getDateUpdated().equals(region.getDateUpdated()) : region.getDateUpdated() != null)
            return false;
        return getDateAdded() != null ? getDateAdded().equals(region.getDateAdded()) : region.getDateAdded() == null;

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getDateUpdated() != null ? getDateUpdated().hashCode() : 0);
        result = 31 * result + (getDateAdded() != null ? getDateAdded().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        final StringBuffer sb = new StringBuffer("Region{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", dateUpdated=").append(df.format(dateUpdated));
        sb.append(", dateAdded=").append(df.format(dateAdded));
        //sb.append(", offices=").append(offices);
        sb.append('}');
        return sb.toString();
    }
}
