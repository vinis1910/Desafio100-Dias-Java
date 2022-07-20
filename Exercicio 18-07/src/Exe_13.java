import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exe_13 implements ActionListener {
	JComboBox txtCombo1;
	
	Exe_13(){
	JFrame janela =  new JFrame();
	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	janela.setSize(790,600);
	janela.setLayout(null);
	
	JLabel titulo = new JLabel();
	titulo.setText("Emitir Nota");
	titulo.setSize(150,30);
	titulo.setLocation(10, 10);
	titulo.setFont(new Font("HelveticaNeue-Bold", Font.PLAIN, 30));
	
	JLabel inicio = new JLabel();
	inicio.setText("Inicio");
	inicio.setSize(35,16);
	inicio.setLocation(33, 55);
	inicio.setFont(new Font("HelveticaNeue-Bold", Font.PLAIN, 12));
	
	JTextField txtField1 = new JTextField();
	txtField1.setBounds(30, 70, 130, 20);
	
	JLabel fim = new JLabel();
	fim.setText("Fim");
	fim.setSize(35,16);
	fim.setLocation(177, 55);
	fim.setFont(new Font("HelveticaNeue-Bold", Font.PLAIN, 12));
	
	JTextField txtField2 = new JTextField();
	txtField2.setBounds(175, 70, 130, 20);
	
	JLabel setor = new JLabel();
	setor.setText("Setor");
	setor.setSize(35,15);
	setor.setLocation(343, 55);
	setor.setFont(new Font("HelveticaNeue-Bold", Font.PLAIN, 12));
	
	String[] setores = {"Vendas","ADM", "Estoque"};
	txtCombo1 = new JComboBox(setores);
	txtCombo1.setBounds(340, 70, 400, 20);
	txtCombo1.setBackground(new Color(241, 244, 247));
	
	JLabel titulo1 = new JLabel();
	titulo1.setText("Titulo");
	titulo1.setSize(35,15);
	titulo1.setLocation(30, 100);
	titulo1.setFont(new Font("HelveticaNeue-Bold", Font.PLAIN, 12));
	
	JTextField txtField3 = new JTextField();
	txtField3.setBounds(30, 120, 712, 20);
	
	JLabel pauta = new JLabel();
	pauta.setText("Pauta");
	pauta.setSize(35,15);
	pauta.setLocation(30, 145);
	pauta.setFont(new Font("HelveticaNeue-Bold", Font.PLAIN, 12));
	
	JTextField txtField4 = new JTextField();
	txtField4.setBounds(30, 160, 712, 20);
	
	JLabel descricao = new JLabel();
	descricao.setText("Descrição");
	descricao.setSize(80,15);
	descricao.setLocation(30, 185);
	descricao.setFont(new Font("HelveticaNeue-Bold", Font.PLAIN, 12));
	
	JTextField txtField5 = new JTextField();
	txtField5.setBounds(30, 200, 712, 20);
	
	JLabel tipo = new JLabel();
	tipo.setText("Tipo");
	tipo.setSize(35,15);
	tipo.setLocation(30, 235);
	tipo.setFont(new Font("HelveticaNeue-Bold", Font.PLAIN, 12));
	
	JTextField txtField6 = new JTextField();
	txtField6.setBounds(30, 255, 355, 20);
	
	JLabel palChave = new JLabel();
	palChave.setText("Palavras Chaves");
	palChave.setSize(100,15);
	palChave.setLocation(30, 290);
	palChave.setFont(new Font("HelveticaNeue-Bold", Font.PLAIN, 12));
	
	JTextField txtField7 = new JTextField();
	txtField7.setBounds(30, 310, 712, 20);
	
	JLabel participantes = new JLabel();
	participantes.setText("Participantes");
	participantes.setSize(105,25);
	participantes.setLocation(30, 340);
	participantes.setFont(new Font("HelveticaNeue-Bold", Font.PLAIN, 15));
	
	JLabel matricula = new JLabel();
	matricula.setText("Matricula");
	matricula.setSize(100,15);
	matricula.setLocation(30, 370);
	matricula.setFont(new Font("HelveticaNeue-Bold", Font.PLAIN, 12));
	
	JTextField txtField8 = new JTextField();
	txtField8.setBounds(30, 390, 175, 21);
	
	JButton botao1 = new JButton();
	botao1.setBounds(207, 390, 100, 20);
	botao1.setText("Pesquisar");
	botao1.setFocusable(false);
	botao1.setBackground(new Color(216, 240, 213));
	
	JLabel nome = new JLabel();
	nome.setText("Nome");
	nome.setSize(100,15);
	nome.setLocation(310, 370);
	nome.setFont(new Font("HelveticaNeue-Bold", Font.PLAIN, 12));
	
	JTextField txtField9 = new JTextField();
	txtField9.setBounds(310, 390, 333, 21);
	
	JButton botao2 = new JButton();
	botao2.setBounds(645, 390, 100, 20);
	botao2.setText("Incluir");
	botao2.setFocusable(false);
	botao2.setBackground(new Color(216, 240, 213));
	
	JButton botao3 = new JButton();
	botao3.setBounds(320, 460, 110, 30);
	botao3.setText("Salvar");
	botao3.setFocusable(false);
	botao3.setBackground(new Color(216, 240, 213));
	
	
	janela.add(txtField1);
	janela.add(txtField2);
	janela.add(txtCombo1);
	janela.add(txtField3);
	janela.add(txtField4);
	janela.add(txtField5);
	janela.add(txtField6);
	janela.add(txtField7);
	janela.add(txtField8);
	janela.add(botao1);
	janela.add(txtField9);
	janela.add(botao2);
	janela.add(botao3);
	
	janela.setVisible(true);
	
	janela.add(titulo);
	janela.add(inicio);
	janela.add(fim);
	janela.add(setor);
	janela.add(titulo1);
	janela.add(pauta);
	janela.add(descricao);
	janela.add(tipo);
	janela.add(palChave);
	janela.add(participantes);
	janela.add(matricula);
	janela.add(nome);
	}
	public static void main(String[] args) {
		Exe_13 minhaAta = new Exe_13();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==txtCombo1) {
			System.out.println(txtCombo1.getSelectedItem());
		}
	}
	

}
