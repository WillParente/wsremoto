package br.com.votacao.principal;

import java.util.ArrayList;
import java.util.List;

import br.com.votacao.beans.Candidato;
import br.com.votacao.beans.Eleitor;
import br.com.votacao.beans.Urna;
import br.com.votacao.beans.Voto;

public class ImplementarVoto {

	public static void main(String[] args) {
		
		//Desafio 1
		List<Voto> votos = new ArrayList<Voto>();
		votos.add(new Voto(
				new Eleitor("Fulano", 1234, true),
				new Candidato("Falastrao", 12, "prefeito", "abc"),
				true
				));
		
		votos.add(new Voto(
				new Eleitor("Ciclano", 5678, true),
				new Candidato("Teste", 15, "vereador", "def"),
				true
				));
				
		Urna urna1 = new Urna(
				1,
				1,
				"São Paulo",
				votos
				);
		
		System.out.println(urna1.totalVotos());
		
		//Desafio 2
		List<Urna> urnas = new ArrayList<Urna>();
		
		List<Voto> votos2 = new ArrayList<Voto>();
		votos2.add(new Voto(
				new Eleitor("Fulano2", 1235, true),
				new Candidato("Falastrao", 12, "prefeito", "abc"),
				true
				));
		
		votos2.add(new Voto(
				new Eleitor("Ciclano2", 5679, true),
				new Candidato("Teste2", 22, "vereador", "mno"),
				true
				));
				
		Urna urna2 = new Urna(
				2,
				2,
				"São Paulo",
				votos2
				);
		
		urnas.add(urna1);
		urnas.add(urna2);
		
		System.out.println("Cidade: " + urna1.getCidade());
		System.out.println("Secao/Zona: " + urna1.getSecao() + "/" + urna1.getZona());
		System.out.println("Votos: ");
		for(Voto obj : urna1.getVotos()) {
			System.out.println("==================================");
			System.out.println("Npme do candidato: " + obj.getCandidato().getNome());
			System.out.println("Npme do eleitor: " + obj.getEleitor().getNome());
			System.out.println("Primeiro turno: " + obj.isPrimeiroTurno());
		}
		
	}

}
