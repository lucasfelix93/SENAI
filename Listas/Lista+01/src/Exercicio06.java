
//Fa�a um programa que carregue os valores das vendas de uma loja no primeiro
//semestre de 2018. Considere para tal, uma matriz [6,4], sendo que s�o 06 meses e 04
//semanas por m�s. Ao final, mostre na tela:
//- Total de vendas do semestre
//-Total vendido em cada m�s

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = new int[6][4];
		int somaMes[] = new int[6];
		int vendasSemestre = 0;

		JOptionPane.showMessageDialog(null, "Informe os valores semanais das vendas de uma loja ao longo do primeiro semestre");

		for (int contI = 0; contI < array.length; contI++) {
			for (int contJ = 0; contJ < array[contI].length; contJ++) {
				array[contI][contJ] = Integer.parseInt(JOptionPane
						.showInputDialog("Informe o valor das vendas da " + (contJ+1) + "� semana do m�s " + (contI+1)));
			}
		}
		for (int contI = 0; contI < array.length; contI++) {
			for (int contJ = 0; contJ < array[contI].length; contJ++) {
				somaMes[contI] += array[contI][contJ]; // a vari�vel somaMes incrementa (por causa do comando +=) os valores dentro da matriz array em casa posi��o (linha, coluna)
			}
			vendasSemestre += somaMes[contI]; // a variavel VendasSemestre recebe e soma com o valor que h� dentro dela

		}
		for (int contI = 0; contI < array.length; contI++) {
			JOptionPane.showMessageDialog(null, "O total de vendas do "+ (contI+1) +"� m�s foi de RS" + somaMes[contI]);
		}
		JOptionPane.showMessageDialog(null,"O total de vendas do primeiro semestre foram de R$"+ vendasSemestre);
	
	}

}
