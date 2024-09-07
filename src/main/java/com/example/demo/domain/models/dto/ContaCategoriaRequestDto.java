package com.example.demo.domain.models.dto;

import java.util.UUID;

import lombok.Data;

@Data
public class ContaCategoriaRequestDto {

	private UUID contaId;
	private UUID categoriaId;
}
