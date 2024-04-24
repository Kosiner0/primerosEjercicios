package com.cursojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejemplo1 {

	public static void main(String[] args) {
		String cadenaConexion = "jdbc:mysql://localhost:3306/bdpersonas";
		
		
		try (Connection conexion = DriverManager.getConnection(cadenaConexion, "root", "root");
			 Statement sentencia = conexion.createStatement();
				){
			sentencia.executeUpdate("insert into personas (nombre, apellido, edad) values ('Pepito', 'Sera', 20)");
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
