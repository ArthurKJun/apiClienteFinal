package com.example.apiCliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exemple.apiCliente.entidades.cliente;

@Repository
public interface ClienteRepository extends JpaRepository<cliente, Long>{

}