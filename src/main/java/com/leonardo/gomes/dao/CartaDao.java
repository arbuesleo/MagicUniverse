package com.leonardo.gomes.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardo.gomes.entity.CartaEntity;

public interface CartaDao extends JpaRepository<CartaEntity, Integer> {
	public List<CartaEntity> findByNomeContainingIgnoreCase(String nome);
}
