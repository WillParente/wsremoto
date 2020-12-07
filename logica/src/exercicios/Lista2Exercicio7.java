package exercicios;

import javax.swing.JOptionPane;

public class Lista2Exercicio7 {

	public static void main(String[] args) {
		
		String message = "";
		byte codigo = Byte.parseByte(JOptionPane.showInputDialog("Código do produto (Deve ser entre 1 e 10):"));
		double precoGrama = 0;
		float peso = 0;
		byte codigoPais = 0;
		double imposto = 0;
		double precoFinal = 0;
		
		if(codigo >= 1 && codigo <= 10) {
			if(codigo >= 8) {
				precoGrama = 35;
			} else if(codigo >= 5) {
				precoGrama = 25;
			} else {
				precoGrama = 15;
			}
			peso = Float.parseFloat(JOptionPane.showInputDialog("Peso do produto (Kg):"));
			codigoPais = Byte.parseByte(JOptionPane.showInputDialog("Código do país de origem (Deve ser entre 1 e 3):"));
			if(codigoPais >= 1 && codigoPais <= 3) {
				switch(codigoPais) {
				case 1:
					imposto = 0;
					break;
				case 2:
					imposto = 0.15;
					break;
				case 3:
					imposto = 0.25;
					break;
				}
			} else {
				message = "Opção inválida!";
			}
			
			precoFinal = (peso * precoGrama) * (1 + imposto);
			message = "Código produto: " + codigo 
					+ "\nPeso: " + peso 
					+ "\nPaís: " + codigoPais
					+ "\nValor: R$ " + precoFinal;
				
		} else {
			message = "Opção inválida!";
		}
		
		
		System.out.println(message);
		JOptionPane.showMessageDialog(null, message);		
	}
}