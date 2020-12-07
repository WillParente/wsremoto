package br.com.lojaabc.test;

import br.com.lojaabc.model.Cliente;
import br.com.lojaabc.model.PessoaFisica;
import br.com.lojaabc.model.PessoaJuridica;
import br.com.lojaabc.util.Magic;

public class ImplementarCliente2 {

	public static void main(String[] args) {

		char opcao = Magic.s("Digite F  para pessoa Fisica").charAt(0);
		Cliente cliente = null;
		if(opcao == 'F') {
			cliente = new PessoaFisica(
					Magic.i("ID"),
					Magic.s("Nome"),
					Magic.s("Email"),
					Magic.b("Especial?"),
					Magic.s("CPF"),
					Magic.s("RG"),
					Magic.s("Nascimento")
					);
		} else {
			cliente = new PessoaJuridica(
					Magic.i("ID"),
					Magic.s("Nome"),
					Magic.s("Email"),
					Magic.b("Especial?"),
					Magic.s("CNPJ"),
					Magic.s("Contato")
					);
		}
		
		System.out.println(cliente.toString());
		if(cliente instanceof PessoaJuridica) {
			System.out.println("Gravar na tabela Juridica");
		} else if (cliente instanceof PessoaFisica) {
			System.out.println("Gravar na tabela Física");
		}
	}

}
