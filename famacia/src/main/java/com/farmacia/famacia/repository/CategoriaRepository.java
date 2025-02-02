package com.farmacia.famacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmacia.famacia.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
public List<Categoria> findAllByDescricaoContainingIgnoreCase (String descricao);
}
