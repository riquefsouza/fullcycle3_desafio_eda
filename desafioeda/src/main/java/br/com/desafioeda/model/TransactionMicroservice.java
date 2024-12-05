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
@Table(name="transactions", catalog = "microservice")
public class TransactionMicroservice implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id	
	@Column(name="id")
    private String id;
    
	@Column(name="account_id_from")
    private String accountIdFrom;

    @Column(name="account_id_to")
    private String accountIdTo;

    @Column(name="amount")
    private Integer amount;

    @Temporal(TemporalType.DATE)
    @Column(name="created_at")
    private Date createdAt;

    public TransactionMicroservice() {
        super();
    }

    public TransactionMicroservice(String id, String accountIdFrom, String accountIdTo, Integer amount) {
        this.id = id;
        this.accountIdFrom = accountIdFrom;
        this.accountIdTo = accountIdTo;
        this.amount = amount;
        this.createdAt = new Date();
    }

}
