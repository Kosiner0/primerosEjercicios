package ejercicio07;

public class Orquesta {

	public static void main(String[] args) {
		
		Flauta flauta = new Flauta("Flauton", "Alargada", "Turbo2000");
		Guitarra guitarra = new Guitarra("Guitarra", "Española", 6);
		GuitarraElectrica electrica = new GuitarraElectrica("Guitarra", "Electrica", 4, 1200);
		Tambor tambor = new Tambor("Tambor", "Percusion", 50);
		
		flauta.tocar();flauta.afinar();System.out.println();
		guitarra.tocar();guitarra.afinar();System.out.println();
		electrica.tocar();electrica.afinar();System.out.println();
		tambor.aporrear();
		System.out.println("\n"+ flauta.toString() + "\n" + guitarra.toString() + "\n" + electrica.toString() + "\n" + tambor.toString());

	}

}
