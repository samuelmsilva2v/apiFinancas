package com.example.demo.domain.models.entities;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.example.demo.domain.models.enums.TipoConta;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name = "conta")
@Data
public class Conta {

	@Id
	@Column(name = "id")
	private UUID id;

	@Column(name = "nome", length = 150, nullable = false)
	private String nome;

	@Temporal(TemporalType.DATE)
	@Column(name = "data", nullable = false)
	private Date data;

	@Column(name = "valor", precision = 10, scale = 2, nullable = false)
	private BigDecimal valor;

	@Enumerated(EnumType.STRING)
	@Column(name = "tipo", nullable = false)
	private TipoConta tipo;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "conta_categoria", joinColumns = @JoinColumn(name = "conta_id"), inverseJoinColumns = @JoinColumn(name = "categoria_id"))
	private List<Categoria> categoria;
}
