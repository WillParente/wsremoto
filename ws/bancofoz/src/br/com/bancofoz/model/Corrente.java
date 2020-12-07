package br.com.bancofoz.model;

public class Corrente extends Conta {
	
	private float limite;
	private float taxa;
		
	public Corrente() {
		super();
	}

	public Corrente(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limite, float taxa) {
		super(numero, digito, agencia, saldo, cliente);
		this.limite = limite;
		this.taxa = taxa;
	}

	@Override
	public String toString() {
		return "Corrente [limite=" + limite + ", taxa=" + taxa + "]";
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}
	
	public boolean sacar(float valor) {
		return super.sacar(valor);
	}
	
	public float verificarSaldo() {
		return super.getSaldo() + limite;
	}
	
	public void debitarTaxa() {
		if((super.getSaldo() - taxa)  > 0) {
			//super.sacar(taxa);
			super.setSaldo(super.getSaldo() - taxa);
		}
	}
	
	public void aumentarLimite(float porc) {
		if(porc > 0 && porc < 100) {
			limite *= 1 + (porc/100);
		}
	}

}
