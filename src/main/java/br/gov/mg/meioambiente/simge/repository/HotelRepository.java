package br.gov.mg.meioambiente.simge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.gov.mg.meioambiente.simge.entity.Hotel;

@Repository
public interface HotelRepository extends BaseRepository<Hotel, Long> {

	Hotel findHotelByCity(String city);

	List<Hotel> findByName(String name);

	@Query("SELECT a FROM Hotel a WHERE a.name=:name")
	List<Hotel> fetchArticles(@Param("name") String name);

}
