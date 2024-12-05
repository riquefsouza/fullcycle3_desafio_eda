package br.com.desafioeda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.desafioeda.model.TransactionMicroservice;

public interface TransactionMicroserviceRepository extends JpaRepository<TransactionMicroservice, String> {

}
