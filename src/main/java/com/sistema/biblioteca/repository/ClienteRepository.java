package com.sistema.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.biblioteca.controller.ClienteController;
import com.sistema.biblioteca.model.ClienteModel;


public interface ClienteRepository extends JpaRepository<ClienteModel, Long>{

	void save(ClienteController cadCliente);

	

}
