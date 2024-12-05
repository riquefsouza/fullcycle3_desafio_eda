package br.com.desafioeda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.desafioeda.dto.BalanceDto;
import br.com.desafioeda.model.AccountMicroservice;

public interface AccountMicroserviceRepository extends JpaRepository<AccountMicroservice, String> {

  @Query(
    """
    SELECT c.id
    FROM ClientMicroservice c, AccountMicroservice a
    WHERE c.id=a.clientId
    AND a.id = :accountId
    """
  )
  public String getClientIdByAccountId(
    @Param("accountId") String accountId
  );

  @Query(
    """
    SELECT new br.com.desafioeda.dto.BalanceDto(
      c.name, c.email, a.balance
    )
    FROM ClientMicroservice c, AccountMicroservice a
    WHERE c.id=a.clientId
    AND a.id = :accountId
    """
  )
  public List<BalanceDto> balanceByAccountId(
    @Param("accountId") String accountId
  );

  @Query(
    """
    SELECT new br.com.desafioeda.dto.BalanceDto(
      c.name, c.email, a.balance
    )
    FROM ClientMicroservice c, AccountMicroservice a
    WHERE c.id=a.clientId
    """
  )
  public List<BalanceDto> balance();

}
