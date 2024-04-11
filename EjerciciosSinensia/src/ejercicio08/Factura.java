package ejercicio08;

public class Factura implements Imprimible{

	private int nFactura;
	private int codigoCliente;
	
	public Factura(int nFactura, int codigoCliente) {
		super();
		this.nFactura = nFactura;
		this.codigoCliente = codigoCliente;
	}

	@Override
	public void informeLargo() {
		System.out.println("Número de factura: " + nFactura + ", código del cliente: " + codigoCliente);
		
	}

	@Override
	public void informeCorto() {
		System.out.println("Número de factura: " + nFactura);
		
	}
}
