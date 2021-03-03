package ar.edu.unlam.pb2.ordenes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ProductoTest {
	@Test
	public void queSePuedePedirImpuestoSobreProducto() {		
		Producto p= new Producto(1,"galletitas", 2.0, 1);
		Double impuesto=p.getImpuesto();
		Double esperado= 0.42;
		assertTrue(impuesto.equals(esperado));
	}
	
	@Test
	public void queSePuedePedirImpuestoSobreProductoDeLujo() {		
		
		Producto p= new ProductoDeLujo(1,"galletitas", 2.0, 1);
		Double impuesto=p.getImpuesto();
		Double esperado= 0.72;
		assertTrue(impuesto.equals(esperado));
	}
	
}
