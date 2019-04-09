package br.com.joe.Exercicio.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_previsao")
public class Previsao implements Serializable {
	
	@OneToOne(optional=false)
	@JoinColumn(name="id_dia_semana")
	private DiaSemana diaSemana;

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double tempMin;
	private Double tempMax;
	private Double humidade;
	private String descr;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getTempMin() {
		return tempMin;
	}
	public void setTempMin(Double tempMin) {
		this.tempMin = tempMin;
	}
	public Double getTempMax() {
		return tempMax;
	}
	public void setTempMax(Double tempMax) {
		this.tempMax = tempMax;
	}
	public Double getHumidade() {
		return humidade;
	}
	public void setHumidade(Double humidade) {
		this.humidade = humidade;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public DiaSemana getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(DiaSemana diaSemana) {
		this.diaSemana = diaSemana;
	}
	
	@Override
	public String toString() {
		return "Previsao [diaSemana=" + diaSemana + ", id=" + id + ", tempMin=" + tempMin + ", tempMax=" + tempMax
				+ ", humidade=" + humidade + ", descr=" + descr
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descr == null) ? 0 : descr.hashCode());
		result = prime * result + ((diaSemana == null) ? 0 : diaSemana.hashCode());
		result = prime * result + ((humidade == null) ? 0 : humidade.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((tempMax == null) ? 0 : tempMax.hashCode());
		result = prime * result + ((tempMin == null) ? 0 : tempMin.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Previsao other = (Previsao) obj;
		if (descr == null) {
			if (other.descr != null)
				return false;
		} else if (!descr.equals(other.descr))
			return false;
		if (diaSemana == null) {
			if (other.diaSemana != null)
				return false;
		} else if (!diaSemana.equals(other.diaSemana))
			return false;
		if (humidade == null) {
			if (other.humidade != null)
				return false;
		} else if (!humidade.equals(other.humidade))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (tempMax == null) {
			if (other.tempMax != null)
				return false;
		} else if (!tempMax.equals(other.tempMax))
			return false;
		if (tempMin == null) {
			if (other.tempMin != null)
				return false;
		} else if (!tempMin.equals(other.tempMin))
			return false;
		return true;
	}
	
	
	

	
	
	
	
	
}