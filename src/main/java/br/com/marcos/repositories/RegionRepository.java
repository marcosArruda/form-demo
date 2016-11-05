package br.com.marcos.repositories;

import br.com.marcos.model.Region;
import br.com.marcos.model.Service;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by marcos on 24/10/16.
 */
@Repository
public interface RegionRepository extends PagingAndSortingRepository<Region, Long> {
}
