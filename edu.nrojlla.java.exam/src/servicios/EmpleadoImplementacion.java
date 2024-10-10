/**
 * 
 */
package servicios;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import controlador.Inicio;
import dto.CompraDto;
import util.util;

/**
 * Detalle de los metodos del empleado interfaz
 * 
 * @author nrojlla 101024
 */
public class EmpleadoImplementacion implements EmpleadoIntefaz {

	Scanner sc = new Scanner(System.in);

	@Override
	public void CalculoTotalMensual() throws IOException {

		System.out.println("Ingrese fecha para el calculo (dd-mm-aaaa, ej: 1-2024)");
		String fecha = sc.nextLine();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate formato = LocalDate.parse(fecha, formatter);

		String mesFecha = DateTimeFormatter.ofPattern("MM").format(formato);
		String anioFecha = DateTimeFormatter.ofPattern("yy").format(formato);
		Month mes = formato.getMonth();
		int anioYear = formato.getYear();

		double banca = 0.0;

		for (CompraDto c : Inicio.CompraLista) {

			if (c.getInstante().format(formatter).equals(formato)) {

				banca += c.getImporte();
				System.out.print("Importe total:" + banca);
			}
			break;
		}

	}

	@Override
	public void AgregarCompraCliente() throws IOException {

		System.out.println("Ingrese nombre de la compra");
		String nombreCompra = sc.nextLine();
		System.out.println("Ingrese el importe de la compra");
		double importeCompra = sc.nextDouble();
		System.out.println("Ingrese el id del cliente");
		long idcliente = sc.nextLong();		
		LocalDateTime instante = LocalDateTime.now();
		long id = util.IdCalcularCompra();

		CompraDto c = new CompraDto();
		c.setId(id);
		c.setImporte(importeCompra);
		c.setNombre(nombreCompra);
		c.setInstante(instante);
		c.setIdCliente(idcliente);

		Inicio.CompraLista.add(c);

		System.out.println("Agregado con exito");

	}

}
