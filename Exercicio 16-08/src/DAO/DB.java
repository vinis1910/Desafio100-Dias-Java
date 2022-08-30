package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	
	public static Connection conectar() {
		String CLASS_DRIVER = "com.mysql.cj.jdbc.Driver";
		String user = "root";
		String senha = "Batutinha1$";
		String URL_SERVIDOR = "jdbc:mysql://localhost:3306/aula40?useSSL=false";
		try {
			Class.forName(CLASS_DRIVER);
			return DriverManager.getConnection(URL_SERVIDOR, user, senha);
			
		}catch (Exception e) {
			if(e instanceof ClassNotFoundException) {
				System.out.println("Verifique o driver de conexao");
			}else {
				System.out.println("Verifique se o servidor esta ativo");
			}
			return null;
		}
	}
	
	public static void desconectar(Connection conn) {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println("Nao foi possivel desconectar");
				e.printStackTrace();
			}
		}
	}
}
