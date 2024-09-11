package org.generation.konikapp.service;

import java.util.List;

import org.generation.konikapp.model.Konikapp;
import org.generation.konikapp.repository.KonikappRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KonikappService {
	private  KonikappRepository kaRepository;
	
	
	//inyeccion de dependencias en el constructor 
	@Autowired
	public KonikappService(KonikappRepository kaRepository) {
		super();
		this.kaRepository = kaRepository;
	}
	
	//metodo para obteber todos los ususarion de mi DB
	public List<Konikapp> getAll(){
		return kaRepository.findAll();
	}
	
	//metodo par acrear un nuevo usuario // parte del registro de  de usuarios 
	
	
	

}
