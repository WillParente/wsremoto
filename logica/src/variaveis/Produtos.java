package variaveis;

import javax.swing.JOptionPane;

public class Produtos {

	public static void main(String[] args) {
		String produto = JOptionPane.showInputDialog("Produto: ");
		short qtde = Short.parseShort(JOptionPane.showInputDialog("Quantidadae: "));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor: "));
		int numero = 10;
		qtde = (short) numero;
		
		System.out.println("Produto: " + produto + " - Quantidade: " + qtde + " - Valor: " + valor);
	}

}