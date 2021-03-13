package com.qbo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qbo.model.Cliente;
import com.qbo.repository.ClienteRepository;

@Service
public class ClienteService implements BaseService<Cliente> {

	@Autowired
	ClienteRepository clienteRepository;
	
	@Override
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}



	@Override
	public Cliente save(Cliente entity) {
		return clienteRepository.save(entity);
	}
	
	

	

}
