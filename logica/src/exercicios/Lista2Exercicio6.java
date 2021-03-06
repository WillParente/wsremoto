package exercicios;

import javax.swing.JOptionPane;

public class Lista2Exercicio6 {

	public static void main(String[] args) {
		byte opcao = Byte.parseByte(JOptionPane.showInputDialog("1. Imposto \r\n"
				+ "2. Novo salário \r\n"
				+ "3. Classificação \r\n"
				+ "Digite a opção desejada\r\n"
				+ ""));
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o salário do funcionário?"));
		String message = "";
		
		switch(opcao) {
		case 1:
			double imposto = (salario < 500) ? 0.05 : (salario > 850.01) ? 0.15 : 0.1;
			message = "Salário líquido: " + (salario * (1-imposto));
			break;
		case 2:
			double aumento = (salario > 1500.01) ? 25.00 : (salario < 450.00) ? 100.00 : (salario >= 450.01 && salario <= 750.00) ? 75.00 : 50.00;
			message = "Novo salário: " + (salario = aumento);
			break;
		case 3:
			message = (salario <= 750.010) ? "Mal remunerado" : "Bem remunerado";
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida");
		}
		
		System.out.println(message);
		JOptionPane.showMessageDialog(null, message);		
	}
}