package com.algaworks.cobranca.model;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.thymeleaf.util.DateUtils;

import com.algaworks.cobranca.enums.StatusTituloEnum;

@Entity
@Table(name="tb_titulo")
public class Titulo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_titulo")
	private Long idTitulo;
	
	@Column(name="st_descricao")
	private String descricao;
	
	@NumberFormat(pattern="#,##0.00")
	@Column(name="nm_valor")
	private BigDecimal valor;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	@Column(name="dt_vencimento")
	private Date dataVencimento;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	@Column(name="dt_criacao")
	private Date dataCriacao;

	@Enumerated(EnumType.STRING)
	@Column(name="en_status_titulo")
	private StatusTituloEnum statusTitulo;
	
	
	
	public Titulo() {
		setDataCriacao(DateUtils.createNow().getTime());
	}

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

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
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
