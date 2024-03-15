package com.teste.crm.dto;

import com.teste.crm.model.Cliente;

public class UserDTO {
	
	//request e response em pacotes diferentes
	
	private Long id;
	
	private String nome;
	
	private int idade;


	public UserDTO (Cliente cliente) {
		this.id = cliente.getId();
		this.nome = cliente.getNome();
		this.idade = cliente.getIdade();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
}
