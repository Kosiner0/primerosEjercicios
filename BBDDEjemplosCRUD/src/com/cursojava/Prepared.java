package com.cursojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Prepared {

	public static void main(String[] args) {
		
		//Valores dependientes del entorno
		String url = "jdbc:mysql://localhost:3306/bdpersonas";
		String user = "root";
		String password = "root";
		String query = "select * from personas where edad > ?";
		int valor = 25;
		
		try (Connection conexion = DriverManager.getConnection(url, user, password);
				PreparedStatement sentencia = conexion.prepareStatement(query);
			){
			
			sentencia.setInt(1, valor);
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
		

	}
	
	

}
