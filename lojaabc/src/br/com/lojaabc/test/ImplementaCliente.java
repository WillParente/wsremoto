package br.com.lojaabc.test;

import br.com.lojaabc.model.PessoaFisica;
import br.com.lojaabc.model.PessoaJuridica;
import br.com.lojaabc.util.Magic;

public class ImplementaCliente {

	public static void main(String[] args) {
		
		char opcao = Magic.s("Digite F  para pessoa Fisica").charAt(0);
		if(opcao == 'F') {
			PessoaFisica cliente = new PessoaFisica();
			cliente.setId(Magic.i("Código"));
			cliente.setNome(Magic.s("Nome"));
			cliente.setEmail(Magic.s("Email"));
			cliente.setEspecial(Magic.b("Cliente Especial?"));
			cliente.setCpf(Magic.s("CPF"));
			cliente.setRg(Magic.s("RG"));
			cliente.setNascimento(Magic.s("Nascimento"));
			System.out.println(cliente.toString());
		} else {
			PessoaJuridica cliente = new PessoaJuridica();
			cliente.setId(Magic.i("Código"));
			cliente.setNome(Magic.s("Nome"));
			cliente.setEmail(Magic.s("Email"));
			cliente.setEspecial(Magic.b("Cliente Especial?"));
			cliente.setCnpj(Magic.s("CNPJ"));
			cliente.setContato(Magic.s("Contato"));
		}
		
		
	}

}
