package ejercicio03;

abstract class Productos {
	
	protected int codigo;
	protected String modelo;
	protected double precio;
	protected int cantidad;
	
	public Productos(int codigo, String modelo, double precio, int cantidad) {
		this.codigo = codigo;
		this.modelo = modelo;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public int getCodigo() {
		return codigo;
	}


	public String getModelo() {
		return modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public int getCantidad() {
		return cantidad;
	}
	
	abstract void mostrarInformacion();
	
	
}
