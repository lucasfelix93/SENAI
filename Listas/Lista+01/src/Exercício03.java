
//Fa�a um algoritmo que pe�a ao usu�rio 10 n�meros e mostre posteriormente quantos
//s�o pares e a soma deles, bem como quantos s�o �mpares e a soma deles.

import javax.swing.JOptionPane;

public class Exerc�cio03 {

	public static void main(String[] args) {
		int qntPar = 0;
		int somaPar = 0;
		int qntImpar = 0;
		int somaImpar = 0;
		

		for (int cont = 0; cont < 10; cont++) {
			int valorInformado = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (cont + 1) + "� valor de 10 n�meros: "));
			
			if (valorInformado % 2 == 0) {
				qntPar++; somaPar = somaPar + valorInformado;} 
			else {qntImpar++; somaImpar = somaImpar + valorInformado;
			}

		}
		String msgPar = "Quantidade de n�meros pares: " + qntPar + " que somados resultam no seguinte valor: " + somaPar;
		String msgImpar = "Quantidade de n�meros �mpares: " + qntImpar + " que somados resultam no seguinte valor: " + somaImpar;
		JOptionPane.showMessageDialog(null, msgPar, "Resumo dos n�meros pares", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, msgImpar, "Resumo dos n�meros �mpares", JOptionPane.INFORMATION_MESSAGE);
		
	}
}