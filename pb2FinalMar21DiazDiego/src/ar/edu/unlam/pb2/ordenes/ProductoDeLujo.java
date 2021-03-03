package ar.edu.unlam.pb2.ordenes;

/*
 * Es un tipo "especial" de Producto.
 */
public class ProductoDeLujo extends Producto{	
	
	
	public ProductoDeLujo(Integer numero, String descripcion, Double precio, Integer cantidad) {
		super(numero, descripcion, precio, cantidad);
	}

	/*
	 * Se le aplica el 21% y un 15% de impuesto adicional 
	 * por derechos de importación.
	 */
	
	@Override
	public Double getImpuesto() {
		Double precioImpuesto= (getPrecio() * 0.21)+(getPrecio()*0.15);
		
		return precioImpuesto;
	}

}
