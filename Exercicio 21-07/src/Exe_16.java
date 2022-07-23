import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Exe_16 implements ActionListener {

	JTextField campo1;
	JTextField campo2;
	JTextField campo3;
	JButton botao1;
	JButton botao2;
	double num1, num2, result;
	
	Exe_16(){
		JFrame frame = new JFrame();
		frame.setTitle("Calculadora");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(440, 550);
		
		
		campo1 = new JTextField();
		campo1.setBounds(95, 100, 210, 30);
		
		campo2 = new JTextField();
		campo2.setBounds(95, 200, 210, 30);
		
		campo3 = new JTextField();
		campo3.setBounds(95, 250, 210, 30);
		campo3.setEditable(false);
				
		botao1 = new JButton();
		botao1.addActionListener(this);
		botao1.setBounds(95, 300, 105, 40);
		botao1.setText("+");
		botao1.setFocusable(false);
		
		botao2 = new JButton();
		botao2.addActionListener(this);
		botao2.setBounds(200, 300, 105, 40);
		botao2.setText("-");
		botao2.setFocusable(false);
		
		frame.add(botao1);
		frame.add(botao2);
		frame.add(campo1);
		frame.add(campo2);
		frame.add(campo3);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		Exe_16 calc = new Exe_16();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == botao1) {
			num1 = Double.parseDouble(campo1.getText());
			num2 = Double.parseDouble(campo2.getText());
			result = num1 + num2;
			campo3.setText(String.valueOf(result));
		}
		if(e.getSource() == botao2) {
			num1 = Double.parseDouble(campo1.getText());
			num2 = Double.parseDouble(campo2.getText());
			result = num1 - num2;
			campo3.setText(String.valueOf(result));
		}
		
	}

}
