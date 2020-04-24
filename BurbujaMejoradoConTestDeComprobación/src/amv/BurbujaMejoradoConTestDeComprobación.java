package amv;

import java.util.Random;

public class BurbujaMejoradoConTestDeComprobaci�n {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		// Datos de prueba generados aleatoriamente
		int[] datos = new int[20];
		for (int i = 0; i < datos.length; i++) {
			datos[i] = rnd.nextInt(100)+1;
		}
		
		// Algoritmo de ordenaci�n (burbuja mejorado con test de comprobaci�n)
		
		// tope controla el n�mero de pasadas y el l�mite de la misma
		for(int tope = datos.length-1; tope >= 1; tope--) 
		{
			// test de comprobaci�n
			boolean sw = true; // Suponemos que el vector ya est� ordenado 
			
			for(int i = 1; i <= tope ; i++) 
			{
				// Ordenaci�n creciente
				if (datos[i-1] > datos[i])
				{
					int temp = datos[i-1];
					datos[i-1] = datos[i];
					datos[i] = temp;
					
					// No podemos asegurar la ordenaci�n
					sw = false;
				}
			} // fin del for interno
			
			// Si durante la pasada no se ha realizado intercambios, podemos detener el proceso
			if (sw) break;
		}
		// Fin del proceso. 
		
		// Mostramos el vector resultado ordenado
		System.out.print("Vector: ");
		for(int valor: datos)
			System.out.print(valor+" ");

	}

}
