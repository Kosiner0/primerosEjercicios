package com.cursojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {
		
		//Valores dependientes del entorno
		String url = "jdbc:mysql://localhost:3306/bdpersonas";
		String user = "root";
		String password = "root";
		String query = "update personas set edad = 28 where nombre = 'Ana'";
		
		try (Connection conexion = DriverManager.getConnection(url, user, password);
				Statement sentencia = conexion.createStatement();
			){
			sentencia.execute(query);
			System.out.println("Registro actualizado.");
			
			//Select.main(args);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
