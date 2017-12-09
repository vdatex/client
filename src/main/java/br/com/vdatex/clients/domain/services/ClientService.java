package br.com.vdatex.clients.domain.services;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.vdatex.clients.domain.model.Client;
import br.com.vdatex.clients.domain.repository.ClientRepository;

@Component
@Transactional
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	public Client create(final Client client) {
		client.setId(UUID.randomUUID());
		return clientRepository.save(client);
	}
	
	public Iterable<Client> list() {
		return clientRepository.findAll();
	}

}
