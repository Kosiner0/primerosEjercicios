package com.porLaTarde.biblioteca;

public interface Bibliotecario {

	void seleccionarDocumento(int codigo);
	void prestarDocumentoActual(String dni);
	void devolverDocumentoActual();
	void buscarDocumentos(String textoBuscar);
	void generarInformePrestamos();
	
}
