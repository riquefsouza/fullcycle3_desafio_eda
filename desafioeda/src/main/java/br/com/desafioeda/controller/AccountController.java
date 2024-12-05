package br.com.desafioeda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafioeda.dto.BalanceDto;
import br.com.desafioeda.service.AccountMicroserviceService;
import br.com.desafioeda.service.AccountWalletService;

@RestController
@RequestMapping("/balances")
public class AccountController {

    //@Autowired
    //private KafkaProducerService kafkaProducerService;

    @Autowired
	private AccountWalletService accountWalletService;

    @Autowired
	private AccountMicroserviceService accountMicroserviceService;

    private String saida;
/*
    @GetMapping("/send")
    public String sendMessage(@RequestParam("message") String message) {
        kafkaProducerService.sendBalanceMessage(message);
        return "Message sent to Kafka topic";
    }
 */
    @GetMapping("{account_id}")
    public ResponseEntity<String> get(@PathVariable String account_id) {
    
        List<BalanceDto> listaBalances = accountWalletService.balanceByAccountId(account_id);
        List<BalanceDto> listaMSBalances = accountMicroserviceService.balanceByAccountId(account_id);

        if (listaBalances.isEmpty()){
            return ResponseEntity.ok("Sem Clientes e Saldos no banco WALLET");
        } else {
            saida = "WALLET<br><br>";
            listaBalances.forEach(item -> {
                saida += "Cliente: " + item.getName() + " ("+item.getEmail()+"), Saldo: " + item.getBalance() + "<br>";
            });
        }

        if (listaMSBalances.isEmpty()){
            return ResponseEntity.ok("Sem Clientes e Saldos no banco MICROSERVICE");
        } else {
            saida += "<br><br>MICROSERVICE<br><br>";
            listaBalances.forEach(item -> {
                saida += "Cliente: " + item.getName() + " ("+item.getEmail()+"), Saldo: " + item.getBalance() + "<br>";
            });
        }

        return ResponseEntity.ok(saida);
    }

    @GetMapping()
    public ResponseEntity<String> getAll() {
    
        List<BalanceDto> listaBalances = accountWalletService.balance();
        List<BalanceDto> listaMSBalances = accountMicroserviceService.balance();

        if (listaBalances.isEmpty()){
            return ResponseEntity.ok("Sem Clientes e Saldos no banco WALLET");
        } else {
            saida = "WALLET<br><br>";
            listaBalances.forEach(item -> {
                saida += "Cliente: " + item.getName() + " ("+item.getEmail()+"), Saldo: " + item.getBalance() + "<br>";
            });
        }

        if (listaMSBalances.isEmpty()){
            return ResponseEntity.ok("Sem Clientes e Saldos no banco MICROSERVICE");
        } else {
            saida += "<br><br>MICROSERVICE<br><br>";
            listaBalances.forEach(item -> {
                saida += "Cliente: " + item.getName() + " ("+item.getEmail()+"), Saldo: " + item.getBalance() + "<br>";
            });
        }

        return ResponseEntity.ok(saida);
    }
}
