import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero01 = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));

		int numero02 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "));
		
		double media = (numero01 / numero02);

		if (numero01 % 3 == 0) {
			JOptionPane.showMessageDialog(null,  "O número" + numero01 + "é multiplo de 3.");
		} else {
			JOptionPane.showMessageDialog(null,  "O número" + numero01 + "não é multiplo de 3.");
		}
		if (numero01 % 2 == 0) {
			JOptionPane.showMessageDialog(null,  "O número" + numero01 + "é par.");
		} else {
			JOptionPane.showMessageDialog(null,  "O número" + numero01 + "não é par.");
		}
		if (numero02 % 3 == 0) {
			JOptionPane.showMessageDialog(null,  "O número" + numero01 + "é multiplo de 3.");
		} else {
			JOptionPane.showMessageDialog(null,  "O número" + numero01 + "não é multiplo de 3.");
		}
		if (numero02 % 2 == 0) {
			JOptionPane.showMessageDialog(null,  "O número" + numero02 + "é par.");
		} else {
			JOptionPane.showMessageDialog(null,  "O número" + numero02 + "não é par.");
		}
		
		if (media >= 7) {
			JOptionPane.showMessageDialog(null,  "A média dos números" + numero01 + " e " + numero02 + "é maior que 7: " + media);
		} else {
			JOptionPane.showMessageDialog(null,  "A média dos números" + numero01 + " e " + numero02 + "não é maior que 7: " + media);
		}

	}

}
