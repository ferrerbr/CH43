package org.generation.user.controller;

import java.util.ArrayList;

import org.generation.user.model.User;
import org.generation.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Tengo que indicarle  a scripngbooot que esta clase sera mi controller, con notacion @RestController que me permite indicar  que la clse es un controlador  de peticiones  tipo Rest API (trabaja como metodo del protocolo HTTP.
//defininmos el endpoint que apunta a este controlador mediante la anotacion @RequestMapping y entre poarentesis el endpoint que nosotros definamos.

@RestController
@RequestMapping("/api/v1")//localhost:8080/api/v1/users
public class UserController {
	
	//Instanciar una variable de tipo userService
	private final UserService userService;
	
	//tengo que relizar la inyeccion de dependencias en el contructor con la anotacion @Autowired
	
	@Autowired public UserController(UserService userService) {
		this.userService=userService;
		
	}
	
	//Metodo para el mapeo.Vamos a crear un metodo que nos permite get , post ,put delec (CRUD) y para ello vamos a utilizar diferente notaciones
	// defino el endpoint especifico
	@GetMapping("/users")
	public ArrayList<User> getAll(){
		return userService.getUsuarios();
	}

}
