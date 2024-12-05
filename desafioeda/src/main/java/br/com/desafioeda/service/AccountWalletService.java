package br.com.desafioeda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafioeda.dto.BalanceDto;
import br.com.desafioeda.repository.AccountWalletRepository;

@Service
public class AccountWalletService {

    @Autowired
	private AccountWalletRepository repository;

    public List<BalanceDto> balanceByAccountId(String accountId){
        return repository.balanceByAccountId(accountId);
    }

    public List<BalanceDto> balance(){
        return repository.balance();
    }

}
