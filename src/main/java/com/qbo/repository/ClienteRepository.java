package com.qbo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.qbo.model.Cliente;
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	

}
