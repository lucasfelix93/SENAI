
//Fa�a uma solu��o que alimente um vetor com 10 valores inteiros entre 0 e 50 e tamb�m que solicite ao usu�rio a entrada de dados de um valor
//inteiro qualquer. A solu��o dever� fazer uma busca do valor, informado pelo usu�rio, no vetor e imprima a posi��o em que este
//foi encontrado ou se n�o foi encontrado.

import javax.swing.JOptionPane;
import java.util.Random;

public class Exercicio05 {

	public static void main(String[] args) {

		int[] array = new int[10];
		Random random = new Random();
		int cont = 0;
		int numInformado = 0;
		boolean numPresente = false;
		String msgTrue = "";
		String msgFalse = "O vetor n�o possui o valor informado";

		numInformado = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero"));

		for (cont = 0; cont < array.length; cont++) {
			array[cont] = 1+ random.nextInt(50);
			System.out.println(array[cont]);

			if (numInformado == array[cont]) {
				numPresente = true;
				msgTrue = "O n�mero informado se encontra na posi��o " + cont + " do vetor.";
			}
		}
		if (numPresente == true) {
			JOptionPane.showMessageDialog(null, msgTrue, "Resultado", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, msgFalse, "Resultado", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}