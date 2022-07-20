import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Exe_14 implements ActionListener  {
	JButton botao;
	JTextField campo;
	
	Exe_14(){
		
		JFrame janela = new JFrame();
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLayout(null);
		janela.setSize(400, 450);
		
		botao = new JButton();
		botao.addActionListener(this);
		botao.setBounds(95, 100, 200, 40);
		botao.setText("Clique aqui");
		botao.setFocusable(false);
		
		campo = new JTextField();
		campo.setBounds(95, 70, 200, 30);
		
		
		janela.add(botao);
		janela.add(campo);
		janela.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Exe_14 botao = new Exe_14();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		campo.setText("O botão esta funcionando");
	}

}
