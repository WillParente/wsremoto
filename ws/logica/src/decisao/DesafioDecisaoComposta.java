package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoComposta {

	public static void main(String[] args) {
		/*
		 * SolicitE o nome de um produto, qtde (unitário) e valor.
		 * Sua apicação deve retornar:
		 * "Estoque Alto" - "Estoque Baixo" - "Estoque Normal"
		 * estoque normal quando a qtde está entre 10 e 20.
		 * Se o valor for maior que 1000 deve aparecer "Valor Alto"
		*/
		
		String produto = JOptionPane.showInputDialog("Produto").toUpperCase();
		short qtde = Short.parseShort(JOptionPane.showInputDialog("Quantidade"));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor"));
		
		String message = produto +": ";
		
		if(qtde > 20) {
			message += "Estoque Alto";
		}
		else if (qtde < 10) {
			message += "Estoque Baixo";
		}
		else {
			message += "Estoque Normal";
		}
		
		if(valor > 1000)
		{
			message += " - Valor Alto";
		}
		System.out.println(message);
		JOptionPane.showMessageDialog(null, message);
	}

}
