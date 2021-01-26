package com.eleonardo.sbpay;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class DadosCartao {

	@Pattern(regexp = "\\d{16}", message = "O n�mero do cart�o � inv�lido!")
	@NotNull(message = "� preciso enviar os Dados do Cart�o!")
	@NotBlank(message = "� preciso enviar os Dados do Cart�o!")
	private String numCartao;

	public String getNumCartao() {
		return numCartao;
	}

	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}
}
