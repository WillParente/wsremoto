package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {
		/*
		 * 
		 * Sua aplicação irá pedir, ano, mes, dia, em variáveis inteiras separadamente
		 * Ano => deve ser maior que 1900
		 * Dia => deve estar entre 1 e 31
		 * Mes => deve estar entre 1 a 12
		 * 
		 * No final, exibe a data dia/mes/ano
		 */
		
		byte dia = 0;
		byte mes = 0;
		int ano = 0;

		while(ano < 1900) {
			ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano (Deve ser maior que 1900): "));
		}
		
		while(mes < 1 || mes > 12) {
			mes = Byte.parseByte(JOptionPane.showInputDialog("Informe o mês: "));
		}
		
		if (mes==2) {
			while (dia<1 || dia >29) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Dia"));
			}
		}else if(mes==4 || mes == 6 || mes == 9 || mes ==11) {
			while (dia<1 || dia >30){
				dia = Byte.parseByte(JOptionPane.showInputDialog("Dia"));
			}
		}else {
			while (dia<1 || dia >31){
				dia = Byte.parseByte(JOptionPane.showInputDialog("Dia"));
			}			
		}		
		
		System.out.println(dia + "/" + mes + "/" + ano);
	}

}