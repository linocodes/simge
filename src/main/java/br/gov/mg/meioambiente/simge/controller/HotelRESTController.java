package br.gov.mg.meioambiente.simge.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.gov.mg.meioambiente.simge.entity.Hotel;
import br.gov.mg.meioambiente.simge.repository.HotelRepository;
import br.gov.mg.meioambiente.simge.service.HotelService;


@Controller
@RequestMapping("/rest")
public class HotelRESTController extends RESTController<Hotel, Long> {

    @Autowired	
	private HotelService service;
	
    @Autowired
    public HotelRESTController(HotelService service) {
        super(service);
    }
    
    @RequestMapping(value="/teste", method=RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody List<Hotel> getAllHotelPage(HttpServletRequest request, HttpServletResponse response) {
		return this.service.getAll();

	}
    
}