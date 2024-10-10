/**
 * 
 */
package servicios;

import java.io.IOException;
import java.util.Scanner;

import controlador.Inicio;

/**
 * Detalle de los metodos del menu interfaz
 * 
 * @author nrojlla 101024
 */
public class MenuImplementacion implements MenuInterfaz {

	Scanner sc = new Scanner(System.in);
	EmpleadoIntefaz oi = new EmpleadoImplementacion();
	GerenciaInterfaz gi = new GerenciaImplementacion();

	@Override
	public byte mostrarMenuInicial() throws IOException {
		System.out.println("---------------------");
		System.out.println("-----Menu incial-----");
		System.out.println("0.Cerrar menu");
		System.out.println("1.Menu empleado");
		System.out.println("2.Menu gerencia");
		System.out.println("---------------------");
		System.out.println("Selecciona una opcion:");
		System.out.println("---------------------");
		byte opcion = sc.nextByte();
		return opcion;
	}

	@Override
	public void MenuEmpleado() throws IOException {

		byte opcion = 0;
		boolean esCerrado = false;

		do {

			opcion = MenuEmpleadoVista();

			switch (opcion) {
			case 0:
				Inicio.mensaje = "volver";
				Inicio.fi.ImprimirFichero(Inicio.mensaje, Inicio.ficheroLog);
				System.out.println("Volver");
				esCerrado = true;
				break;

			case 1:
				Inicio.mensaje = "Calculo total mensual";
				Inicio.fi.ImprimirFichero(Inicio.mensaje, Inicio.ficheroLog);
				oi.CalculoTotalMensual();
				break;

			case 2:
				Inicio.mensaje = "Agregar compra a cliente";
				Inicio.fi.ImprimirFichero(Inicio.mensaje, Inicio.ficheroLog);
				oi.AgregarCompraCliente();
				break;

			default:
				Inicio.mensaje = "Opcion " + opcion + " no disponible";
				Inicio.fi.ImprimirFichero(Inicio.mensaje, Inicio.ficheroLog);
				System.out.println(Inicio.mensaje);
				break;
			}

		} while (!esCerrado);

	}

	/**
	 * Vista del menu empleado
	 * 
	 * @author nrojlla 101024
	 * @return byte
	 * @throws IOException
	 */
	private byte MenuEmpleadoVista() throws IOException {
		System.out.println("---------------------");
		System.out.println("----Menu Empledado---");
		System.out.println("0.Volver");
		System.out.println("1.Calculo de ventas mensual");
		System.out.println("2.Agregar compras cliente");
		System.out.println("---------------------");
		byte opcion = sc.nextByte();
		return opcion;
	}

	@Override
	public void MenuGerencia() throws IOException {

		byte opcion = 0;
		boolean esCerrado = false;

		do {

			opcion = MenuGerenciaVista();

			switch (opcion) {
			case 0:
				Inicio.mensaje = "volver";
				Inicio.fi.ImprimirFichero(Inicio.mensaje, Inicio.ficheroLog);
				System.out.println("Volver");
				esCerrado = true;
				break;

			case 1:
				Inicio.mensaje = "Dal alta cliente";
				Inicio.fi.ImprimirFichero(Inicio.mensaje, Inicio.ficheroLog);
				gi.DarAltaCliente();
				break;

			default:
				Inicio.mensaje = "Opcion " + opcion + " no disponible";
				Inicio.fi.ImprimirFichero(Inicio.mensaje, Inicio.ficheroLog);
				System.out.println(Inicio.mensaje);
				break;
			}

		} while (!esCerrado);

	}

	/**
	 * Vista del menu gerencia
	 * 
	 * @return byte
	 * @author nrojlla 101024
	 */
	private byte MenuGerenciaVista() {
		System.out.println("---------------------");
		System.out.println("----Menu Gerencia---");
		System.out.println("0.Volver");
		System.out.println("2.Crear nuevo cliente");
		System.out.println("---------------------");
		byte opcion = sc.nextByte();
		return opcion;
	}

}
