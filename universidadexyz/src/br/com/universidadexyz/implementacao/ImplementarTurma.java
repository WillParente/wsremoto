package br.com.universidadexyz.implementacao;

import br.com.universidadexyz.beans.Aluno;
import br.com.universidadexyz.beans.Curso;
import br.com.universidadexyz.beans.Endereco;
import br.com.universidadexyz.beans.Professor;
import br.com.universidadexyz.beans.Turma;

public class ImplementarTurma {

	public static void main(String[] args) {

		Aluno a = new Aluno(
				1,
				"Fulano",
				"12312"
				);

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

		Curso c = new Curso(
				"Programação", 
				(float)120.00, 
				(short)5, 
				"prog", 
				1, 
				5
				);

		Turma t = new Turma(
				1,
				a,
				p,
				c,
				"manhã",
				"sala 3"
				);
		
		System.out.println(t.getPeriodo());
	}
}
