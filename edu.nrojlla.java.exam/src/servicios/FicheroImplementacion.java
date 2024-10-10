/**
 * 
 */
package servicios;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Detalle de los metodos de ficheros
 * @author nrojlla 101024
 */
public class FicheroImplementacion implements FicheroInterfaz {

	@Override
	public void ImprimirFichero(String mensaje, String ficheroLog) {

		try (PrintWriter printWriter = new PrintWriter(new FileWriter(ficheroLog, true))) {
			printWriter.println(mensaje);
		} catch (IOException e) {
			System.out.println("Ha habido un error al escribir en el fichero log: " + e.getMessage());
		}
	}

}
