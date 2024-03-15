package com.teste.crm.repository;

import ch.qos.logback.core.net.server.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.crm.model.Cliente;

@Repository
//responsavel por interagir com o banco de dados
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
