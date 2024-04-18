package com.pruebas.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ejecutable {

	public static void main(String[] args) {
		/*
		*	Multiplicador multiplicador = (x, y) -> x * y;
		*	int d = multiplicador.multiplicar(2, 3);
		*	System.out.println(d);
		*/
		
		IntBinaryOperator multiplicacion = Math::multiplyExact;
		int resultado = multiplicacion.applyAsInt(5, 10);
		System.out.println("El resultado de la multiplicación es: " + resultado);
		
		/*
		 * 
		 */
		// Uso de expresiones lambda y referencias a métodos
		List<String> nombres = Arrays.asList("Ana", "Carlos", "David", "Beatriz");
		System.out.println(" \nAntes del sort: " + nombres);
		nombres.sort(Comparable::compareTo);
		System.out.println(" Después del sort: " + nombres);

		// O también
		nombres.sort((nombre1, nombre2) -> nombre1.compareTo(nombre2));
		System.out.println(" Después del otro tipo de sort: " + nombres);
		
		/*
		 * 
		 */
		IntPredicate esPar = num -> num % 2 == 0;
		System.out.println("\n¿Es par?" + esPar.test(6));
		System.out.println("¿Es par?" + esPar.test(15));
		
		
		List<Integer> numeros = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8);

		// Usamos filter para seleccionar solo los números pares
		List<Integer> numerosPares = numeros.stream()
		.filter(numero -> numero % 2 == 0)
		.collect(Collectors.toList());
		System.out.println("\nNúmeros pares: " + numerosPares);
		
		/*
		 * 
		 */
		Set<String> nombres2 = new TreeSet<>(Arrays.asList( "Ana", "Carlos", "David", "Beatriz", "Armando", "Ángel"))
				.stream()
				.filter(nombre -> nombre.startsWith("A"))
				.collect(Collectors.toSet());
		System.out.println("\nNombres que empiezan por A: " + nombres2);
		
		
		Predicate<String> empiezaPorA = nombre -> nombre.startsWith("A");
		System.out.println("Otra forma de sacar nombres que empiezan por 'A': ");	
		nombres2.stream()
			.filter(empiezaPorA)
			.forEach(System.out::println);

		/*
		 * 
		 */
		IntPredicate esMayorQue3 = num -> (num > 3);
		
		List<Integer> mayoresQue3 = numeros.stream()
		.filter(esMayorQue3::test)
		.collect(Collectors.toList());
		
		// Imprimimos los resultados
		System.out.println("\nMayores que 3: " + mayoresQue3);
		
		/*
		 * 
		 */
		Stream<String> input = Arrays.stream(new String[] { "Rohan", "Mordor", "elandir" });

		// Mapear la función toUpperCase() a cada elemento de la lista
		System.out.println("\nCada nombre en mayúsculas: " + input.map(nombre -> nombre.toUpperCase()).collect(Collectors.toList()));
		
		List<String> nombresRepetidos = Arrays.asList("Ana", "Carlos", "David", "Beatriz", "Armando", "Ana", "Carlos"); 
		System.out.println("Saca los nombres a excepción de los repetidos: " + nombresRepetidos.stream().distinct().collect(Collectors.toList()));

		/*
		 * 
		 */
		List<String> nombresDesordenados = Arrays.asList(
				"Ana", "Carlos", "David", "Beatriz", "Armando"); 
		System.out.println("\nNombres ordenados por default: " + nombresDesordenados
				.stream()
				.sorted()
				.collect(Collectors.toList()));
				
		System.out.println("Nombres ordenados por tamaño: " + nombresDesordenados
				.stream()
				.sorted(Comparator.comparing(String::length))
				.collect(Collectors.toList()));
		
		/*
		 * 
		 */
		List<Integer> notas = Arrays.asList(5, 2, 8, 8, 7, 6, 7, 4, 3, 10);
		// Utilizamos limit para obtener los primeros tres elementos
		List<Integer> primerasCuatroNotas = notas.stream()
			.limit(4)
			.collect(Collectors.toList());
		System.out.println("\nSaca los primeros 4 números de una lista de 10 números: ");
		primerasCuatroNotas.forEach(System.out::println);

		
		List<Integer> restantesNotas = notas.stream()
				.skip(4)
				.collect(Collectors.toList()); 
		System.out.println("Saca los números restantes, omite los primeros 4 de la lista: " + restantesNotas);
		
		
		Optional<Integer> suma = notas.stream()
				.reduce((a, b) -> a + b);

		System.out.print("Saca la suma de todos los números de la lista: ");
		suma.ifPresent(System.out::println); 
		
		// Calcular la media
		double media = notas.stream()
				.mapToDouble(Double::valueOf)
				.average()
				.orElse(0.0); // Valor predeterminado si no hay elementos
		System.out.println("Media de la lista de números: " + media);

		double desviacionTipica = Math.sqrt( notas.stream()
				.mapToDouble(Double::valueOf)
				.map(nota -> Math.pow(nota - media, 2))
				.average()
				.orElse(0.0) // Valor predeterminado si no hay elementos
				);

		System.out.println("Desviación Típica de la lista de números: " + desviacionTipica);

		
		
		
		
		
		
		
		
	}

}
