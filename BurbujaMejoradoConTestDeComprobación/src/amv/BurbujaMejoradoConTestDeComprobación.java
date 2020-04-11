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
		
		// Algoritmo de ordenación
		for(int tope = datos.length-1; tope >= 1; tope--) 
		{
			// test de comprobación
			boolean sw = true; 
			for(int i = 1; i <= tope ; i++) 
			{
				if (datos[i-1]>datos[i])
				{
					int temp = datos[i-1];
					datos[i-1] = datos[i];
					datos[i] = temp;
					sw = false;
				}
			} // fin del for interno
			if (sw) break;
		}
		// Fin del proceso. 
		// Mostramos el vector resultado ordenado
		System.out.print("Vector: ");
		for(int valor: datos)
			System.out.print(valor+" ");

	}

}
