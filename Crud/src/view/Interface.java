package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import DTO.Crud;
import DTO.implementDTO;

public class Interface implements ActionListener {

	JTextField field1;
	JTextField field2;
	JTextField field3;
	JButton botao1, botao2, botao3, botao4;
	Font fonte = new Font("Dialog", Font.PLAIN, 15);
	Font fonte2 = new Font("Dialog", Font.PLAIN, 13);
	implementDTO dto = new implementDTO();
	Crud crud = new Crud();
	DefaultTableModel model = new DefaultTableModel();
	
	Interface(){
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(400, 390);
		
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
		
		JPanel painelid = new JPanel();
		painelid.setBounds(25, 230, 105, 15);
		painelid.setBackground(new Color(140,140,140));
		
		JLabel labelId = new JLabel("ID");
		labelId.setBounds(27, 230, 105, 15);
		labelId.setFont(fonte);
		
		JPanel painelNome = new JPanel();
		painelNome.setBounds(130, 230, 105, 15);
		painelNome.setBackground(new Color(140,140,140));
		
		JLabel labelNome = new JLabel("Nome");
		labelNome.setBounds(130, 230, 105, 15);
		labelNome.setFont(fonte);
		
		JPanel painelEmail = new JPanel();
		painelEmail.setBounds(235, 230, 105, 15);
		painelEmail.setBackground(new Color(140,140,140));
		
		JLabel labelEmail = new JLabel("Email");
		labelEmail.setBounds(235, 230, 105, 15);
		labelEmail.setFont(fonte);
		
		botao1 = new JButton("Inserir");
		botao1.setBounds(25, 175, 80, 20);
		botao1.setFocusable(false);
		botao1.setFont(fonte2);
		botao1.addActionListener(this);
		
		botao2 = new JButton("Excluir");
		botao2.setBounds(142, 175, 80, 20);
		botao2.setFocusable(false);
		botao2.setFont(fonte2);
		botao2.addActionListener(this);
		
		botao3 = new JButton("Alterar");
		botao3.setBounds(260, 175, 80, 20);
		botao3.setFocusable(false);
		botao3.setFont(fonte2);
		botao3.addActionListener(this);
		
		botao4 = new JButton("Listar");
		botao4.setBounds(25, 200, 80, 20);
		botao4.setFocusable(false);
		botao4.setFont(fonte2);
		botao4.addActionListener(this);
		
		JTable table = new JTable(model);
		table.setBounds(25, 245, 315, 80);
		table.setEnabled(true);
		table.setBorder(BorderFactory.createLineBorder(Color.black));
		model.addColumn("ID");
		model.addColumn("Nome");
		model.addColumn("Email");
		
		frame.add(label1);
		frame.add(field1);
		frame.add(field2);
		frame.add(label2);
		frame.add(field3);
		frame.add(label3);
		frame.add(botao1);
		frame.add(botao2);
		frame.add(botao3);
		frame.add(botao4);
		frame.add(labelId);
		frame.add(labelNome);
		frame.add(labelEmail);
		frame.add(painelid);
		frame.add(painelNome);
		frame.add(painelEmail);
		frame.add(table);
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
		
		if(e.getSource().equals(botao4)) {
			crud.listar(model);
		}
	}

}
