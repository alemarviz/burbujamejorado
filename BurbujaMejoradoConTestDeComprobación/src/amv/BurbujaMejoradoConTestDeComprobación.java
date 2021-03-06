package amv;

import java.util.Random;

public class BurbujaMejoradoConTestDeComprobación {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		// Datos de prueba generados aleatoriamente
		int[] datos = new int[20];
		for (int i = 0; i < datos.length; i++) {
			datos[i] = rnd.nextInt(100)+1;
		}
		
		mostrarVector("Vector", datos);
		
		// Algoritmo de ordenación (burbuja mejorado con test de comprobación)
		
		// tope controla el número de pasadas y el límite de la misma (última posición a tratar)
		for(int tope = datos.length-1; tope >= 1; tope--) 
		{
			// test de comprobación
			boolean sw = true; // Suponemos que el vector ya está ordenado 
			
			for(int i = 1; i <= tope ; i++) 
			{
				// Ordenación creciente > // Ordenación decreciente <
				if (datos[i-1] > datos[i])
				{
					int temp = datos[i-1];
					datos[i-1] = datos[i];
					datos[i] = temp;
					
					// No podemos asegurar la ordenación
					sw = false;
				}
			} // fin del for interno
			
			// Si durante la pasada no se ha realizado intercambios, podemos detener el proceso
			if (sw) break;
		}
		// Fin del proceso. 
		
		mostrarVector("Ordenado", datos);

	}

	private static void mostrarVector(String cabecera, int[] datos) {
		// Mostramos el vector resultado ordenado
		System.out.printf("%-15s", cabecera);
		for(int valor: datos)
			System.out.printf("%4d", valor);
		System.out.println();
	}

}
