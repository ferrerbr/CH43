package com.pandevs.pandevs.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class EmailNotFoundController {
	
	//la clase  recibe anotaciones que nos permiten conrolar el metodo de la excepcion  y apllicarlo  a metodos  de l tipo ResponseEntity
	
	//Método para manejar la excepcion y  y que retorna un mensaje (.getMessage())
	@ResponseBody
	@ExceptionHandler(EmailNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String userNotFoundHandler(EmailNotFoundException e) {
		return e.getMessage();
	}
	

}
