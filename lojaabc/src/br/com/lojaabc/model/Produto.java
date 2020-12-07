package br.com.lojaabc.model;

public class Produto {
	
	private int id;
	private String descricao;
	private float valorCompra;
	private float valorVenda;
	private int qtde;
	private Fabricante fabricante;
	
	public void AtualizarValores(float porcentagem) {
		if(porcentagem > 0 && porcentagem < 100) {
			valorCompra *= (1 + porcentagem/100);
			valorVenda= (1 + porcentagem/100);
		}
	}
	
	public String VerificarEstoque() {
		if(qtde < 5) {
			return "Estoque baixo";
		}
		return "Estoque ok!";
	}
	
	public float CalcularTotal() {
		return valorCompra;
	}
	
	public Produto(int id, String descricao, float valorCompra, float valorVenda, int qtde, Fabricante fabricante) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
		this.qtde = qtde;
		this.fabricante = fabricante;
	}

	public Produto() {
		super();
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", valorCompra=" + valorCompra + ", valorVenda="
				+ valorVenda + ", qtde=" + qtde + ", fabricante=" + fabricante + "]";
	}

	public void setAll(int id, String descricao, float valorCompra, float valorVenda, int qtde, Fabricante fabricante) {
		this.id = id;
		this.descricao = descricao;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
		this.qtde = qtde;
		this.fabricante = fabricante;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}

	public float getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
}