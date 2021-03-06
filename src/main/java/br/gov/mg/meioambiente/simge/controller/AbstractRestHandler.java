package br.gov.mg.meioambiente.simge.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import br.gov.mg.meioambiente.simge.exception.DataFormatException;
import br.gov.mg.meioambiente.simge.exception.ResourceNotFoundException;
import br.gov.mg.meioambiente.simge.exception.RestErrorInfo;

import javax.servlet.http.HttpServletResponse;

/**
 * This class is meant to be extended by all REST resource "controllers". It
 * contains exception mapping and other common REST API functionality
 */
// @ControllerAdvice?
public abstract class AbstractRestHandler implements ApplicationEventPublisherAware {

	//protected final Logger log = LoggerFactory.getLogger(this.getClass());
	protected ApplicationEventPublisher eventPublisher;

	protected static final String DEFAULT_PAGE_SIZE = "100";
	protected static final String DEFAULT_PAGE_NUM = "0";

	/**
	 * Retorna o nome da entidade 
	 * @param clazz
	 * @return
	 */
	public String getClassName(Class<?> clazz) {
		return clazz.getSimpleName();
	}
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.eventPublisher = applicationEventPublisher;
	}

	// todo: replace with exception mapping
	public static <T> T checkResourceFound(final T resource) {
		if (resource == null) {
			throw new ResourceNotFoundException("resource not found");
		}
		return resource;
	}

}