/**
 * 
 */
package servicios;

import java.io.IOException;

/**
 * Lista de los metodos del menu
 * @author nrojlla 101024
 */
public interface MenuInterfaz {

	/**
	 * Vista del menu inicial
	 * @return byte
	 * @author nrojlla 101024
	 * @throws IOException 
	 */
	byte mostrarMenuInicial() throws IOException;
  
	/**
	 * Opciones de menu empleado
	 * @throws IOException
	 * @author nrojlla 101024
	 */
	void MenuEmpleado() throws IOException;

	/**
	 * Opciones de menu gerencia
	 * @throws IOException
	 * @author nrojlla 101024
	 */
	void MenuGerencia() throws IOException ;

}
