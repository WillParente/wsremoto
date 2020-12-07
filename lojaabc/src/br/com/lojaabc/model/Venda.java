package br.com.lojaabc.model;

public class Venda {
	
	private int notaFiscal;
	private Produto produto;
	private Cliente cliente;
	private int qtde;
	private float total;
	
	public float CalcularTotal() {
		if(cliente.isEspecial()) {
			return produto.getValorVenda() * (float)0.95;
		}
		return produto.getValorVenda();
	}
	
	public Venda(int notaFiscal, Produto produto, Cliente cliente, int qtde, float total) {
		super();
		this.notaFiscal = notaFiscal;
		this.produto = produto;
		this.cliente = cliente;
		this.qtde = qtde;
		this.total = total;
	}

	public Venda() {
		super();
	}

	@Override
	public String toString() {
		return "Venda [notaFiscal=" + notaFiscal + ", produto=" + produto + ", cliente=" + cliente + ", qtde=" + qtde
				+ ", total=" + total + "]";
	}

	public int getNotaFiscal() {
		return notaFiscal;
	}

	public void setNotaFiscal(int notaFiscal) {
		this.notaFiscal = notaFiscal;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public void setAll(int notaFiscal, Produto produto, Cliente cliente, int qtde, float total) {
		this.notaFiscal = notaFiscal;
		this.produto = produto;
		this.cliente = cliente;
		this.qtde = qtde;
		this.total = total;
	}

}
