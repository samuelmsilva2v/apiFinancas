package com.example.demo.domain.models.dto;

import java.util.Date;
import java.util.UUID;

import lombok.Data;

@Data
public class ContaRequestDto {

	private String nome;
	private Date data;
	private Double valor;
	private String tipo;
}
