package com.teste.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.crm.model.Cliente;
import com.teste.crm.repository.ClienteRepository;
import com.teste.crm.dto.*;

@Service
public class UserService {

	
	@Autowired
	private ClienteRepository clienterepository;
	
	//regra de negócio
	//chamar no banco
	
	public List<UserDTO> listar(){
		
		Cliente cliente = new Cliente();
		
		
		
	}
	
	

	
}
