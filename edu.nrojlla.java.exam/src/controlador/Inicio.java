/**
 * 
 */
package controlador;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import dto.ClienteDto;
import dto.CompraDto;
import servicios.FicheroImplementacion;
import servicios.FicheroInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

/**
 * Menu principal de tienda
 * 
 * @author nrojlla
 */
public class Inicio {

	/**
	 * Aplicacion de tienda
	 *
	 * @param args
	 */

	public static List<CompraDto> CompraLista = new ArrayList<CompraDto>();
	public static List<ClienteDto> ClienteLista = new ArrayList<ClienteDto>();
	
	public static String directorioFicheros = "ficheros";
	public static String ficheroLog = directorioFicheros + File.separator + "ficheroLog" + ".txt";
	public static FicheroInterfaz fi = new FicheroImplementacion();
	public static String mensaje = "";
	
	public static void main(String[] args) {

		MenuInterfaz mi = new MenuImplementacion();
		

		byte opcion = 0;
		boolean esCerrado = false;
		
		do {

			try {

				mensaje = "Menu principal";
				fi.ImprimirFichero(mensaje, ficheroLog);
				opcion = mi.mostrarMenuInicial();

				switch (opcion) {
				case 0:
					mensaje = "Cerrar aplicacion";
					fi.ImprimirFichero(mensaje, ficheroLog);
					System.out.println("Ha cerrado la aplicacion");
					esCerrado = true;

					break;
				case 1:
					mensaje = "Menu empleado";
					fi.ImprimirFichero(mensaje, ficheroLog);
					System.out.println("Ha seleccionado menu empleado");
					mi.MenuEmpleado();

					break;
				case 2:
					mensaje = "Menu gerencia";
					fi.ImprimirFichero(mensaje, ficheroLog);
					mi.MenuGerencia();
					System.out.println("Ha seleccionado menu gerencia");
					break;

				default:
					mensaje = "Opcion " + opcion + " no disponible";
					fi.ImprimirFichero(mensaje,ficheroLog);
					System.out.println(mensaje);
					break;
				}

			} catch (Exception e) {
				System.out.println("Ha ocurrido un error: " + e.getMessage());
				e.printStackTrace();
				try {
					fi.ImprimirFichero("Error: " + e.getMessage(), ficheroLog);
				} catch (Exception e1) {

					System.out.println("Error al escribir en el fichero log: " + e1.getMessage());
					e1.printStackTrace();
				}
			}

		} while (!esCerrado);

	}

}
