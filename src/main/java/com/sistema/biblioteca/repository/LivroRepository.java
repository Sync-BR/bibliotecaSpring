package com.sistema.biblioteca.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.biblioteca.model.LivroModel;

public interface LivroRepository extends JpaRepository<LivroModel, Long>{



}
