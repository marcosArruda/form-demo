package br.com.marcos.model.dto;

/**
 * Created by ruballo on 12/21/16.
 */
public class RegionDTO {

    public RegionDTO(){}
    public RegionDTO(Long id, String name){
        this.id = id;
        this.name = name;
    }

    private Long id;
    private String name;

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


}
