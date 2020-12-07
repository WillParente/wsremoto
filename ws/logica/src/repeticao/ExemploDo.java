package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {
		String cargo = "";
		float salario = 0;
		
		do {
			cargo = JOptionPane.showInputDialog("Cargo");
			salario = Float.parseFloat(JOptionPane.showInputDialog("Salário"));
		} while(JOptionPane.showConfirmDialog(null, 
				"Deseja continuar?",
				"Pergunta",
				JOptionPane.YES_NO_OPTION) == 0);
	}
}
