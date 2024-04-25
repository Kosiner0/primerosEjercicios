package com.cursojava.ejercicioBD1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Metodos {

	private static String url = "jdbc:mysql://localhost:3306/ej_bd";
	private static String user = "root";
	private static String password = "root";
	
	
	public static boolean buscarCodigo(int codigo) {
		String query = "select * from empleados";
		
		try (Connection conexion = DriverManager.getConnection(url, user, password);
				Statement sentencia = conexion.createStatement();
				ResultSet rs = sentencia.executeQuery(query);
			){
			
			while(rs.next()) {
				if(rs.getInt("idempleado") == codigo) {
					return true;
				}
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static boolean insertarEmpleado(int codigo, String nombre, String apellido, String fechaNacimiento, double salario) {
		boolean insertado = false;
		String query = "insert into empleados values ("+ codigo +", '"+ nombre +"',"
				+ " '"+ apellido +"', '"+ fechaNacimiento +"', "+ salario +")";
		
		try (Connection conexion = DriverManager.getConnection(url, user, password);
				Statement sentencia = conexion.createStatement();
				){
			
			sentencia.executeUpdate(query);
			insertado = true;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return insertado;
	}
	
	public static boolean actualizarNombreUsuario(int codigo, String nombre) {
		boolean actualizado = false;
		String query = "update empleados set nombre = '"+ nombre +"' WHERE idempleado = "+ codigo +"";
		
		try (Connection conexion = DriverManager.getConnection(url, user, password);
				Statement sentencia = conexion.createStatement();
			){
			sentencia.execute(query);
			actualizado = true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return actualizado;
	}
	
	public static void mostrarDatos() {
		String query = "select * from empleados";
		
		try (Connection conexion = DriverManager.getConnection(url, user, password);
				Statement sentencia = conexion.createStatement();
				ResultSet rs = sentencia.executeQuery(query);
			){
			
			while(rs.next()) {
				System.out.print("Id empleado=" + rs.getInt("idempleado"));
				System.out.print(", ");
				System.out.print("nombre=" + rs.getString("nombre"));
				System.out.print(", ");
				System.out.print("apellido=" + rs.getString("apellido"));
				System.out.print(", ");
				System.out.print("fecha nacimiento=" + rs.getString("fecha_nacimiento"));
				System.out.print(", ");
				System.out.print("salario=" + rs.getDouble("salario"));
				System.out.println();
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void mostrarDatosPorSalario() {
		String query = "select * from empleados WHERE salario > 1800";
		
		try (Connection conexion = DriverManager.getConnection(url, user, password);
				Statement sentencia = conexion.createStatement();
				ResultSet rs = sentencia.executeQuery(query);
			){
			
			while(rs.next()) {
				System.out.print("Id empleado=" + rs.getInt("idempleado"));
				System.out.print(", ");
				System.out.print("nombre=" + rs.getString("nombre"));
				System.out.print(", ");
				System.out.print("apellido=" + rs.getString("apellido"));
				System.out.print(", ");
				System.out.print("fecha nacimiento=" + rs.getString("fecha_nacimiento"));
				System.out.print(", ");
				System.out.print("salario=" + rs.getDouble("salario"));
				System.out.println();
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean actualizarUsuario(int codigo, String nombre, String apellido, String fechaNacimiento, double salario) {
		boolean actualizado = false;
		String query = "update empleados set nombre = ?, apellido = ?, fecha_nacimiento = ?, salario = ? WHERE idempleado = ? ";
		
		try (Connection conexion = DriverManager.getConnection(url, user, password);
				PreparedStatement sentencia = conexion.prepareStatement(query);
			){
			
			sentencia.setString(1, nombre);
			sentencia.setString(2, apellido);
			sentencia.setString(3, fechaNacimiento);
			sentencia.setDouble(4, salario);
			sentencia.setInt(5, codigo);
			
			if(sentencia.executeUpdate() > 0) {
				actualizado = true;
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return actualizado;
	}
	
}
