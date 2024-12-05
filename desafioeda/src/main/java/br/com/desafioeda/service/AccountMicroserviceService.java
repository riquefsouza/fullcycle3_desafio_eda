package br.com.desafioeda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafioeda.dto.BalanceDto;
import br.com.desafioeda.repository.AccountMicroserviceRepository;

@Service
public class AccountMicroserviceService {

    @Autowired
	private AccountMicroserviceRepository repository;

    public List<BalanceDto> balanceByAccountId(String accountId){
        return repository.balanceByAccountId(accountId);
    }

    public List<BalanceDto> balance(){
        return repository.balance();
    }

}
