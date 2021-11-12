package node.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AUTORE")
public class AutoreEntity {

	@Id
    @Column(name="ID")
    private String id;
     
    @Column(name="NOME")
    private String nome;
    
    @Column(name="COGNOME")
    private String cognome;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

    
	
}
