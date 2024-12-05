package br.com.desafioeda.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class BalancePayload {

    @JsonProperty("account_id_from")
    private String accountIdFrom;

    @JsonProperty("account_id_to")
    private String accountIdTo;
    
    @JsonProperty("balance_account_id_from")
    private Integer balanceAccountIdFrom;

    @JsonProperty("balance_account_id_to")
    private Integer balanceAccountIdTo;
}
