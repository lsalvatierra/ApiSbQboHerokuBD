package com.qbo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.qbo.model.Cliente;
import com.qbo.service.ClienteService;

@RestController
@RequestMapping(path = "api/v1/cliente")
public class ClienteController {

	@Autowired
	protected ClienteService servicio;

	@GetMapping("")
	public ResponseEntity<List<Cliente>> getAll() {
		List<Cliente> clientes = new ArrayList<Cliente>();
		servicio.findAll().forEach(clientes::add);
		if (clientes.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(clientes, HttpStatus.OK);
	}

	@PostMapping("")
	public ResponseEntity<Cliente> createTutorial(@RequestBody Cliente cliente) {
		Cliente _cliente = servicio.save(cliente);
		return new ResponseEntity<>(_cliente, HttpStatus.CREATED);
	}


}
