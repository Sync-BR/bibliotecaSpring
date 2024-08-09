package com.sistema.biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.biblioteca.model.LivroModel;

public interface LivroRepository extends JpaRepository<LivroModel, Long>{

	List<LivroModel> findAllById(int i);

}
