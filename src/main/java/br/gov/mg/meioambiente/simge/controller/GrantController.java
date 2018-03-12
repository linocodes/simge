package br.gov.mg.meioambiente.simge.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.mg.meioambiente.simge.entity.Grant;



@RestController
@RequestMapping("/grants")
public class GrantController extends GenericRestController<Grant> {

}