package br.com.desafioeda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.desafioeda.model.ClientWallet;

public interface ClientWalletRepository extends JpaRepository<ClientWallet, String> {

}
