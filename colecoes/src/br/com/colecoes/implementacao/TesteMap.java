package br.com.colecoes.implementacao;

import java.util.HashMap;
import java.util.Map;

import br.com.colecoes.beans.Cargo;

public class TesteMap {

	public static void main(String[] args) {
		
		Map<Integer, Cargo> lista = new HashMap<Integer, Cargo>();
		lista.put(1, new Cargo("DEV", "JR", 4000));
		lista.put(2, new Cargo("DEV", "PL", 7000));
		lista.put(3, new Cargo("DEV", "SR", 10000));
		
		System.out.println(lista);
		System.out.println("Chaves: " + lista.keySet());
		System.out.println("Valores: " + lista.values());
		
		for(Cargo objeto : lista.values()) {
			System.out.println(objeto.getNome());
			System.out.println(objeto.getNivel());
		}
	}

}
