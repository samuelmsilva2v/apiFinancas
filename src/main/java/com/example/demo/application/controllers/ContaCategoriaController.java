package com.example.demo.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.models.dto.ContaCategoriaRequestDto;
import com.example.demo.domain.models.dto.ContaCategoriaResponseDto;
import com.example.demo.domain.services.interfaces.ContaCategoriaDomainService;

@RestController
@RequestMapping("/api/conta-categoria")
public class ContaCategoriaController {

	@Autowired
	private ContaCategoriaDomainService contaCategoriaDomainService;
	
	@PostMapping
	public ContaCategoriaResponseDto post(@RequestBody ContaCategoriaRequestDto request) throws Exception {
		return contaCategoriaDomainService.inserir(request);
	}
}
