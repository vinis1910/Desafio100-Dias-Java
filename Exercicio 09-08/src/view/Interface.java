package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import DTO.Crud;
import DTO.implementDTO;

public class Interface implements ActionListener {

	JTextField field1;
	JTextField field2;
	JTextField field3;
	JButton botao1, botao2, botao3;
	Font fonte = new Font("Dialog", Font.PLAIN, 15);
	Font fonte2 = new Font("Dialog", Font.PLAIN, 13);
	implementDTO dto = new implementDTO();
	Crud crud = new Crud();
	
	Interface(){
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
		
		field1 = new JTextField();
		field1.setBounds(90, 30, 70, 20);
		
		field2 = new JTextField();
		field2.setBounds(90, 80, 250, 20);
		
		field3 = new JTextField();
		field3.setBounds(90, 130, 210, 20);
		
		botao1 = new JButton("Inserir");
		botao1.setBounds(40, 175, 70, 20);
		botao1.setFocusable(false);
		botao1.setFont(fonte2);
		botao1.addActionListener(this);
		
		botao2 = new JButton("Excluir");
		botao2.setBounds(145, 175, 80, 20);
		botao2.setFocusable(false);
		botao2.setFont(fonte2);
		botao2.addActionListener(this);
		
		botao3 = new JButton("Alterar");
		botao3.setBounds(260, 175, 80, 20);
		botao3.setFocusable(false);
		botao3.setFont(fonte2);
		botao3.addActionListener(this);
		
		frame.add(label1);
		frame.add(field1);
		frame.add(field2);
		frame.add(label2);
		frame.add(field3);
		frame.add(label3);
		frame.add(botao1);
		frame.add(botao2);
		frame.add(botao3);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		Interface programa =  new Interface();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String id = field1.getText();
		String nome = field2.getText();
		String email = field3.getText();
		
		dto.setId(id);
		dto.setNome(nome);
		dto.setEmail(email);
		
		if(e.getSource().equals(botao1)) {
			crud.inserir(dto.getId(), dto.getNome(), dto.getEmail());
		}
		
		if(e.getSource().equals(botao2)) {
			crud.excluir(id);
		}
		
		if(e.getSource().equals(botao3)) {
			crud.alterar(id, nome, email);
		}
	}

}
