package com.exemple.apiCliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiCliente.repository.ClienteRepository;
import com.exemple.apiCliente.entidades.Cliente;

@RestController

@RequestMapping("/cliente")
public class ClienteController{
	
	@Autowired 
	ClienteRepository repo;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> getListaClientes() {
		return ResponseEntity.status(HttpStatus.OK).body(repo.findAll());
	}
	
	
}