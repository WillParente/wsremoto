package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		
		/*
		 * Game: advinhação
		 * Jogador1 : vai digitar um número inteiro
		 * Jogador2 : vai ter que advinhar o numero
		 * Quando o jogador 2 acertar, tem que mostrar "Parabéns"
		 * 
		 * Plus:
		 * - Implemente uma ajuda da sua aplicação. Se o Jogador 2 estiver chutando alto,
		 * avise que o número é mais baixo e vice-versa.
		 * 
		 * - Quando o Jogador 2 acertar, apresente a quantidade de tentativas que ele utilizou.
		 */
		
		byte jogador1 = Byte.parseByte(JOptionPane.showInputDialog("Jogador1"));
		byte jogador2 = 0;
		byte count = 0;
		
		do {
			if(count > 0) {
				if(jogador1 > jogador2) {
					JOptionPane.showMessageDialog(null, "O número é maior");
				} else {
					JOptionPane.showMessageDialog(null, "O número é menor");
				}
			}
			
			jogador2 = Byte.parseByte(JOptionPane.showInputDialog("Jogador2"));
			count++;
		} while(jogador1 != jogador2);
		
		String message = "Parabéns!! Você acertou na " + count + " tentativa!";
		System.out.println(message);
		JOptionPane.showMessageDialog(null, message);
	}
}
