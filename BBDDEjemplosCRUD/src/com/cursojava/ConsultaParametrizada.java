package com.cursojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultaParametrizada {
	private static String url = "jdbc:mysql://localhost:3306/bdpersonas";
	private static String user = "root";
	private static String password = "root";
	private static String query = "select * from personas where nombre = ?";

	
	public static void main(String[] args) {
		
		try {
			Connection conexion = DriverManager.getConnection(url, user, password);
			generarConsultaParametriza(query, "ana", conexion);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static PreparedStatement generarConsultaParametriza(String sql, String nombre, Connection conexion) {
		
		try (conexion; PreparedStatement sentencia = conexion.prepareStatement(sql); ){
			
			sentencia.setString(1, nombre);
			ResultSet rs = sentencia.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getString("nombre"));
				System.out.print(" ");
				System.out.print(rs.getString("apellido"));
				System.out.print(" ");
				System.out.print(rs.getInt("edad"));
				System.out.println();
			}
			rs.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}


