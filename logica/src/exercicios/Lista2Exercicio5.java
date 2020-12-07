package exercicios;

import javax.swing.JOptionPane;

public class Lista2Exercicio5 {

	public static void main(String[] args) {
		/*
		 * A nota final de um estudante é calculada a partir de três notas atribuídas, respectivamente, a um 
		 * trabalho de laboratório, a uma avaliação semestral e a um exame final. A média das três notas 
		 * mencionadas obedece os pesos a seguir:
		 */

		float notaTrabalho = Float.parseFloat(JOptionPane.showInputDialog("Qual a nota do trabalho?"));
		float notaAvaliacao = Float.parseFloat(JOptionPane.showInputDialog("Qual a nota do avaliação?"));
		float notaExame = Float.parseFloat(JOptionPane.showInputDialog("Qual a nota do exame?"));
		float media = ((notaTrabalho * 2) + (notaAvaliacao * 3) + (notaExame * 5))/10;
		String message = "Média: " + media + " - Conceito: ";
		
		if(media >= 8.0) {
			message += "A"; 
		} else if(media >= 7.0) {
			message += "B"; 
		} else if(media >= 6.0) {
			message += "C"; 
		} else if(media >= 5.0) {
			message += "D"; 
		} else {
			message += "E"; 
		}
		
		System.out.println(message);
		JOptionPane.showMessageDialog(null, message);		
	}
}