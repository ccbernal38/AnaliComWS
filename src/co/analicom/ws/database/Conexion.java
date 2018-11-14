package co.analicom.ws.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;


public class Conexion {
	Connection conn = null;

	public Conexion() {

	}

	public Connection getConexionFM() throws Exception {
		// registrar el controlador de cliente JDBC
		try {
			Class.forName("com.filemaker.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:filemaker://192.168.1.33/AnalisoftV2", "jdbc", "Alca2010!");			
		} catch (Exception e) {
			System.out.println(e);
		}
		return conn;
	}
	
	public Connection getConexionHC() throws Exception {
		// registrar el controlador de cliente JDBC
		try {
			Class.forName("com.filemaker.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:filemaker://192.168.1.31/AnaliSO_Pruebas", "jdbc", "Alca2010!");			
		} catch (Exception e) {
			System.out.println(e);
		}
		return conn;
	}

	public Connection getConexionMySQL() throws Exception {

		Class.forName("com.mysql.jdbc.Driver").newInstance();
		conn = DriverManager.getConnection(
				"jdbc:mysql://192.168.1.33:3306/lisweb?useUnicode=yes&characterEncoding=UTF-8", "lisweb", "Alca2010!");

		return conn;
	}

	public Connection getConexionSQLServer() throws Exception {
		Connection con = DriverManager.getConnection(
				"jdbc:sqlserver://192.168.1.112:1433;databaseName=ANALIZARSAS;user=sa;password=Gracp1234");
		return con;
	}
	

	public void cerrarConexion() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
