package variaveis;

import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) {
		String disciplina = JOptionPane.showInputDialog("Digite a disciplina: ");
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua nota do primeiro semestre: "));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua nota do segundo semestre: "));
		double media = (nota1 + nota2)/2;
		System.out.println("Disciplina: " + disciplina  + "\n" + "Média final: " + media);
	}
}
