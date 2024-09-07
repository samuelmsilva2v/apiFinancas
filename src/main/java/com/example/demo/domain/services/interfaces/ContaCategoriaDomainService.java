package com.example.demo.domain.services.interfaces;

import com.example.demo.domain.models.dto.ContaCategoriaRequestDto;
import com.example.demo.domain.models.dto.ContaCategoriaResponseDto;

public interface ContaCategoriaDomainService {

	public ContaCategoriaResponseDto inserir(ContaCategoriaRequestDto request) throws Exception;
}
