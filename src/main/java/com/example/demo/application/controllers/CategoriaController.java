package com.example.demo.application.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.models.dto.CategoriaRequestDto;
import com.example.demo.domain.models.dto.CategoriaResponseDto;
import com.example.demo.domain.services.interfaces.CategoriaDomainService;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

	@Autowired
	private CategoriaDomainService categoriaDomainService;

	@PostMapping
	public CategoriaResponseDto post(@RequestBody CategoriaRequestDto request) throws Exception {
		return categoriaDomainService.inserir(request);
	}

	@PutMapping("{id}")
	public CategoriaResponseDto put(@PathVariable UUID id, @RequestBody CategoriaRequestDto request) throws Exception {
		return categoriaDomainService.atualizar(id, request);
	}

	@DeleteMapping("{id}")
	public CategoriaResponseDto delete(@PathVariable UUID id) throws Exception {
		return categoriaDomainService.excluir(id);
	}

	@GetMapping
	public List<CategoriaResponseDto> getAll() throws Exception {
		return categoriaDomainService.consultar();
	}

	@GetMapping("{id}")
	public CategoriaResponseDto getById(@PathVariable UUID id) throws Exception {
		return categoriaDomainService.obterPorId(id);
	}
}
