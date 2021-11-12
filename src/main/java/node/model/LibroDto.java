package node.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LibroDto {
	@JsonProperty("LibroResponse")
	
 
	private String id;

	private String titolo;
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
