package DTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import DAO.DB;

public class Crud {

	public void inserir(String id, String nome, String email) {
		try {
			Connection conn = DB.conectar();
			PreparedStatement st = conn.prepareStatement("INSERT INTO usuario VALUES (?, ?, ?)");
			st.setString(1, id);
			st.setString(2, nome);
			st.setString(3, email);
				
			st.executeUpdate();
			st.close();
			DB.desconectar(conn);
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, erro.getMessage());
		}
	}
	
	public void excluir(String id) {
		try {
			Connection conn = DB.conectar();
			PreparedStatement st = conn.prepareStatement("DELETE FROM usuario WHERE id=?");
			st.setString(1, id);
			st.executeUpdate();
			st.close();
			DB.desconectar(conn);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	
	public void alterar(String id, String nome, String email) {
		try {
			Connection conn = DB.conectar();
			PreparedStatement st = conn.prepareStatement("UPDATE usuario SET nome=?, email=? WHERE id=?");
			st.setString(1, nome);
			st.setString(2, email);
			st.setString(3, id);
			st.executeUpdate();
			st.close();
			DB.desconectar(conn);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
