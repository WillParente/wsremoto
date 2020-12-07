package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {

	public static void main(String[] args) 
	{
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite o sua idade: "));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura: "));
		System.out.println("Nome..: " + nome);
		System.out.println("Idade.: " + idade);
		System.out.println("Peso..: " + peso);
		System.out.println("Altura: " + altura);
		double imc = peso/(altura * altura);
		System.out.println("IMC...: " + imc);
	}

}
