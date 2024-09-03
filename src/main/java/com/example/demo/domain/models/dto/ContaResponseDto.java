package com.example.demo.domain.models.dto;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import lombok.Data;

@Data
public class ContaResponseDto {

	private UUID id;
	private String nome;
	private Date data;
	private Double valor;
	private String tipo;
	private List<CategoriaResponseDto> categorias;
}
