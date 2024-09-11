package org.generation.user.service;

import java.util.ArrayList;

import org.generation.user.model.User;
import org.springframework.stereotype.Service;

// a toda clase servcice le tengo que agregar una notacion que indique que actura como servicio

@Service
public class UserService {
	//vamos a instanciar un Array list de tipo user para simular una base de datos(DB)
	public final ArrayList<User> usuarios = new ArrayList<User>();
	
	//metodo constructor
	public UserService() {
		//Instancia Objetos
		usuarios.add(new User(1L,"Arturo Ramirez","arturo@gmail.com","arturo1234"));
		usuarios.add(new User(2L,"Eric Eduardo","eric@gmail.com","123456art"));
		usuarios.add(new User(3L,"Moni vidente", "moni2mail.com","selenaEstaEmbarazada"));
		usuarios.add(new User(4L,"Brandon Ferrer","ferre@gmail.com","cacahuate1997"));
		usuarios.add(new User(5L,"Mitzi Martinez","mtzi2gmail.com","MES2024a"));
		
	}
	
	//Metodos par arelaciuonar el mapeo y poder acceder a la infrormcion  mediante protocoloHttp(definido en controller)
	public ArrayList<User> getUsuarios(){
		return usuarios;
	}
	
	//Mas adelante , aqui existiran  otros metodos que nos permiten acceder, eliminar , modificar(astualizar) crear, obtener por id , obtener por e mail, modificar  
}