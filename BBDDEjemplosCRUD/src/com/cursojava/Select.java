package com.cursojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) {
		
		//Valores dependientes del entorno
		String url = "jdbc:mysql://localhost:3306/bdpersonas";
		String user = "root";
		String password = "root";
		String query = "select * from personas";
		
		try (Connection conexion = DriverManager.getConnection(url, user, password);
				Statement sentencia = conexion.createStatement();
				ResultSet rs = sentencia.executeQuery(query);
			){
			
			while(rs.next()) {
				System.out.print(rs.getString(1)); //saca el nombre, columna 1
				System.out.print(" ");
				System.out.print(rs.getString("apellido"));
				System.out.print(" ");
				System.out.print(rs.getInt("edad"));
				System.out.println();
				
				//tambien existe getDate(), getDouble(), etc.
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
