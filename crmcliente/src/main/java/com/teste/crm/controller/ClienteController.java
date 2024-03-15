package com.teste.crm.controller;

import com.teste.crm.dto.UserDTO;
import com.teste.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//recebe requisicoes
@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private UserService service;

	@GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO> buscandoPorId(@PathVariable Long id) throws Exception {
        UserDTO userDTO = service.buscandoPorId(id);

        return ResponseEntity.ok(userDTO);
    }
}
