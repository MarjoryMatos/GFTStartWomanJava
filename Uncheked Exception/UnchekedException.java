

import javax.swing.*;

public class UnchekedException {
	
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Number: ");
		String b = JOptionPane.showInputDialog("Dominador: ");
		
		try {
			int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
			 System.out.println("Resultado: " + resultado);
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Entrada inv�lida, informe um n�mero inteiro" + e.getMessage());	
		} catch(ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "Impossivel dividir um n�mero por 0." + e.getMessage());	
		}finally{
			System.out.println("Chegou na finally!");
		}
				
	}
		
	public static int dividir(int a, int b) {return a / b;}
	
}
