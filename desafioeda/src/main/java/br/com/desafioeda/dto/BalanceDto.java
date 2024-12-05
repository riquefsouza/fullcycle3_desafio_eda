package br.com.desafioeda.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class BalanceDto implements Serializable {

  private static final long serialVersionUID = 1L;

  private String name;
  private String email;
  private Integer balance;
  
  public BalanceDto(String name, String email, Integer balance) {
    this.name = name;
    this.email = email;
    this.balance = balance;
  }
  
}
