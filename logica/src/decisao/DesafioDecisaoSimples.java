package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		/*
		 * Solicita o nome e a idade de uma pessoa
		 * Sua apicação deve informar se:
		 * ela é obrigada a votar
		 * ela é impossbilitada de votar
		 * o voto para ela é facultativo
		 * 
		 * acima de 70 anos e com 16 e 17 anos é facultativo
		 * 18 - 70 => é obrigatório
		 * menor de 16 anos => não vota
		 */
		
		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Nome"));
		String message = nome;
		
		if(idade < 16) {
			message += " não vota";
		}
		else if (idade >= 18 && idade <= 70) {
			message += " é obrigado a votar";
		}
		else {
			message += " é facultativo votar";
		}
		System.out.println(message);
		JOptionPane.showMessageDialog(null, message);
	}

}
