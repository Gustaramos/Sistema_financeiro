package com.algaworks.curso.fjoo.treinador;

import com.algaworks.curso.fjoo.animal.Cachorro;

public class Treinador {	
	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		c.setNome("Zoe");
		
		DonoCachorro dono = new DonoCachorro();
		dono.ensinarCachorroSentar(c);
		
	}

}
