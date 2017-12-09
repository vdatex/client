package br.com.vdatex.clients.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vdatex.clients.domain.model.Client;
import br.com.vdatex.clients.domain.services.ClientService;

@RestController
@RequestMapping("/api/v1/clients")
public class ClientControllerV1 {
	
	@Autowired
	private ClientService clientService;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Iterable<Client> list() {
		return clientService.list();
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Client create(final @RequestBody Client client) {
		return clientService.create(client);
	}
}
