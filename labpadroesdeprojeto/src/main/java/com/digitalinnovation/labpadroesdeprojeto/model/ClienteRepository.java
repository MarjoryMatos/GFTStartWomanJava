package com.digitalinnovation.labpadroesdeprojeto.model;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;



@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{
	
}
