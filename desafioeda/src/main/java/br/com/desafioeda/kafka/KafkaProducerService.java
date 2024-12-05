package br.com.desafioeda.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import br.com.desafioeda.dto.BalanceMessage;

@Service
public class KafkaProducerService {

    @Autowired
    private KafkaTemplate<String, BalanceMessage> balanceKafkaTemplate;

    public void sendBalanceMessage(BalanceMessage balanceMessage) {
        balanceKafkaTemplate.send("balances", balanceMessage);
    }
}
