package br.com.marcos.repositories;

import br.com.marcos.model.Office;
import br.com.marcos.model.Service;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by marcos on 24/10/16.
 */
@Repository
public interface OfficeRepository extends PagingAndSortingRepository<Office, Long> {
    @Query("select u from Office u")
    List<Office> findAll();
}
