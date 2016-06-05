package com.algaworks.cobranca.enums;

public enum StatusTituloEnum {
	
	PENDENTE("Pendente"),
	RECEBIDO("Recebido");
	
	private String descricao;
	
	private StatusTituloEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	

}
