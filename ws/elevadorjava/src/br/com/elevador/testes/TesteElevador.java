package br.com.elevador.testes;

import javax.swing.JOptionPane;

import br.com.elevador.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		
		Elevador elevador = new Elevador();
		
		elevador.definir(JOptionPane.showInputDialog("Nome"), 
				Short.parseShort(JOptionPane.showInputDialog("Andar Máximo")),
				Short.parseShort(JOptionPane.showInputDialog("Andar Minímo")), 
				Byte.parseByte(JOptionPane.showInputDialog("Capacidade Pessoas")));
		
		//elevador.subir();
		//elevador.descer();
		elevador.entrar(Byte.parseByte(JOptionPane.showInputDialog("Entrar quantas Pessoas?")));
		elevador.sair(Byte.parseByte(JOptionPane.showInputDialog("Sair quantas Pessoas?")));
		elevador.subir(Short.parseShort(JOptionPane.showInputDialog("Subir quantos andares?")));
		elevador.descer(Short.parseShort(JOptionPane.showInputDialog("Descer quantos andares?")));
		
		JOptionPane.showMessageDialog(null, elevador.exibirDados());

	}

}
