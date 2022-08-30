package DTO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import DAO.DB;

public class dto {

	public static void inserirComentario(Integer id,String nome,String comentario) {
		
		try {
			Connection conn = DB.conectar();
			PreparedStatement st = conn.prepareStatement("INSERT INTO comentarios(id, comentario) VALUES (?, ?);");
			st.setInt(1, id);
			st.setString(2, comentario);
			st.executeUpdate();
			st.close();
			DB.desconectar(conn);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
}
