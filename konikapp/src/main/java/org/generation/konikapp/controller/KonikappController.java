package org.generation.konikapp.controller;

import java.util.List;

import org.generation.konikapp.model.Konikapp;
import org.generation.konikapp.service.KonikappService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/api/v1")

//CORS
public class KonikappController {
	//mandamos a llmar a serivice 
	private KonikappService konikappService;
	
	//inyeccion de dependencias en el constructor
	@Autowired
	public KonikappController(KonikappService konikappService) {
		this.konikappService =konikappService;
	}
	
	//Mapear  metodos (get post put delete)
	
	 @GetMapping ("/usuario")
	 public List<Konikapp> getMappingAll(){
		 return konikappService.getAll();
	 }
	
	

}
