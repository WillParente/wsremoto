package br.com.bancofoz.model;

public class Poupanca extends Conta {
	
	private float rendimento;

	public Poupanca() {
		super();
	}

	public Poupanca(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		super(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}

	@Override
	public String toString() {
		return "Poupanca [rendimento=" + rendimento + "]";
	}

	public float getRendimento() {
		return rendimento;
	}

	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}
	
	public void creditarRendimentos() {
		super.depositar(rendimento);
	}
	
	public float verificarSaldo() {
		return super.getSaldo();
	}

}
