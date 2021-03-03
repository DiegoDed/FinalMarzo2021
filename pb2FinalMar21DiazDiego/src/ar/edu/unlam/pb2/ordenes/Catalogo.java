package ar.edu.unlam.pb2.ordenes;

import java.util.Set;
import java.util.TreeSet;

/*
 * Mantiene una colección de Productos, los cuales no pueden
 * estar duplicados. Además, por cada Producto se desea mantener 
 * la cantidad del mismo en Stock,
 */
public class Catalogo {
	
	/*
	 * ¿Cuál es la colección adecuada?
	 */
	
	private Set<Producto> productos;
	
	
	public Catalogo() {
		productos= new TreeSet<Producto>();
	}
	
	
	/*
	 * Agregar producto al catálogo.
	 * No se permiten Productos duplicados. Criterio: número de Producto. 
	 */
	public Boolean agregarProducto(Producto producto, Integer cantidad) throws Exception{
		Boolean seAgrego= false;
		
		if(!(productos.contains(producto))) {
			producto.setCantidad(cantidad);
			seAgrego= productos.add(producto);
		}else {
			throw new Exception("Producto ya existente");
		}
		
		
		return seAgrego;
	}
	
	/*
	 * Remueve Producto del Catálogo.
	 * Lanza una Excepción si el Producto no se encuentra en el Catálogo.
	 */
	public Boolean quitarProducto(Producto producto) throws Exception{
		Boolean seQuito=false;
		
		if(!(productos.contains(producto))) {
			throw new Exception("No se encontro el producto a remover");
		}else {
			for(Producto p: productos)
				if(p.getNumero().equals(producto.getNumero())) {
				 
				 seQuito=productos.remove(producto);
				}
		}
		return seQuito;
	}
	
	/*
	 * Descuenta la cantidad deseada de producto del Stock.
	 */
	
	public Boolean removerStock(Producto producto, Integer cantidad) throws Exception{
		Boolean removido=false;
		
		if(!(productos.contains(producto))) {
			throw new Exception("No se encontro el producto a remover");
		}else {
			for(Producto p:productos) {
				if(p.getNumero().equals(producto.getNumero())) {
					
					producto.setCantidad(producto.getCantidad()-cantidad);
					removido=true;
				}
			}
		}
		
		return removido;
	}
	
	/*
	 * Devuleve la cantidad de Productos en existencia.
	 */
	public Integer obtenerCantidad(Producto producto) {
		Integer cantidadDelProducto=0;
		for(Producto p: productos) {
			if(p.getNumero().equals(producto.getNumero())) {
				cantidadDelProducto=producto.getCantidad();
			}
		}
		return cantidadDelProducto;
	}
}
