package br.com.universidadexyz.beans;

public class Curso {
	
	private String descricao;
	private float valor;
	private short cargaHoraria;
	private String sigla;
	private int id;
	private int duracao;
	
	
	public Curso() {
		super();
	}

	public Curso(String descricao, float valor, short cargaHoraria, String sigla, int id, int duracao) {
		super();
		this.descricao = descricao;
		this.valor = valor;
		this.cargaHoraria = cargaHoraria;
		this.sigla = sigla;
		this.id = id;
		this.duracao = duracao;
	}

	public void setAll(String descricao, float valor, short cargaHoraria, String sigla, int id, int duracao) {
		this.descricao = descricao;
		this.valor = valor;
		this.cargaHoraria = cargaHoraria;
		this.sigla = sigla;
		this.id = id;
		this.duracao = duracao;
	}
	
	public float getPromocao() {
		return valor * (1 - 10/100);
	}
	
	public float getPromocao(float porcentagem) {
		if(porcentagem > 0 && porcentagem < 100) {
			return valor * (1 - porcentagem/100);
		}
		return valor;
	}
	
	public void AjustarValor(float porcentagem) {
		if(porcentagem > 0 && porcentagem < 100) {
			this.valor *= (1 + porcentagem/100);
		}
	}
	
	public String getAll() {
		return String.format("Descrição: %s"
				+ "\nValor: %.2f"
				+ "\nCarga horária: %d"
				+ "\nSigla: %s"
				+ "\nId: %d"
				+ "\nDuração: %d", descricao, valor, cargaHoraria, sigla, id, duracao);
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public short getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(short cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
}
