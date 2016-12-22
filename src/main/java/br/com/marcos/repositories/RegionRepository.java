package br.com.marcos.repositories;

import br.com.marcos.model.Region;
import br.com.marcos.model.Service;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by marcos on 24/10/16.
 */
@Repository
public interface RegionRepository extends PagingAndSortingRepository<Region, Long> {
    @Query("select u.id, u.name from Region u")
    List<Region> findIdAndName();

}
