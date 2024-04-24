package com.cursojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {
		
		//Valores dependientes del entorno
		String url = "jdbc:mysql://localhost:3306/bdpersonas";
		String user = "root";
		String pwd = "root";
		String query = "insert into personas (nombre, apellido, edad) values ('Ana', 'Varas', 32)";
		
		try (Connection conexion = DriverManager.getConnection(url, user, pwd);
				Statement sentencia = conexion.createStatement();
				){
			
			sentencia.executeUpdate(query);
			System.out.println("Registro insertado.");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
