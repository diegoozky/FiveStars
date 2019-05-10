package com.pelicula.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.pelicula.demo.model.Actor;

public interface ActorRepository extends CrudRepository<Actor, Integer>{
	public Actor findByNombre(String nombre);
}
