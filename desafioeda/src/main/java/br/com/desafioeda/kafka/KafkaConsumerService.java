package br.com.desafioeda.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import br.com.desafioeda.dto.BalanceMessage;
import br.com.desafioeda.dto.TransactionMessage;
import br.com.desafioeda.model.AccountMicroservice;
import br.com.desafioeda.model.TransactionMicroservice;
import br.com.desafioeda.repository.AccountMicroserviceRepository;
import br.com.desafioeda.repository.TransactionMicroserviceRepository;

@Service
public class KafkaConsumerService {

/*
TRANSACTIONS Received message:
{
    "Name":"TransactionCreated",
    "Payload":{
        "id":"73f8711f-a4a6-4cdb-be54-8bc91b8e8f7c",
        "account_id_from":"4ecd293a-a0d6-4133-ad0b-401e319ba085",
        "account_id_to":"70a4f02a-320f-4a4a-b600-67e159984a78",
        "amount":1
    }
}

BALANCES Received message:
{
    "Name":"BalanceUpdated",
    "Payload":{
        "account_id_from":"4ecd293a-a0d6-4133-ad0b-401e319ba085",
        "account_id_to":"70a4f02a-320f-4a4a-b600-67e159984a78",
        "balance_account_id_from":999,
        "balance_account_id_to":1001
    }
}
*/
/*
    @KafkaListener(topics = "balances", groupId = "group_id")
    public void listenBalances(String message) {
        System.out.println("BALANCES Received message: " + message);
    }
    
    @KafkaListener(topics = "transactions", groupId = "group_id")
    public void listenTransactions(String message) {
        System.out.println("TRANSACTIONS Received message: " + message);
    }
 */

    @Autowired
	private AccountMicroserviceRepository accountMicroserviceRepository;

    @Autowired
	private TransactionMicroserviceRepository transactionMicroserviceRepository;


    @KafkaListener(topics = "balances",
        containerFactory = "balanceKafkaListenerContainerFactory")
    public void balanceListener(BalanceMessage balanceMessage) {
        System.out.println("BALANCE Received message: " + balanceMessage.toString());

        String clientIdFrom = accountMicroserviceRepository.getClientIdByAccountId(
            balanceMessage.getPayload().getAccountIdFrom());

        if (clientIdFrom!=null && !clientIdFrom.isEmpty()){
            AccountMicroservice accountMSFrom = new AccountMicroservice(
                balanceMessage.getPayload().getAccountIdFrom(), 
                clientIdFrom, 
                balanceMessage.getPayload().getBalanceAccountIdFrom());
    
            accountMicroserviceRepository.save(accountMSFrom);
            System.out.println("BALANCE FROM SAVE");
        }

        String clientIdTo = accountMicroserviceRepository.getClientIdByAccountId(
            balanceMessage.getPayload().getAccountIdTo());

        if (clientIdTo!=null && !clientIdTo.isEmpty()){
            AccountMicroservice accountMSTo = new AccountMicroservice(
                balanceMessage.getPayload().getAccountIdTo(), 
                clientIdTo, 
                balanceMessage.getPayload().getBalanceAccountIdTo());

            accountMicroserviceRepository.save(accountMSTo);
            System.out.println("BALANCE TO SAVE");
        }
    }

    @KafkaListener(topics = "transactions",
        containerFactory = "transactionKafkaListenerContainerFactory")
    public void transactionListener(TransactionMessage transactionMessage) {
        System.out.println("TRANSACTION Received message: " + transactionMessage.toString());

        if (!transactionMicroserviceRepository.existsById(transactionMessage.getPayload().getId())){
            
            TransactionMicroservice transactionMS = new TransactionMicroservice(
                transactionMessage.getPayload().getId(),
                transactionMessage.getPayload().getAccountIdFrom(),
                transactionMessage.getPayload().getAccountIdTo(),
                transactionMessage.getPayload().getAmount());
    
            transactionMicroserviceRepository.save(transactionMS);

            System.out.println("TRANSACTION SAVE");
        }

    }
}
