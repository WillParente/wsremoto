package br.com.universidadexyz.implementacao;

import javax.swing.JOptionPane;

import br.com.universidadexyz.beans.Aluno;

public class ImplementarAluno2 {

	public static void main(String[] args) {
		
		String cpf = JOptionPane.showInputDialog("CPF");
		String nome = JOptionPane.showInputDialog("Nome");
		int rm = Integer.parseInt(JOptionPane.showInputDialog("RM"));
		
		Aluno aluno = new Aluno(rm, nome, cpf);
		
		
		//aluno.setAll(rm, nome, cpf);
		
		System.out.println(aluno.getAll());
	}
}
