package exercicios;

import javax.swing.JOptionPane;

public class Lista2Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Um hotel cobra R$ 80,00 a diária e mais uma taxa de serviços. 
		 * A taxa de serviços é de: 
		 •	R$ 5,50 por diária, se o número de diárias for maior que 15; 
		 •  R$ 6,00 por diária, se o número de diárias for igual a 15; 
		 •	R$ 8,00 por diária, se o número de diárias for menor que 15.
		 *  Monte uma aplicação que apresente a conta do cliente.
		*/
		
		double precoDiaria = 80.00;
		int qtdeDiarias = Integer.parseInt(JOptionPane.showInputDialog("Quantas diárias?"));
		
		double taxaServico = qtdeDiarias > 15 ? 5.50 : qtdeDiarias == 15 ? 6.00 : 8.00;
		double checkout = qtdeDiarias * (precoDiaria + taxaServico);
		
		System.out.println("Conta total: " + checkout);
		JOptionPane.showMessageDialog(null, "Conta total: R$" + checkout);
	}
}