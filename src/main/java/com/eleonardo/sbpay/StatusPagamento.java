package com.eleonardo.sbpay;

public enum StatusPagamento {

	Autorizado("Autorizado!"), NaoAutorizado("Não autorizado pela instituição financeira!"), CartaoInvalido("Cartão Inválido ou Bloqueado!");

	String descricao;

	StatusPagamento(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return this.descricao;
	}
}
