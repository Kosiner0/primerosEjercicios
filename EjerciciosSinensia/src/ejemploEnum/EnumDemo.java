package ejemploEnum;

public class EnumDemo {

	public static void main(String[] args) {
		Tutoriales t1, t2, t3;
		
		t1 = Tutoriales.JAVA;
		t2 = Tutoriales.HTML;
		t3 = Tutoriales.MYSQL;
		
		System.out.println("Programando en " + t1 + ", Valor = " + Tutoriales.valueOf("JAVA"));
		System.out.println("Programando en " + t2 + ", Valor = " + Tutoriales.valueOf("HTML"));
		System.out.println("Programando en " + t3 + ", Valor = " + Tutoriales.valueOf("MYSQL"));
		System.out.println();
		
		for(Tutoriales tuto : Tutoriales.values()) {
			System.out.println(tuto + " tutorial.");
		}

	}

}
