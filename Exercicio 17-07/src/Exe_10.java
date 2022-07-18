import javax.swing.JOptionPane;

public class Exe_10 {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloque o primeiro numero: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloque o segundo numero: "));
		
		JOptionPane.showMessageDialog(null, "Resultado da soma: " + (num1 + num2));
	}

}
