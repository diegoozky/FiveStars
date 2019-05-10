package com.pelicula.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.pelicula.demo.model.Director;

public interface DirectorRepository extends CrudRepository<Director, Integer> {
	public Director findByNombre(String nombre);
}
