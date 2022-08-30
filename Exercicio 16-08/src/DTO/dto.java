package DTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
	
	public static void visualizar(DefaultTableModel model, int index, int tam) {
		
		try {
			Connection conn = DB.conectar();
			Statement st = conn.createStatement();
		    for(int i = 1; i <= tam; i++) {
		    	if(index == i) {
					ResultSet res = st.executeQuery("SELECT * FROM comentarios WHERE id=" + i + ";");
			    	while(res.next()) {
						model.addRow(new Object[] {res.getString("id"), res.getString("comentario")});
						}
			    	res.close();
			    	break;
			    }
		    }
			st.close();
			DB.desconectar(conn);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
	}
	
}
