package br.com.universidadexyz.implementacao;

import javax.swing.JOptionPane;

import br.com.universidadexyz.beans.Curso;

public class ImplementarCurso {

	public static void main(String[] args) {
		
		Curso curso = new Curso();
		String descricao = JOptionPane.showInputDialog("Descrição");
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor"));
		short cargaHoraria = Short.parseShort(JOptionPane.showInputDialog("Carga Horária"));
		String sigla = JOptionPane.showInputDialog("Sigla");
		int id = Integer.parseInt(JOptionPane.showInputDialog("Id"));
		int duracao = Integer.parseInt(JOptionPane.showInputDialog("Duração"));
		
		curso.setAll(descricao, valor, cargaHoraria, sigla, id, duracao);
		
		System.out.println(curso.getAll());
		
		Curso c = new Curso(descricao, valor, cargaHoraria, sigla, id, duracao);
		System.out.println(c.getAll());
		
		float porcentagemAjuste = Float.parseFloat(JOptionPane.showInputDialog("Porcentagem de ajuste"));
		curso.AjustarValor(porcentagemAjuste);
		System.out.println("Valor do curso após o ajuste de " + porcentagemAjuste + "% do valor: " + curso.getValor());
		
		System.out.println("Valor do curso após o promoção de desconto de 10% do valor: " + curso.getPromocao());
		
		float porcentagemDesconto = Float.parseFloat(JOptionPane.showInputDialog("Porcentagem de desconto"));
		System.out.println("Valor do curso após o promoção de desconto de 10% do valor: " + curso.getPromocao(porcentagemDesconto));
	}

}
