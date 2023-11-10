package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;
/*/ENTRADA:5 | RES.ESPERADO: *
                            * *
                           * * *
                          * * * *
                         * * * * *
 | RES.OBTENIDO:*
 			   * *
 			  * * *
 			 * * * *
 			* * * * *
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		// declaramos con la variable int el num
		int num = 0;

		// creamos scanner
		Scanner sc = new Scanner(System.in);
		// iniciamos el bucle do-w, si el num no es menor que cero sale del bucle
		do {
			// iniciamos try
			try {
				// imprimimos en consola que nos inserte un numero
				System.out.println("Inserta un numero");

				// escribimos num
				num = sc.nextInt();

				// iniciamos catch, si se escribe una letra imprimira el error y volveremos a
				// escribir de nuevo el num
			} catch (InputMismatchException e) {
				System.out.println("No puedes escribir una letra");
				sc.nextLine();
			}
		} while (num < 0);

		// indicamos con for como va a ser la altura del triangulo
		for (int altura = 1; altura <= num; altura++) {

			// indicamos con for los espacio que debe de tener cada fila
			for (int espacio = 1; espacio <= num - altura; espacio++) {
				System.out.print(" ");
			}
			// indicamos con for los asteriscos que debe de tener cada fila
			for (int relleno = 1; relleno <= altura; relleno++) {
				System.out.print(" *");

			}
			// espacio para cada asterisco
			System.out.println();
		}
		// cerrammos scanner
		sc.close();
	}
}
