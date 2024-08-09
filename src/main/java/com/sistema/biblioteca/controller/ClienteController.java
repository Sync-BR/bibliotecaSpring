package com.sistema.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sistema.biblioteca.model.ClienteModel;
import com.sistema.biblioteca.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	@Autowired(required = false)
	private ClienteRepository clienteRepository;

	@PostMapping("/adicionar")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity <ClienteModel> addCliente(@RequestBody ClienteModel cadCliente) throws Exception {
		clienteRepository.save(cadCliente);
		return new ResponseEntity<>(HttpStatus.OK);

	}
	
	public ResponseEntity<ClienteModel> deleteCliente(@PathVariable ClienteModel id){
			clienteRepository.delete(id);
		return null;
		
	}

}
