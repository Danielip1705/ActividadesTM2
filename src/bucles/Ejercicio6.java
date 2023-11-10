
package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {
	/*
	 * /ENTRADA:5 | RES.ESPERADO: 1 22 333 4444 55555 | RES.OBTENIDO: 1 22 333 4444
	 * 55555 ENTRADA:-5 | RES.ESPERADO:Inserta un numero | RES.OBTENIDO: Inserta un
	 * numero ENTRADA:hola | RES.ESPERADO: No puedes escribir letras | RES.OBTENIDO:
	 * No puedes escribir letras
	 */
	public static void main(String[] args) {
		// declaramos con la variable int el num
		int num = 0;

		// creamos scanner
		Scanner sc = new Scanner(System.in);
		// iniciamos do-w, si num no es menor que cero sale del bucle
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
				System.out.println("No puedes escribir letras");
				sc.nextLine();
			}
		} while (num < 0);

		// con for declaramos el num filas que debe de hacer
		for (int i = 1; i <= num; i++) {

			// con for declaramos cuantos num debemos de insertar
			for (int j = 0; j < i; j++) {

				// insertamos num
				System.out.print(i);
			}
			// agregamos espacio
			System.out.println();
		}
		// cerramos scanner
		sc.close();

	}

}
