package br.com.elevador.modelo;

public class Elevador {

	private String nome;
	private short andarMaximo;
	private short andarMinimo;
	private byte capacidadePessoas;
	private byte qtdeAtual;
	private short andarAtual;


	public void definir(String pNome, short pAndarMax, short pAndarMin, byte pCapacidade) {
		nome = pNome;
		andarMaximo = pAndarMax;
		andarMinimo = pAndarMin;
		capacidadePessoas = pCapacidade;
		andarAtual = pAndarMin;
	}

	public void subir() {
		if(andarAtual < andarMaximo) {
			andarAtual++;
		}
	}

	public void descer() {
		if(andarAtual > andarMinimo) {
			andarAtual--;
		}
	}

	public String exibirDados() {
		return String.format("Nome do elevador: %s \nAndar atual: %s \nQuantidade atual de pessoas: %s", 
				nome, andarAtual, qtdeAtual);
	}

	public void entrar(byte pQtde) {
		if((qtdeAtual + pQtde) <= capacidadePessoas) {
			qtdeAtual += pQtde;
		}
	}
	
	public void sair(byte pQtde) {
		if((qtdeAtual - pQtde) >= 0) {
			qtdeAtual -= pQtde;
		}
	}
	
	public void subir(short andar) {
		if((andarAtual + andar) <= andarMaximo) {
			andarAtual+= andar;
		}
	}
	
	public void descer(short andar) {
		if((andarAtual - andar) >= andarMinimo) {
			andarAtual-= andar;
		}
	}
}