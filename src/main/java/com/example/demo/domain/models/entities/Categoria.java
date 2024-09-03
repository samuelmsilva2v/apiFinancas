package com.example.demo.domain.models.entities;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "categoria")
@Data
public class Categoria {

	@Id
	@Column(name = "id")
	private UUID id;
	
	@Column(name = "nome", length = 50, nullable = false)
	private String nome;
	
	@ManyToMany(mappedBy = "categoria")
	private List<Conta> contas;
}
