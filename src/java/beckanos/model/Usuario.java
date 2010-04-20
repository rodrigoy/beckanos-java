package beckanos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column (length = 50, nullable = false)
	String nome;

	@Column (length = 15, nullable = false)
	String login;
	
	@Column (length = 50)
	String email;
	
	@Column (length = 10, nullable = false)
	String senha;

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}
	
	public String getLogin() {
		return login;
	}
}