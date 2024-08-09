package com.sistema.biblioteca.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	@GetMapping("/livro/all")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<LivroModel>> listaAllLivros() {
		List<LivroModel> allLivro = livroRepository.findAll();
		return new ResponseEntity<>(allLivro, HttpStatus.OK);
	}

	@PutMapping("/livro/edit/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<LivroModel> editarLivro(@PathVariable Long id, @RequestBody LivroModel editLivro) {
		editLivro.setId( id);
		livroRepository.save(editLivro);
		return new ResponseEntity<>(editLivro, HttpStatus.OK);
	}

}
