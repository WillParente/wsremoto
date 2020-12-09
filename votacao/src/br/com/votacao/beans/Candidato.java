package br.com.votacao.beans;

public class Candidato extends Pessoa {
	
	private int numero;
	private String cargo;
	private String partido;
	
	public Candidato(String nome, int numero, String cargo, String partido) {
		super(nome);
		this.numero = numero;
		this.cargo = cargo;
		this.partido = partido;
	}

	public Candidato() {
		super();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	@Override
	public String toString() {
		return "Candidato [numero=" + numero + ", cargo=" + cargo + ", partido=" + partido + "]";
	}

}
