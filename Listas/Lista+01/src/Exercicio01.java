import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double totalCompras = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da compra: "));
		int qtdParcelas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de parcelas: "));
		double valorParcelas = totalCompras/qtdParcelas;
		
		String msgResultado = "O valor total das compras foi de RS" + totalCompras;
		msgResultado += "\n";
		msgResultado += "Você optou por parcelas a em " + qtdParcelas + " vezes";
		msgResultado += "\n";
		msgResultado +="O valor de cada parcela será de " + valorParcelas + "reais";
		
//        String formato = "R$ #,##0.00";
//        DecimalFormat d = new DecimalFormat(formato);
//        System.out.println(d.format(valorParcelas));
//        String teste = d.format(valorParcelas);
//        System.out.println(teste);
		
		String msgTotalCompras = "O valor total das compras foi de RS" + totalCompras;
		String msgQtdParcelas = "Você optou por parcelas a em " + qtdParcelas + " vezes";
		String msgValorParcelas = "O valor de cada parcela será de " + valorParcelas + "reais";
		
		JOptionPane.showMessageDialog(null, msgResultado, "Valor das parcelas", JOptionPane.INFORMATION_MESSAGE);

	}

}
