package exercicios;

import javax.swing.JOptionPane;

public class Lista2Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Elabore uma aplicação que calcule o que deve ser pago por um produto, considerando o preço 
		 * normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir 
		 * para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado.
		 * 
		 */

		double valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto?"));
		short codigo = Short.parseShort(JOptionPane.showInputDialog("Qual o código da forma de pagamento?"));
		double checkout = 0;

		switch(codigo) {
		case 1:
			checkout = valorProduto * 0.9;
			break;
		case 2:
			checkout = valorProduto * 0.95;
			break;
		case 3:
			checkout = valorProduto;
			break;
		case 4:
			checkout = valorProduto * 1.1;
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida");
		}

		if(checkout > 0) {	
			System.out.println("Conta total: " + checkout);
			JOptionPane.showMessageDialog(null, "Conta total: R$ " + checkout);
		}
	}
}