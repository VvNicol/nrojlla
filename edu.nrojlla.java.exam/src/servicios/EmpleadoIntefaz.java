package servicios;

import java.io.IOException;

/**
 * Lista de los metodos de empleado
 * 
 * @author nrojlla 101024
 */
public interface EmpleadoIntefaz {

	/**
	 * Calculo total de ventas mensual
	 * 
	 * @author nrojlla 101024
	 * @throws IOException 
	 */
	void CalculoTotalMensual() throws IOException;

	/**
	 * agregar compras a un cliente
	 * 
	 * @author nrojlla 101024
	 * @throws IOException 
	 */
	void AgregarCompraCliente() throws IOException;

}
