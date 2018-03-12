package br.gov.mg.meioambiente.simge.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.gov.mg.meioambiente.simge.entity.Hotel;

/**
 * Repository can be used to delegate CRUD operations against the data source: http://goo.gl/P1J8QH
 */
public interface HotelRepository extends PagingAndSortingRepository<Hotel, Long> , JpaSpecificationExecutor<Hotel> {
	
    Hotel findHotelByCity(String city);
    Page findAll(Pageable pageable);
}
