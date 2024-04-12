package ejercicio09;

public class Arania extends Animales {

	public Arania(int numeroPatas) {
		super(8);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		super.comer();
		System.out.println("Las arañas comen mosquitos.");
	}

	@Override
	public void andar() {
		// TODO Auto-generated method stub
		super.andar();
	}

	@Override
	public String toString() {
		return "Arania [numeroPatas=" + numeroPatas + "]";
	}

}


