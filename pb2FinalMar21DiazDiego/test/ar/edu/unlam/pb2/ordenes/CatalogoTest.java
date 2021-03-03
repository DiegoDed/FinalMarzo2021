package ar.edu.unlam.pb2.ordenes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class CatalogoTest {

	@Test(expected= Exception.class)
	public void queQuitarProductoInexitenteLanceExcepcion() throws Exception{
		Producto p1= new Producto(1,"galletitas", 2.0, 1);
		Producto p2= new Producto(2,"gaseosa", 6.0, 3);
		Producto p3= new Producto(3,"leche", 8.0, 4);
		
		Catalogo c= new Catalogo();
		
		c.agregarProducto(p1, 1);
		c.agregarProducto(p2, 3);
		
		c.quitarProducto(p3);
		
	}
	
	@Test
	public void queAlRemoverStockLaCantidadEnExistenciaSeaCorrecta() {
		Producto p1= new Producto(1,"galletitas", 2.0, 1);
		Producto p2= new Producto(2,"gaseosa", 6.0, 5);
		
		Catalogo c= new Catalogo();
		
		try {
			c.agregarProducto(p1, 1);
			
			c.agregarProducto(p2, 5);
			c.removerStock(p2, 2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Integer resultado= p2.getCantidad();
		
		Integer esperado= 3;
		assertTrue(resultado.equals(esperado));
	}
}
