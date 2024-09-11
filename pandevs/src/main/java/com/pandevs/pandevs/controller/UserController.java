package com.pandevs.pandevs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pandevs.pandevs.exceptions.EmailNotFoundException;
import com.pandevs.pandevs.model.User;
//import com.pandevs.pandevs.repository.UserRepository;
import com.pandevs.pandevs.service.UserService;

@RestController
@RequestMapping("/api/v1")

//CORS
public class UserController  {
	
	//mandamos a llamar a service
	private UserService userService;
	
	//inyeccion  de dependencias en el controlador
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
		
	}
	
	//Mapear metodos (get , post, put , delete)
	@GetMapping("/pandelovers")
	public List<User> getMappingAll(){
		return userService.getAll();
	}
	
	//Mapear Metodo  POSt para que reciva un nuevo objeto y el body del mismo(@RequestBoddy)
	@PostMapping 
	public User newUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	
	// mappear un metodo delete  que apunte a un id especifico  para ell tenemos que permiteir que  qie el ID sea variable en el ENDPOINT @pathvariable
	
	@DeleteMapping("/pandelovers/{id}")
	public void deleteUser( @PathVariable(name = "id") Long id) {
		userService.deleteUser(id);
		
	}
	
	
	
	//Mapear el metodo foundby id
	@GetMapping("/pandelovers/{id}")
	public User GetById(@PathVariable(name = "id") Long id) {
		return userService.getById(id);
	}
	
	//mapear el metodo  get ByEmail aplicando la Query JPQL y la excepcion 
	//---- responseEntity  clase de spring que me  permite reprentar respuestas HTTP personalizables
	//----@RequestParam permite recibir parametros y valores
	//---- creamos clade EmailNoTFoundException y su classe controller EmailFpoudController
	@GetMapping("pandelovers/mail")
	public ResponseEntity<User> getByEmail(@RequestParam(name="pandesMail") String mail) {
		User userByEmail =userService.GetByEmail(mail);
		if(userByEmail == null) {
			throw new EmailNotFoundException(mail);
		}
		return new ResponseEntity<User>(userByEmail,HttpStatus.OK);
	}
	
	
	

}
