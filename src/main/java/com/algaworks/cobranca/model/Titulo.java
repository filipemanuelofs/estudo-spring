package com.algaworks.cobranca.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.algaworks.cobranca.enums.StatusTituloEnum;

@Entity
public class Titulo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idTitulo;
	
	private String descricao;
	
	private BigDecimal valor;
	
	@Temporal(TemporalType.DATE)
	private Date dataVencimento;
	
	@Enumerated(EnumType.STRING)
	private StatusTituloEnum statusTitulo;

	public Long getIdTitulo() {
		return idTitulo;
	}

	public void setIdTitulo(Long idTitulo) {
		this.idTitulo = idTitulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public StatusTituloEnum getStatusTitulo() {
		return statusTitulo;
	}

	public void setStatusTitulo(StatusTituloEnum statusTitulo) {
		this.statusTitulo = statusTitulo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTitulo == null) ? 0 : idTitulo.hashCode());
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
		Titulo other = (Titulo) obj;
		if (idTitulo == null) {
			if (other.idTitulo != null)
				return false;
		} else if (!idTitulo.equals(other.idTitulo))
			return false;
		return true;
	}
	
	
	
}
