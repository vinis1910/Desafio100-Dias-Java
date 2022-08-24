package DTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
			e.getStackTrace();
		}
	}
	
	public void listar(DefaultTableModel model) {
		try {
			Connection conn = DB.conectar();
			Statement st = conn.createStatement();
		    ResultSet res = st.executeQuery("SELECT * FROM usuario");
			
			while(res.next()) {
				String codigo = res.getString("ID");
				String nome = res.getString("Nome");
				String email = res.getString("Email");
				model.addRow(new Object[] {codigo, nome, email});
				}
			res.close();
			st.close();
			DB.desconectar(conn);
			
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	
}
