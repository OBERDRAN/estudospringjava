package com.teste.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.crm.model.*;
import com.teste.crm.repository.*;

//recebe requisicoes
@RestController
@RequestMapping("/clientes")
public class ClienteController {

	//resqponde a requisicao mapeada, /clientes
	@GetMapping
	public List<Cliente>listar() {
	
		return clienteRepository.findAll();
	}

	@PostMapping
	//requestbody convert o json em objeto java tipo cliente
	public Cliente add(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
}
