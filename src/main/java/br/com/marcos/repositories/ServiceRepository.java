package br.com.marcos.repositories;

import br.com.marcos.model.Service;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by marcos on 24/10/16.
 */
@Repository
public interface ServiceRepository extends PagingAndSortingRepository<Service, Long> {
    @Query("select distinct(u.name) from Service u")
    List<String> findDistinctNames();
    Service findFirstByName(String name);
    List<Service> findAllByName(String name);

    @Modifying(clearAutomatically = false)
    @Transactional
    @Query("UPDATE Service s SET s.status = :newStatus WHERE s.id = :serviceId")
    int updateStatus(@Param("serviceId") Long id, @Param("newStatus") String status);

}
