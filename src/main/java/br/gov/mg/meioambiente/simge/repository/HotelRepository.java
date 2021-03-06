package br.gov.mg.meioambiente.simge.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.gov.mg.meioambiente.simge.entity.Hotel;
import br.gov.mg.meioambiente.simge.filter.Filter;

@Repository
public interface HotelRepository extends ExtendedRepository<Hotel, Long> {

	/*
	Hotel findHotelByCity(String city);
*/
	List<Hotel> findByName(String name);

	@Query("SELECT a FROM Hotel a WHERE a.name=:name")
	List<Hotel> fetchArticles(@Param("name") String name);
	
    @Query(value = "SELECT * FROM HOTEL p WHERE p.name like :pattern", nativeQuery = true)
    List<Hotel> searchNatively(@Param("pattern") String pattern);
    
    @Query(value = "FROM Hotel p WHERE p.name like :pattern")
    List<Hotel> search(@Param("pattern") String pattern);	
    
    Page<Hotel> findAll(Pageable pageable);    
    Page<Hotel> findAll(Filter filter, Pageable pageable);    
    /**

 	Page<Ho> findAll(Pageable pageable);

	Page<City> findByNameContainingAndCountryContainingAllIgnoringCase(String name, String country, Pageable pageable);

	City findByNameAndCountryAllIgnoringCase(String name, String country);
 
     */

}
