package br.usjt.hellospringboot.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Previsao implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue 
	private Long id;
	private String dia;
	private Double temperatura;
	public Long getId() {
		return id;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public Double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
	
	
	}
