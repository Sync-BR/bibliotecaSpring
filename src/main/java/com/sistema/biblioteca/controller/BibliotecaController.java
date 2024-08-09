package com.sistema.biblioteca.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sistema.biblioteca.model.LivroModel;
import com.sistema.biblioteca.repository.LivroRepository;

import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/biblioteca")
public class BibliotecaController {

	@Autowired(required = false)
	private LivroRepository livroRepository;

	@PostMapping("/adicionar")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<LivroModel> addLivro(@RequestBody LivroModel AddLivro) throws Exception {
		livroRepository.save(AddLivro);
		return new ResponseEntity<LivroModel>(HttpStatus.CREATED);
	}

	@GetMapping("/livro/{getlivro}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<LivroModel> listaLivros(@PathVariable int getlivro) throws Exception {
		Optional<LivroModel> listLivro = livroRepository.findById((long) getlivro);	
			return new ResponseEntity<>(listLivro.get(), HttpStatus.OK);
	
	}


}
