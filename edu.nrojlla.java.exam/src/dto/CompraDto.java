/**
 * 
 */
package dto;

import java.time.LocalDateTime;

/**
 * Datos de compra
 * 
 * @author nrojlla
 */
public class CompraDto {
	Long id;
	Long idCliente;
	String nombre = "aaaaa";
	double importe = 99999;
	LocalDateTime instante = LocalDateTime.of(9999, 12, 31, 23, 59, 59);

	/**
	 * @return the idCliente
	 */
	public Long getIdCliente() {
		return idCliente;
	}

	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the importe
	 */
	public double getImporte() {
		return importe;
	}

	/**
	 * @param importe the importe to set
	 */
	public void setImporte(double importe) {
		this.importe = importe;
	}

	/**
	 * @return the instante
	 */
	public LocalDateTime getInstante() {
		return instante;
	}

	/**
	 * @param instante the instante to set
	 */
	public void setInstante(LocalDateTime instante) {
		this.instante = instante;
	}

}
