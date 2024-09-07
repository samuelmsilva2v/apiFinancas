package com.example.demo.domain.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.models.dto.CategoriaResponseDto;
import com.example.demo.domain.models.dto.ContaCategoriaRequestDto;
import com.example.demo.domain.models.dto.ContaCategoriaResponseDto;
import com.example.demo.domain.models.dto.ContaResponseDto;
import com.example.demo.domain.models.entities.Categoria;
import com.example.demo.domain.models.entities.Conta;
import com.example.demo.domain.services.interfaces.ContaCategoriaDomainService;
import com.example.demo.infrastructure.repositories.CategoriaRepository;
import com.example.demo.infrastructure.repositories.ContaRepository;

@Service
public class ContaCategoriaDomainServiceImpl implements ContaCategoriaDomainService {

	@Autowired
	private ContaRepository contaRepository;

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public ContaCategoriaResponseDto inserir(ContaCategoriaRequestDto request) throws Exception {

		Conta conta = contaRepository.findById(request.getContaId())
				.orElseThrow(() -> new IllegalArgumentException("Conta não encontrada. Verifique o ID informado."));

		Categoria categoria = categoriaRepository.findById(request.getCategoriaId())
				.orElseThrow(() -> new IllegalArgumentException("Categoria não encontrada. Verifique o ID informado."));
		
		conta.getCategoria().add(categoria);
		
		contaRepository.save(conta);
		
		ContaCategoriaResponseDto response = new ContaCategoriaResponseDto();
		response.setConta(modelMapper.map(conta, ContaResponseDto.class));
		response.setCategoria(modelMapper.map(categoria, CategoriaResponseDto.class));

		return response;
	}

}
