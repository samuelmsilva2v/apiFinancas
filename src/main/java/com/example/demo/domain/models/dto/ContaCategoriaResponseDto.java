package com.example.demo.domain.models.dto;

import lombok.Data;

@Data
public class ContaCategoriaResponseDto {

	private ContaResponseDto conta;
	private CategoriaResponseDto categoria;
}
