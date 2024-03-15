package com.teste.crm.service;

import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.core.html.IThrowableRenderer;
import com.teste.crm.dto.UserDTO;
import com.teste.crm.model.Cliente;
import com.teste.crm.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class UserService {

	
	@Autowired
	private ClienteRepository clienterepository;
	
	//regra de negócio
	//chamar no banco
	
	public UserDTO buscandoPorId(Long id) throws Exception {
		Optional<Cliente> cliente = clienterepository.findById(id);

		UserDTO userDTO = new UserDTO(cliente.get());

		return userDTO;
	}
}
