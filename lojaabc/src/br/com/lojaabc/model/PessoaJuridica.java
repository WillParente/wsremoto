package br.com.lojaabc.model;

public class PessoaJuridica extends Cliente {

	private String cnpj;
	private String contato;

	public String getChamado() {
		return
				"Nome: " + super.getNome()
			  + "Email: " + super.getEmail();
	}

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(int id, String nome, String email, boolean especial, String cnpj, String contato) {
		super(id, nome, email, especial);
		this.cnpj = cnpj;
		this.contato = contato;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", contato=" + contato + super.toString();
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}




}
