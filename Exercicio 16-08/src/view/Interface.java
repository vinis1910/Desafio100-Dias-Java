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
import javax.swing.table.DefaultTableModel;

import DTO.dto;
import DTO.implementsDTO;

public class Interface implements ActionListener {
	JComboBox combo;
	JTextArea txtArea;
	JButton botao, botao2;
	int index, tamStr;
	DefaultTableModel model;
	InterfaceVisualizar interVi;
	
	public Interface(){
		JFrame frame = new JFrame();
		frame.setSize(430, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		String[] professores = {"NICKERSON", "RENAN", "ELIONAI", "LUCAS", "CESAR"};
		
		combo = new JComboBox(professores);
		combo.setBounds(180, 50, 100, 20);
		combo.addActionListener(this);
		frame.add(combo);
		
		JLabel fieldProf = new JLabel("Professores:");
		fieldProf.setBounds(50, 55, 100, 10);
		frame.add(fieldProf);
		
		JLabel fieldComen = new JLabel("Comentarios:");
		fieldComen.setBounds(50, 100, 100, 10);
		frame.add(fieldComen);
		
		txtArea = new JTextArea();
		txtArea.setBounds(50, 120, 300, 100);
		txtArea.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.add(txtArea);
		
		botao = new JButton();
		botao.setBounds(80, 250, 100, 20);
		botao.setText("Adcionar");
		botao.addActionListener(this);
		frame.add(botao);

		botao2 = new JButton();
		botao2.setBounds(220, 250, 100, 20);
		botao2.setText("Visualizar");
		botao2.addActionListener(this);
		frame.add(botao2);
		
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Interface inter = new Interface();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == botao) {
			index = combo.getSelectedIndex();
			index++;
			implementsDTO implement = new implementsDTO(txtArea.getText(), String.valueOf(combo.getSelectedItem()) );
			dto.inserirComentario(index ,implement.getNomeProf(), implement.getComentario());
		}
		if(e.getSource() == botao2) {
			InterfaceVisualizar interVi = new InterfaceVisualizar();
		}
		
	}

}
