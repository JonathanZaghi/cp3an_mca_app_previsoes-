package br.com.joe.Exercicio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_cidades")
public class Cidades {

	@OneToMany
	private Previsao previsao;
	
	
	@Id@GeneratedValue
	private long id;
	
	@Column
	private String nomeCidade;
	
	@Column
	private long lat;
	
	@Column
	private long lon;

	public Previsao getPrevisao() {
		return previsao;
	}

	public void setPrevisao(Previsao previsao) {
		this.previsao = previsao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public long getLat() {
		return lat;
	}

	public void setLat(long lat) {
		this.lat = lat;
	}

	public long getLon() {
		return lon;
	}

	public void setLon(long lon) {
		this.lon = lon;
	}
	
	
}
