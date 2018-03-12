package br.gov.mg.meioambiente.simge.service;



import java.io.Serializable;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.boot.actuate.metrics.GaugeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.gov.mg.meioambiente.simge.dao.GenericDaoImpl;
import br.gov.mg.meioambiente.simge.entity.Employee;
import br.gov.mg.meioambiente.simge.entity.Hotel;
import br.gov.mg.meioambiente.simge.filter.Comparison;
import br.gov.mg.meioambiente.simge.filter.Condition;
import br.gov.mg.meioambiente.simge.filter.Filter;
import br.gov.mg.meioambiente.simge.repository.HotelRepository;

/*
 * Sample service to demonstrate what the API would use to get things done
 */
@Service
public class HotelService extends GenericDaoImpl<Hotel, Long> implements CRUDService<Hotel> {

	
    @Autowired	
	private HotelRepository repository;
	
    @Autowired
    public HotelService(HotelRepository repository) {
        super(repository);
    }
    
    private static final Logger log = LoggerFactory.getLogger(HotelService.class);

    @Autowired
    private HotelRepository hotelRepository;

    @Autowired
    CounterService counterService;

    @Autowired
    GaugeService gaugeService;

    public Hotel createHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    public Hotel getHotel(long id) {
        return hotelRepository.findOne(id);
    }

    public void updateHotel(Hotel hotel) {
        hotelRepository.save(hotel);
    }

    public void deleteHotel(Long id) {
        hotelRepository.delete(id);
    }

    //http://goo.gl/7fxvVf
    public Page<Hotel> getAllHotels(Integer page, Integer size) {
        Page pageOfHotels = hotelRepository.findAll (new PageRequest(page, size));
        // example of adding to the /metrics
        if (size > 50) {
            counterService.increment("Khoubyari.HotelService.getAll.largePayload");
        }
        return pageOfHotels;
    }
    
    public Page<Hotel> getAllHotels(Pageable page) {
    	
		Filter filter = new Filter();
        filter.addCondition(new Condition.Builder().setComparison(Comparison.eq).setField("name").setValue("a").build());

//    	hotelRepository.findAll();
        Page pageOfHotels = hotelRepository.findAll(filter, page);
        //(page.getOffset(), page.getPageSize(), page.getSort()));
        // example of adding to the /metrics
        if (page.getPageSize() > 50) {
            counterService.increment("Khoubyari.HotelService.getAll.largePayload");
        }
        return pageOfHotels;
    }
    
}
