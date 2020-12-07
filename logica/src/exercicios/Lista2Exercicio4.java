package exercicios;

import javax.swing.JOptionPane;

public class Lista2Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Escreva um código que leia três valores inteiros e diferentes e mostre-os em ordem decrescente
		 */

		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor 1?"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor 2?"));
		int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor 2?"));
		int maiorValor = 0;
		int intermedValor = 0;
		int menorValor = 0;
		String message;

		if(valor1 != valor2 && valor1 != valor3 && valor2 != valor3) {
			if(valor1 > valor2) {

				if(valor1 > valor3) {
					maiorValor = valor1;

					if(valor2 > valor3) {
						intermedValor = valor2;
						menorValor = valor3;
					} else {
						intermedValor = valor3;
						menorValor = valor2;
					}
				}
				else {
					maiorValor = valor3;
					intermedValor = valor2;
					menorValor = valor1;
				}
			} 
			else { 
				if(valor2 > valor3) {
					maiorValor = valor2;

					if(valor1 > valor3) {
						intermedValor = valor1;
						menorValor = valor3;
					} else {
						intermedValor = valor3;
						menorValor = valor1;
					}
				}
				else {
					maiorValor = valor3;
					intermedValor = valor2;
					menorValor = valor1;
				}
			}
			message = "Maior valor: " + maiorValor + "\n" + "Médio valor: " + intermedValor + "\n" + "Menor valor: " + menorValor;
		} else {
			message = "Existem valores iguais";
		}

		System.out.println(message);
		JOptionPane.showMessageDialog(null, message);
	}
}