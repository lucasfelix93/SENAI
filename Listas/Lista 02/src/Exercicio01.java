import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero01 = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero: "));

		int numero02 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo n�mero: "));
		
		double media = (numero01 / numero02);

		if (numero01 % 3 == 0) {
			JOptionPane.showMessageDialog(null,  "O n�mero" + numero01 + "� multiplo de 3.");
		} else {
			JOptionPane.showMessageDialog(null,  "O n�mero" + numero01 + "n�o � multiplo de 3.");
		}
		if (numero01 % 2 == 0) {
			JOptionPane.showMessageDialog(null,  "O n�mero" + numero01 + "� par.");
		} else {
			JOptionPane.showMessageDialog(null,  "O n�mero" + numero01 + "n�o � par.");
		}
		if (numero02 % 3 == 0) {
			JOptionPane.showMessageDialog(null,  "O n�mero" + numero01 + "� multiplo de 3.");
		} else {
			JOptionPane.showMessageDialog(null,  "O n�mero" + numero01 + "n�o � multiplo de 3.");
		}
		if (numero02 % 2 == 0) {
			JOptionPane.showMessageDialog(null,  "O n�mero" + numero02 + "� par.");
		} else {
			JOptionPane.showMessageDialog(null,  "O n�mero" + numero02 + "n�o � par.");
		}
		
		if (media >= 7) {
			JOptionPane.showMessageDialog(null,  "A m�dia dos n�meros" + numero01 + " e " + numero02 + "� maior que 7: " + media);
		} else {
			JOptionPane.showMessageDialog(null,  "A m�dia dos n�meros" + numero01 + " e " + numero02 + "n�o � maior que 7: " + media);
		}

	}

}
