import javax.swing.JOptionPane;
public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
		
		String msgParImpar = "";
		String msgResultado = "";
		int resultado = 0;
		
		resultado = numero % 2;
		
		if (resultado==0) {
			msgParImpar = "O valor informado é par!";
		}else if (resultado==1) {msgParImpar = "O valor informado é ímpar!";}
		else {msgParImpar = "Tivemos algum problema para verificar o valor. ";}
		
		JOptionPane.showMessageDialog(null, msgParImpar,"Par ou ímpar?",JOptionPane.INFORMATION_MESSAGE);
		
		for (int i=1; i<=10; i++) {
			resultado = numero*i;
			msgResultado = msgResultado + numero + "*" + i + "=" + resultado + "\n";}
		
		JOptionPane.showMessageDialog(null,msgResultado,"Tabuada",JOptionPane.INFORMATION_MESSAGE);
	}

}
