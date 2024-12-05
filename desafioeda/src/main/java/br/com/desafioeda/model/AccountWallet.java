package br.com.desafioeda.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name="accounts", catalog = "wallet")
public class AccountWallet implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id	
	@Column(name="id")
    private String id;

	@Column(name="client_id")
    private String clientId;

    @Column(name="balance")
    private Integer balance;

    @Temporal(TemporalType.DATE)
    @Column(name="created_at")
    private Date createdAt;

    public AccountWallet() {
        super();
    }
 
    public AccountWallet(String id, String clientId, Integer balance) {
        this.id = id;
        this.clientId = clientId;
        this.balance = balance;
        this.createdAt = new Date();
    }

}
