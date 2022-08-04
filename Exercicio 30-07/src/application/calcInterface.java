package application;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calcInterface implements ActionListener {

	JButton[] numBotoes = new JButton[10];
	JButton[] funButton = new JButton[8];
	JButton addButton, subButton, multButton, divButton;
	JButton decButton, clrButton, equButton, delButton;
	JTextField campo;
	Font fonte = new Font("Dialog", Font.BOLD, 20);
	double num1, num2, resultado;
	String operador;
	calcInterface(){
		
		JFrame frame = new JFrame();
		frame.setTitle("Calculadora");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(330, 400);
		
		addButton = new JButton("+");
		subButton = new JButton("-");
		multButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		clrButton = new JButton("Clear");
		equButton = new JButton("=");
		delButton = new JButton("Del");
		
		funButton[0] = addButton;
		funButton[1] = subButton;
		funButton[2] = multButton;
		funButton[3] = divButton;
		funButton[4] = decButton;
		funButton[5] = clrButton;
		funButton[6] = equButton;
		funButton[7] = delButton;
		
		clrButton.setBounds(50, 310, 100, 30);
		delButton.setBounds(160, 310, 100, 30);
		
		for(int i = 0; i < 8; i++) {
			funButton[i].addActionListener(this);
			funButton[i].setFocusable(false);
			funButton[i].setFont(fonte);
		}
		
		for(int i = 0; i < 10; i++) {
			numBotoes[i] = new JButton(String.valueOf(i));
			numBotoes[i].addActionListener(this);
			numBotoes[i].setFocusable(false);
			numBotoes[i].setFont(fonte);
		}
		
		campo = new JTextField();
		campo.setBounds(25, 20, 260, 45);
		campo.setEditable(false);
		campo.setFont(fonte);
		campo.setHorizontalAlignment(JTextField.RIGHT);
		
		JPanel painel = new JPanel();
		painel.setBounds(25, 80, 260, 220);
		painel.setLayout(new GridLayout(4, 4, 10, 10));
		
		painel.add(numBotoes[1]);
		painel.add(numBotoes[2]);
		painel.add(numBotoes[3]);
		painel.add(addButton);
		painel.add(numBotoes[4]);
		painel.add(numBotoes[5]);
		painel.add(numBotoes[6]);
		painel.add(subButton);
		painel.add(numBotoes[7]);
		painel.add(numBotoes[8]);
		painel.add(numBotoes[9]);
		painel.add(multButton);
		painel.add(decButton);
		painel.add(numBotoes[0]);
		painel.add(divButton);
		painel.add(equButton);
		frame.add(clrButton);
		frame.add(delButton);
		frame.add(painel);
		frame.setVisible(true);
		frame.add(campo);
		
	}
	
	public static void main(String[] args) {
		calcInterface calcInterface = new calcInterface();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i = 0; i < 10; i++) {
			if(e.getSource() == numBotoes[i]) {
				campo.setText(campo.getText().concat(String.valueOf(i)));
			}
		}
		
		if(e.getSource()==decButton) {
			campo.setText(campo.getText().concat("."));
		}
		
		if(e.getSource()==addButton) {
			num1 = Double.parseDouble(campo.getText());
			operador = "+";
			campo.setText("");
		}
		
		if(e.getSource()==subButton) {
			num1 = Double.parseDouble(campo.getText());
			operador = "-";
			campo.setText("");
		}
		
		if(e.getSource()==multButton) {
			num1 = Double.parseDouble(campo.getText());
			operador = "*";
			campo.setText("");
		}
		if(e.getSource()==divButton) {
			num1 = Double.parseDouble(campo.getText());
			operador = "/";
			campo.setText("");
		}
		if(e.getSource()==clrButton) {
			campo.setText("");
		}
		if(e.getSource()==delButton) {
			String temp = campo.getText();
			campo.setText("");
			for(int i = 0; i < temp.length() - 1; i++) {
				campo.setText(campo.getText()+ temp.charAt(i));
			}
		}
		if(e.getSource()==equButton) {
			num2 = Double.parseDouble(campo.getText());
			
			switch(operador) {
			case "+":
				resultado = num1 + num2;
				break;
			case "-":
				resultado = num1 - num2;
				break;
			case "*":
				resultado = num1 * num2;
				break;
			case "/":
				resultado = num1 / num2;
				break;
			}
			
			campo.setText(String.valueOf(resultado));
		}
	}
}
