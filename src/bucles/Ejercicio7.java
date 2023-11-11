package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*/ENTRADA:5 | RES.ESPERADO:
1
121
12321
1234321
123454321 | RES.OBTENIDO:
1
121
12321
1234321
123454321
 * ENTRADA:-5 | RES.ESPERADO:Inserta un numero | RES.OBTENIDO: Inserta un numero
 * ENTRADA:hola | RES.ESPERADO: No puedes escribir letras| RES.OBTENIDO: No puedes escribir letra
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		// declaramos con la variable int el num
		int num = 0;

		// creamos scanner
		Scanner sc = new Scanner(System.in);
		// iniciamos do-w, si num no es menor que 0, saldra del bucle
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
		} while (num <= 0);

		// con for declaramos la altura que tiene la piramide
		for (int altura = 1; altura <= num; altura++) {

			// con for declaramos los numeros accedentes
			for (int numizq = 1; numizq <= altura; numizq++) {

				// imprimimos numizq
				System.out.print(numizq);
			}
			// con for declaramos los numeros de forma desendende
			for (int numder = altura - 1; numder >= 1; numder--) {

				// imprimimos numder
				System.out.print(numder);
			}
			// imprimimos en consola un salto de linea
			System.out.println();

			// cerramos scanner
			sc.close();
		}

	}

}
