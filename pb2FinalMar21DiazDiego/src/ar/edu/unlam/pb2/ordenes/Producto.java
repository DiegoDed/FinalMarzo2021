package ar.edu.unlam.pb2.ordenes;


public class Producto implements Comparable<Producto>{
	private Integer numero;
	private String descripcion;
	private Double precio;
	private Integer cantidad;
	/*
	 * Se crea un producto.
	 */
	public Producto(Integer numero, String descripcion, Double precio, Integer cantidad) {		
		this.numero=numero;
		this.descripcion=descripcion;
		this.precio=precio;
		this.cantidad=cantidad;
	}
	
	/*
	 * Retorna el precio unitario del Producto.
	*/
	public Double getPrecio() {
		return this.precio;
	}
	
	/*
	 * Devulve el monto del impuesto.
	 * Todo producto tiene un 21% de impuesto.
	 */
	public Double getImpuesto() {
		Double impuesto= getPrecio()*0.21;
		return impuesto;
	}
	
	/*
	 * Devuelve la descripción del Producto
	 */
	public String getDescripcion() {
		return this.descripcion;
	}
	
	/*
	 * Devuelve el precio del producto luego de aplicar el impuesto.
	 */
	public Double getPrecioFinal() {
		Double precioFinal= getPrecio()+ getImpuesto();
		return precioFinal;
	}
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	
	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public int compareTo(Producto producto) {
		return this.numero.compareTo(producto.getNumero());
	}
	
}
