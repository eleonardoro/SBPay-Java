package com.eleonardo.sbpay;

public enum StatusPagamento {

	Autorizado("Autorizado!"), NaoAutorizado("N�o autorizado pela institui��o financeira!"), CartaoInvalido("Cart�o Inv�lido ou Bloqueado!");

	String descricao;

	StatusPagamento(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return this.descricao;
	}
}
