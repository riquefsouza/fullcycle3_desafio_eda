package br.com.desafioeda.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class BalanceMessage {

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Payload")
    private BalancePayload payload;

}
