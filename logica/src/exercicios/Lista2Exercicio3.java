package exercicios;

import javax.swing.JOptionPane;

public class Lista2Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Elabore uma aplicação que leia o valor de dois números inteiros e a operação aritmética desejada; 
		 * calcule, então, a resposta adequada. Utilize os símbolos da tabela a seguir para ler qual a operação 
		 * aritmética escolhida.
		 */

		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor 1?"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor 2?"));
		char operacao = JOptionPane.showInputDialog("Qual a opeacao aritmética?").charAt(0);
		int resultado = 0;
		String message = "";

		if(operacao == '+') {
			resultado = valor1 + valor2;
		}
		else if(operacao == '-') {
			resultado = valor1 - valor2;
		}
		else if(operacao == '*') {
			resultado = valor1 * valor2;
		}
		else if(operacao == '/') {
			resultado = valor1 / valor2;
		}
		else {
			message = "Operador \"" + operacao + "\" não é valido!";
		}


		if(message == "") {
			message = "Resultado: " + resultado;
		}

		System.out.println(message);
		JOptionPane.showMessageDialog(null, message);

	}
}