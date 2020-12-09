package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteList {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();
		lista.add("ANALISTA");
		lista.add("ESTAGIARIO");
		lista.add("DBA JR");
		lista.add("DBA SR");
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println("Ordenada: " + lista);
		System.out.println("Segundo elemento: " + lista.get(1));
		lista.remove(1);
		System.out.println("Segundo elemento removido: " + lista);
		for(int cont = 0; cont < lista.size(); cont++) {
			System.out.println("Cargo " + (cont+1) + " é " + lista.get(cont));
		}
		
		List lista2 = new ArrayList();
		lista2.add("DBA");
		lista2.add("JR");
		lista2.add(15000);
		
		lista2.add("DBA");
		lista2.add("SR");
		lista2.add(25000);
		
		lista2.add("DBA");
		lista2.add("PL");
		lista2.add(25000);
	}

}
