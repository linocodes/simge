package br.gov.mg.meioambiente.simge.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.gov.mg.meioambiente.simge.entity.BaseModel;
import br.gov.mg.meioambiente.simge.entity.Hotel;
import br.gov.mg.meioambiente.simge.exception.DataFormatException;
import br.gov.mg.meioambiente.simge.service.CRUDService;
import br.gov.mg.meioambiente.simge.service.HotelService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

public abstract class BaseRestController<T extends BaseModel> extends AbstractRestHandler {

}