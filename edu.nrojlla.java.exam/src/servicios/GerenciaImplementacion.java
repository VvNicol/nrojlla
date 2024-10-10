/**
 * 
 */
package servicios;

import java.io.IOException;
import java.util.Scanner;

import controlador.Inicio;
import dto.ClienteDto;
import util.util;

/**
 * Detalle de los metodos de gerencia interfaz
 * 
 * @author nrojlla 101024
 */
public class GerenciaImplementacion implements GerenciaInterfaz {

	Scanner sc = new Scanner(System.in);

	@Override
	public void DarAltaCliente() throws IOException {
		boolean esCerrado = false;

		do {
			System.out.println("Ingrese el nombre del cliente");
			String nombre = sc.nextLine();

			System.out.println("Ingrese la apellidos del clienteo");
			String apellidos = sc.nextLine();

			Long id = util.CalculoIdCliente();
			
			
			ClienteDto c = new ClienteDto();
			
			c.setNombre(nombre);
			c.setApellidos(apellidos);
			c.setId(id);
			
			Inicio.ClienteLista.add(c);

			System.out.println("¿Desea seguir agregando pedidos? s/n");
			String sn = sc.nextLine().toLowerCase();

			if (sn.equals("n")) {
				esCerrado = true;
			}

		} while (!esCerrado);

	}
}
