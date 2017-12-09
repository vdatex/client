package br.com.vdatex.clients.domain.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import br.com.vdatex.clients.domain.model.Client;

public interface ClientRepository extends CrudRepository<Client, UUID> {

}
