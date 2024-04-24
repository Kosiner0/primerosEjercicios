package com.cursojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {

		//Valores dependientes del entorno
		String url = "jdbc:mysql://localhost:3306/bdpersonas";
		String user = "root";
		String password = "root";
		String query = "delete from personas where nombre = 'Pepito'";
		
		try (Connection conexion = DriverManager.getConnection(url, user, password);
				Statement sentencia = conexion.createStatement();
			){
			sentencia.execute(query);
			System.out.println("Registro eliminado.");
			
			//Select.main(args);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
