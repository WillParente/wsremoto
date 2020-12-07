package br.com.universidadexyz.implementacao;

import br.com.universidadexyz.beans.Endereco;
import br.com.universidadexyz.beans.Professor;

public class ImplementarProfessor {

	public static void main(String[] args) {

		Professor p = new Professor(
				1,
				"1berto",
				"Ms",
				10,
				new Endereco(
						"RUA LAGO DE PEDRA",
						"44",
						"Complementos",
						"PIMENTAS",
						"GUARULHOS",
						"SP",
						"12345-123"
						)
				);

		System.out.println("Bairro: " + p.getEndereco().getBairro());
	}
}
