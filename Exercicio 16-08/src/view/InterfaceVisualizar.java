package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

import DTO.dto;

public class InterfaceVisualizar implements ActionListener {
	JComboBox combo;
	JTextArea txtArea;
	JButton botao;
	int index;
	JTable table;
	DefaultTableModel model = new DefaultTableModel();
	Font fonte = new Font("Dialog", Font.PLAIN, 15);
	
	public InterfaceVisualizar()  {
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
		
		botao = new JButton();
		botao.setBounds(150, 110, 100, 20);
		botao.setText("Selecionar");
		botao.addActionListener(this);
		frame.add(botao);
		
		JLabel labelProf = new JLabel("Professor");
		labelProf.setBounds(45, 160, 157, 20);
		labelProf.setFont(fonte);
		frame.add(labelProf);
		
		JLabel labelComen = new JLabel("Comentario");
		labelComen.setBounds(202, 160, 157, 20);
		labelComen.setFont(fonte);
		frame.add(labelComen);
		
		JPanel painelProf = new JPanel();
		painelProf.setBounds(45, 160, 157, 20);
		painelProf.setBackground(new Color(140,140,140));
		frame.add(painelProf);
		
		JPanel painelComen = new JPanel();
		painelComen.setBounds(202, 160, 157, 20);
		painelComen.setBackground(new Color(140,140,140));
		frame.add(painelComen);
		
		table = new JTable(model);
		table.setBounds(45, 180, 315, 100);
		table.setEnabled(true);
		table.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.add(table);
		model.addColumn("Professor");
		model.addColumn("Comentario");
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == botao) {
			((DefaultTableModel) table.getModel()).setRowCount(0);
			int tam = combo.getItemCount();
			index = combo.getSelectedIndex();
			index++;
			dto.visualizar(model, index, tam);
		}
		
	}

}
