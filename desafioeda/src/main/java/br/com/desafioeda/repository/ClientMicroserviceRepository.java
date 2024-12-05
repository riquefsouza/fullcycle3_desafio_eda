package br.com.desafioeda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.desafioeda.model.ClientMicroservice;

public interface ClientMicroserviceRepository extends JpaRepository<ClientMicroservice, String> {

}
