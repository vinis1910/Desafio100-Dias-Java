import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exe_15 {

	Exe_15(){
		JFrame frame = new JFrame();
		frame.setTitle("Desafio Java");
		frame.setSize(450,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		JLabel label = new JLabel();
		label.setText("Desafio dos 100 dias de programação Java");
		label.setBounds(110, 60, 250, 20);
		
		JLabel label2 = new JLabel();
		label2.setText("Hoje ja é o 15 dia de desafio");
		label2.setBounds(150, 100, 170, 20);
	
		
		
		frame.setVisible(true);
		frame.add(label);
		frame.add(label2);
		
	}
	public static void main(String[] args) {
		Exe_15 texto = new Exe_15();
	}

}
