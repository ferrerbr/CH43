package org.generation.konikapp.repository;

import org.generation.konikapp.model.Konikapp;
import org.springframework.data.jpa.repository.JpaRepository;


//esta interface hereda los metodos de JPARespository y toma dos parametros, el objeto model y el tipo de dato de la PK 
public interface KonikappRepository extends JpaRepository<Konikapp, Long> {
	
	//aqui podemos realizar realizar consultar query(JPQL)

}
