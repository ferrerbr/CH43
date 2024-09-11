package com.pandevs.pandevs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pandevs.pandevs.model.User;


//Esta interface hereda los metodos de JpaRepository y toma dos parametros el objeto model y el tipo de dato de la PK

public interface UserRepository extends JpaRepository<User, Long>{
	
	// mas adelante aqui podremos realizar consultas (query):JPQL
	
	@Query("SELECT u FROM User u WHERE u.mail = ?1 ")
	User findByEmail(String mail);

}
