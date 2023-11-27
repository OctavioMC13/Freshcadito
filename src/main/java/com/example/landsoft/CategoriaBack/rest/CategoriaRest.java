package com.example.landsoft.CategoriaBack.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.landsoft.CategoriaBack.model.Categoria;
import com.example.landsoft.CategoriaBack.service.CategoriaService;

@RestController
@RequestMapping("/categoria/")
public class CategoriaRest {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping
	private ResponseEntity<List<Categoria>> getAllCategorias (){
		return ResponseEntity.ok(categoriaService.findAll());
		
	}

}
