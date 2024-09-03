package com.example.demo.application.controllers;

import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

	@PostMapping
	public void post() throws Exception {
		// TODO
	}
	
	@PutMapping("{id}")
	public void put(@PathVariable UUID id) throws Exception {
		// TODO
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable UUID id) throws Exception {
		// TODO
	}
	
	@GetMapping
	public void getAll() throws Exception {
		// TODO
	}
	
	@GetMapping("{id}")
	public void getById(@PathVariable UUID id) throws Exception {
		// TODO
	}
	
	
	
	
	
}
