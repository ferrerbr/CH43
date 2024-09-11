package com.pandevs.pandevs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pandevs.pandevs.exceptions.UserNotFoundException;
import com.pandevs.pandevs.model.User;
import com.pandevs.pandevs.repository.UserRepository;

//colocar la notacion @service
@Service 
public class UserService {
	private  UserRepository userRepository;

	//Inyeccion de dependencias en el constructor
	@Autowired
	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	//Metodo para obtener todos los usuarios
	public List<User>getAll(){
		return userRepository.findAll();
	}
	
	// Método para crear un nuevo usuario
	public User createUser(User newUser) {
		return userRepository.save(newUser);
	}
	
	// Método para eliminar un usuario mediante id con Exception
	public void deleteUser(Long id) {
		if (userRepository.existsById(id)) {
			userRepository.deleteById(id);
		} else {
			throw new UserNotFoundException(id);
		}
	}
	
	// Método para recuperar usuarios por Id (validar si existe)
	public User getById(Long id) {
		return userRepository.findById(id)
				.orElseThrow(() -> new UserNotFoundException(id));
	}
	
	// Método para recuperar usuario por Id (sin excepción, de tipo Optional)
	/*
	public Optional<User> getById(Long id) {
		return userRepository.findById(id);
	}
	*/
	
	// recuperar usuario por email
		public User GetByEmail(String mail) {
			return userRepository.findByEmail(mail);
		}
	
	
	
	
	

}
