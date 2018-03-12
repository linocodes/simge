package br.gov.mg.meioambiente.simge.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.gov.mg.meioambiente.simge.entity.Hotel;
import br.gov.mg.meioambiente.simge.service.HotelService;
import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/example/v1/hotels")
public class HotelController extends BaseRestController<Hotel> {

	private HotelService hotelService;

	@Autowired
	public HotelController(HotelService hotelService) {
		this.hotelService = hotelService;
	}

	@RequestMapping(value = "/teste", method = RequestMethod.GET, produces = { "application/json", "application/xml" })
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody Page<Hotel> getAllHotelPage(@PageableDefault(value = 10, page = 0) Pageable pageable,
			@RequestParam(value = "search") String search, HttpServletRequest request, HttpServletResponse response) {
		return this.hotelService.getAllHotels(pageable);
	}

}
