package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import DTO.dto;

public class Interface implements ActionListener {
	JComboBox combo;
	JTextArea txtArea;
	JButton botao;
	String nomeProf;
	String comentario;
	int index;
	
	
	public Interface(){
		JFrame frame = new JFrame();
		frame.setSize(430, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		String[] professores = {"NICKERSON", "RENAN", "ELIONAI", "LUCAS", "CESAR"};
		
		combo = new JComboBox(professores);
		combo.setBounds(180, 50, 100, 20);
		combo.addActionListener(this);
		
		JLabel fieldProf = new JLabel("Professores:");
		fieldProf.setBounds(50, 55, 100, 10);
		
		JLabel fieldComen = new JLabel("Comentarios:");
		fieldComen.setBounds(50, 100, 100, 10);
		
		txtArea = new JTextArea();
		txtArea.setBounds(50, 120, 300, 100);
		txtArea.setBorder(BorderFactory.createLineBorder(Color.black));
		
		botao = new JButton();
		botao.setBounds(145, 250, 100, 20);
		botao.setText("Adcionar");
		botao.addActionListener(this);
		
		frame.add(txtArea);
		frame.add(combo);
		frame.add(fieldProf);
		frame.add(fieldComen);
		frame.add(botao);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Interface inter = new Interface();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(botao)) {
			index = combo.getSelectedIndex();
			nomeProf = String.valueOf(combo.getSelectedItem());
			index++;
			comentario = txtArea.getText();
			dto.inserirComentario(index ,nomeProf, comentario);
		}
		
	}

}
