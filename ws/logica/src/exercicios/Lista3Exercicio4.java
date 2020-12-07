package exercicios;

import javax.swing.JOptionPane;

public class Lista3Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Monte um programa que solicite a idade e o nome das pessoas. 
		 * Ao terminar, o programa deverá exibir a pessoa mais velha, a pessoa mais nova, 
		 * a quantidade de pessoas maiores de idade e a média entre as idades que foram digitadas.
		 */
		
		String nome;
		short idade;
		short maiorIdade = 0;
		short menorIdade = 0;
		String maisExperiente = "";
		String maisJovem = "";
		short totalMaiorIdade = 0;;
		float SomaIdades = 0;
		short cont = 0;
		
		do {
			nome = JOptionPane.showInputDialog("Nome");
			idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));
			
			if(idade > maiorIdade) {
				maiorIdade = idade;
				maisExperiente = nome;
			}
			if(idade < menorIdade || cont == 0) {
				menorIdade = idade;
				maisJovem = nome;
			}
			if(idade >= 18) {
				totalMaiorIdade++;
			}
			SomaIdades += idade;
			cont++;
			
		} while(JOptionPane.showConfirmDialog(null, 
				"Deseja continuar?",
				"Pergunta",
				JOptionPane.YES_NO_OPTION) == 0);
		
		String message = String.format("Pessoa mais experiente: %s com %d"
				+ "\nPessoa mais jovem: %s com %d"
				+ "\nQuantidade de pessoas maiores de idade: %d"
				+ "\nSoma das idades: %.0f"
				+ "\nTotal de pessoas: %d"
				+ "\nMédia de idades: %.2f", 
				maisExperiente, maiorIdade, maisJovem, menorIdade, totalMaiorIdade, 
				SomaIdades, cont, (SomaIdades/cont));
		
		System.out.println(message);
		JOptionPane.showMessageDialog(null, message);
	}

}
