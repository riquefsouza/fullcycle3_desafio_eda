package br.com.desafioeda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.desafioeda.model.TransactionWallet;

public interface TransactionWalletRepository extends JpaRepository<TransactionWallet, String> {

}
