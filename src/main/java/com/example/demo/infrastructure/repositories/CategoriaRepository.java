package com.example.demo.infrastructure.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.models.entities.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, UUID> {

}
