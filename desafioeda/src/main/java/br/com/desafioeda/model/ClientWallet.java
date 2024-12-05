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
@Table(name="clients", catalog = "wallet")
public class ClientWallet implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id	
	@Column(name="id")
    private String id;
    
	@Column(name="name")
    private String name;

    @Column(name="email")
    private String email;

    @Temporal(TemporalType.DATE)
    @Column(name="created_at")
    private Date createdAt;

    public ClientWallet() {
        super();
    }

    public ClientWallet(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.createdAt = new Date();
    }

}
