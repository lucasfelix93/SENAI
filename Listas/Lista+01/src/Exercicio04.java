import javax.swing.JOptionPane;

//Crie uma calculadora que permita o c�lculo de uma equa��o, sem limite de
//execu��es definido, da seguinte maneira:
//1. Pe�a o primeiro valor ,
//2. Pe�a o c�lculo que deseja fazer (entre as 4 opera��es b�sicas),
//3. Pe�a um segundo valor ,
//4. Efetue o c�lculo,
//5. Pe�a se o usu�rio que continuar calculando. Se ele responder que sim, volte
//para o passo 2 usando o resultado do c�lculo da linha 4 como primeiro valor , se
//disser que n�o, mostre o resultado final .
//Exemplo de uso para o algoritmo: 4 + 3 = 7 x 4 = 28 / 14 = 2

public class Exercicio04 {

	public static void main(String[] args) {

		double resultado = 0;
		int operacao = 0;
		int opcao = 0;
		
		double numeroA = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor:"));
		
		do {
		operacao = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opera��o: 1- Adi��o/ 2-Subtra��o/ 3 - Multiplica��o/ 4- Divis�o"));
		
		int numeroB = Integer.parseInt(JOptionPane.showInputDialog("Informe outro valor: "));
		boolean opInvalida;
		switch (operacao) {
		case 1:
			resultado = numeroA + numeroB;
			break;
		case 2:
			resultado = numeroA - numeroB;
			break;
		case 3:
			resultado = numeroA * numeroB;
			break;
		case 4:
			if (numeroB==0) {JOptionPane.showInputDialog("Valor indefinido (Divis�o por zero)");
			}
			else {resultado = numeroA / numeroB;}
			break;
		default: 
			opInvalida = true;
			
		}
		String msgResultadoParcial = "Resultado parcial = " + resultado;
		JOptionPane.showMessageDialog(null, msgResultadoParcial, "Resultado parcial", JOptionPane.INFORMATION_MESSAGE);
		
		if (opInvalida = true) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar calculando? 1 - Sim |2- N�o"));
			switch (opcao) {
			case 1: 
				numeroA = resultado;
				break;
			default:
				break;
			
		
			}
			
		}
	} while (opcao == 1);

}
}
