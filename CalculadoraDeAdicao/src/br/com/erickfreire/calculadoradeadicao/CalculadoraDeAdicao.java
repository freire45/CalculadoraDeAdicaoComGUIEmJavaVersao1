package br.com.erickfreire.calculadoradeadicao;

import javax.swing.JOptionPane;

public class CalculadoraDeAdicao {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		int resultado;
		String entrada;
		String resultado2;
		
		JOptionPane.showMessageDialog(null, "Calculadora de Soma entre dois valores:");
		
		entrada = JOptionPane.showInputDialog("Insita o primeiro valor: ");		
		numero1 = Integer.parseInt(entrada);
		
		entrada = JOptionPane.showInputDialog("Insita o segundo valor: ");
		numero2 = Integer.parseInt(entrada);
		
		resultado = numero1 + numero2;
		
		resultado2 = String.format("O resultado final é de: %s", resultado);
		
		JOptionPane.showMessageDialog(null, resultado2);		
		

	}

}
