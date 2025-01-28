package com.sesi.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesi.projeto.entities.Produto;
import com.sesi.projeto.repository.ProdutoRepository;

@RestController
@RequestMapping(value = "produto")
public class ProdutoController {

	@Autowired
	ProdutoRepository repo;
	
	@GetMapping
	public ResponseEntity<List<Produto>> mostrarTodos(){
		List<Produto> prod = repo.findAll();
		return ResponseEntity.ok(null);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> mostrarPorId(@PathVariable Long id){
		Produto prod
	}
	}

