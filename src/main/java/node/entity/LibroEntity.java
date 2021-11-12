package node.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LIBRO")
public class LibroEntity {

	@Id
    @Column(name="ID")
    private String id;
     
    @Column(name="TITOLO")
    private String titolo;
    
    @Column(name="PAGINE")
    private String pagine;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getPagine() {
		return pagine;
	}

	public void setPagine(String pagine) {
		this.pagine = pagine;
	}



    
	
}
