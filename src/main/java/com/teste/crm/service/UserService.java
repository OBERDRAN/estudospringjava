package com.teste.crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.crm.model.Cliente;
import com.teste.crm.repository.ClienteRepository;

@Service
public class UserService {

	
	@Autowired
	private ClienteRepository clienterepository;
	
	
	
}
