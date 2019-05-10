package com.pelicula.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.pelicula.demo.model.Usuario;

public interface UserRepository extends CrudRepository<Usuario, Integer>{
	
	public Usuario findByUsername(String username);
}
