package com.algaworks.curso.fjoo.sobreposicao;

import java.util.Date;

public class Produto {
	
	protected String descricao;
	public Date dataValidade;
	
	public void identificar() {
		System.out.println("Minha descrição é: " + descricao + ". ");
	}
	
	
}
