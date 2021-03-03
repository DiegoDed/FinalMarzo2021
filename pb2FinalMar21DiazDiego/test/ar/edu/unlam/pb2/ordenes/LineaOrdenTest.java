package ar.edu.unlam.pb2.ordenes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LineaOrdenTest {
	@Test
	public void queSePuedeCalcularElTotalPorDetalle() {		
		Producto p= new Producto(1,"galletitas", 2.0, 2);
		LineaOrden l= new LineaOrden(p, 2);
		
		Double resultado=l.getSubtotal();
		Double esperado= 4.84;
		assertTrue(resultado.equals(esperado));
	}
	
}
