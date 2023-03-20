package com.farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmacia.model.Produto;

@Repository
public interface ProtudoRepository extends JpaRepository<Produto, Long>{
	

}
