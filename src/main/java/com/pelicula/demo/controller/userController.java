package com.pelicula.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pelicula.demo.model.Usuario;
import com.pelicula.demo.repositories.UserRepository;

@RestController
@RequestMapping("/login")
public class userController {

	
	@Autowired
	UserRepository repositorio;
	
	@GetMapping("")
	@CrossOrigin
	public @ResponseBody Iterable<Usuario> getAllPeliculas(){
		return repositorio.findAll();
	}
	
	@PostMapping("")
	@CrossOrigin
	public @ResponseBody String poner(@RequestBody Usuario p ) {
		p.setId(null);
		p.getMD5();
		repositorio.save(p);
		return "Exito al guardar";
	}
	
	@PutMapping("")
	@CrossOrigin
	public @ResponseBody String actualizar(@RequestBody Usuario p) {
		
		if(repositorio.existsById(p.getId())) {
			repositorio.save(p);
			return "Se ha actualizado";
		}
		return "";
	}
	
	@DeleteMapping("")
	@CrossOrigin
	public @ResponseBody String borrar(@RequestParam Integer id) {
		if(repositorio.existsById(id)) {
			repositorio.deleteById(id);
			return "Borrado";
		}
		return "No se encuentra ningun registro con este id";
	}
	
}
