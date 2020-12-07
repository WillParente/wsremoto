package br.com.concessionariarubinho.modelo;

public class CarroFormula1 {
	private String cor;
	private float valor;
	private String escuderia;
	private float velocidade;
	private boolean status;


	public void preencherEscuderai(String param) {
		escuderia = param.toUpperCase();
	}

	public void preencherCor(String param) {
		cor = param.toUpperCase();
	}

	public void preencherValor(float param) {
		if(param > 0) {
			valor = param;
		}
	}

	public String retornarEscuderia() {
		return escuderia;
	}

	public String retornarCor() {
		return cor;
	}

	public float retornarValor() {
		return valor;
	}

	public String ligar() {
		if(status == true) {
			return "Carro já estava ligado!";
		}
		status = true;
		return "Carro ligado agora!";
	}

	public String desligar() {
		if(status == false) {
			return "Carro já estava desligado!";
		}
		status = false;
		return "Carro desligado!";
	}

	public void acelerar(float param) {
		if(param > 0 && status == true) {
			velocidade += param;
		}
	}
	
	public void brecar(float param) {
		if(status == true) {
			velocidade = 0;
		}
	}
	
	public float retornarVelocidade() {
		return velocidade;
	}
}
