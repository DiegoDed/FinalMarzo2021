package ar.edu.unlam.pb2.ordenes;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Orden {
	private Date fechaRecepcion;
	private Integer ID;
	private LinkedList<LineaOrden> lineasOrden;
	
	/*
	 * Se agrega un Item a la Orden
	 */
	public Orden(Date fechaRecepcion, Integer iD) {
		this.fechaRecepcion = fechaRecepcion;
		this.ID = iD;
		lineasOrden= new LinkedList<LineaOrden>();
	}

	public void agregarLinea(LineaOrden linea) {	
		lineasOrden.add(linea);
	}
	
	
	/*
	 * Se obtienen las Lineas de la Orden
	 */
	public List<LineaOrden> obtenerLineas() {
		return lineasOrden;		
	}
		
	/*
	 * Devuelve el precio total de la Orden
	 */
	
	public Double obtenerPrecioTotal (){
		Double total=0.0;
		for(LineaOrden o:lineasOrden) {
			total=o.getSubtotal();
		}
		return total;
	}	
	
}
