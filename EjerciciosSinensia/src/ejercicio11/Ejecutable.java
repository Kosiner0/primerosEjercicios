package ejercicio11;

public class Ejecutable {

	public static void main(String[] args) {
		
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];
		
		electrodomesticos[0] = new Electrodomestico(100, "Blanco", 'A', 10);
        electrodomesticos[1] = new Lavadora(150, "GriS", 'B', 15, 7);
        electrodomesticos[2] = new Television(200, "Negro", 'C', 20, 40, true);
        electrodomesticos[3] = new Electrodomestico(120, "Rojo", 'D', 12);
        electrodomesticos[4] = new Lavadora(180, "AzUl", 'E', 18, 8);
        electrodomesticos[5] = new Television(250, "Plateado", 'F', 25, 50, false);
        electrodomesticos[6] = new Electrodomestico(130, "Verde", 'G', 13);
        electrodomesticos[7] = new Lavadora(170, "Blanco", 'A', 17, 9);
        electrodomesticos[8] = new Television(280, "NEGRO", 'B', 30, 60, true);
        electrodomesticos[9] = new Electrodomestico(140, "Gris", 'c', 14);
		
        double precioTotalElectrodomesticos = 0;
        double precioTotalLavadoras = 0;
        double precioTotalTelevisiones = 0;
        
        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Lavadora) {
                precioTotalLavadoras += electrodomestico.precioFinal();
            } else if (electrodomestico instanceof Television) {
                precioTotalTelevisiones += electrodomestico.precioFinal();
            }
            precioTotalElectrodomesticos += electrodomestico.precioFinal();
        }
        
        System.out.println("-Precio total de las lavadoras: " + String.format("%.2f", precioTotalLavadoras) + " €.");
        System.out.println("-Precio total de las televisiones: " + String.format("%.2f", precioTotalTelevisiones) + " €.");
        System.out.println("-Precio total de todos los electrodomesticos: " + String.format("%.2f", precioTotalElectrodomesticos) + " €.");
   
		
	}

}
