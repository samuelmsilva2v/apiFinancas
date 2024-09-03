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

import com.example.demo.domain.models.dto.ContaRequestDto;
import com.example.demo.domain.models.dto.ContaResponseDto;
import com.example.demo.domain.services.interfaces.ContaDomainService;

@RestController
@RequestMapping("/api/contas")
public class ContaController {

	@Autowired
	private ContaDomainService contaDomainService;
	
	@PostMapping
	public ContaResponseDto post(@RequestBody ContaRequestDto request) throws Exception {
		return contaDomainService.inserir(request);
	}

	@PutMapping("{id}")
	public ContaResponseDto put(@PathVariable UUID id, @RequestBody ContaRequestDto request) throws Exception {
		return contaDomainService.atualizar(id, request);
	}

	@DeleteMapping("{id}")
	public ContaResponseDto delete(@PathVariable UUID id) throws Exception {
		return contaDomainService.excluir(id);
	}

	@GetMapping
	public List<ContaResponseDto> getAll() throws Exception {
		return contaDomainService.consultar();
	}

	@GetMapping("{id}")
	public ContaResponseDto getById(@PathVariable UUID id) throws Exception {
		return contaDomainService.obterPorId(id);
	}
}
