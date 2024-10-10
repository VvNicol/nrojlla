/**
 * 
 */
package util;

import controlador.Inicio;

/**
 * Metodos utiles
 * 
 * @author nrojlla 101024
 */
public class util {

	public static long IdCalcularCompra() {

		long nuevoId = 0;
		int tamanioLista = Inicio.CompraLista.size();

		if (tamanioLista > 0) {

			nuevoId = Inicio.CompraLista.get(tamanioLista - 1).getId() + 1;

		} else {
			nuevoId = 1;
		}

		return nuevoId;
	}

	public static Long CalculoIdCliente() {
		long nuevoId = 0;
		int tamanioLista = Inicio.CompraLista.size();

		if (tamanioLista > 0) {

			nuevoId = Inicio.CompraLista.get(tamanioLista - 1).getId() + 1;

		} else {
			nuevoId = 1;
		}

		return nuevoId;
	}

}
