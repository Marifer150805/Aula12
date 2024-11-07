package com.teste.hospede.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.produto.entities.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{

}