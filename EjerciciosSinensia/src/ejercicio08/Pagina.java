package ejercicio08;

public class Pagina implements Imprimible{
	
	private int nPagina;
	private int nLineas;
	
	public Pagina(int nPagina, int nLineas) {
		super();
		this.nPagina = nPagina;
		this.nLineas = nLineas;
	}

	@Override
	public void informeLargo() {
		System.out.println("Número de páginas: " + nPagina + ", número de líneas: " + nLineas);
		
	}

	@Override
	public void informeCorto() {
		System.out.println("Número de páginas: " + nPagina);
		
	}
	
	
}
