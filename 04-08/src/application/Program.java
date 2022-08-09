package application;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Program {

	Font fonte = new Font("Dialog", Font.PLAIN, 15);
	Font fonte2 = new Font("Dialog", Font.PLAIN, 13);
	Program(){
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(400, 260);
		
		JLabel label1 = new JLabel();
		label1.setBounds(25, 33, 25, 20);
		label1.setText("ID:");
		label1.setFont(fonte);
		
		JLabel label2 = new JLabel();
		label2.setBounds(25, 83, 50, 20);
		label2.setText("Nome:");
		label2.setFont(fonte);
		
		JLabel label3 = new JLabel();
		label3.setBounds(25, 133, 50, 20);
		label3.setText("Email:");
		label3.setFont(fonte);
		
		JTextField field1 = new JTextField();
		field1.setBounds(90, 30, 70, 20);
		
		JTextField field2 = new JTextField();
		field2.setBounds(90, 80, 250, 20);
		
		JTextField field3 = new JTextField();
		field3.setBounds(90, 130, 210, 20);
		
		JButton botao1 = new JButton("Inserir");
		botao1.setBounds(90, 175, 70, 20);
		botao1.setFocusable(false);
		botao1.setFont(fonte2);
		
		JButton botao2 = new JButton("Excluir");
		botao2.setBounds(220, 175, 80, 20);
		botao2.setFocusable(false);
		botao2.setFont(fonte2);
		
		frame.add(label1);
		frame.add(field1);
		frame.add(field2);
		frame.add(label2);
		frame.add(field3);
		frame.add(label3);
		frame.add(botao1);
		frame.add(botao2);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		Program programa =  new Program();

	}

}
