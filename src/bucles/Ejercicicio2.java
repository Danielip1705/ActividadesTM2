package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*/ENTRADA:100 | RES.ESPERADO:Hay 25 numeros primos entre 1 y 100 | RES.OBTENIDO: Hay 25 numeros primos entre 1 y 100
 * ENTRADA:10 | RES.ESPERADO:Hay 4 numeros primos entre 1 y 10 | RES.OBTENIDO: Hay numeros primos entre 1 y 10
 * ENTRADA:-1 | RES.ESPERADO:Inserta un numero | RES.OBTENIDO: Inserta un numeroç
 * ENTRADA:hola | RES.ESPERADO:No puedes escribir una letra | RES.OBTENIDO:No puedes escribir una letra
 */
public class Ejercicicio2 {

	public static void main(String[] args) {
		//iniciamos con la variable int num y numpri
		int num = -1, numpri = 0;
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

		// indicamos con for, la 1 cifra que se va a dividir
		for (int i = 2; i <= num; i++) {
			boolean esPrimo = true;
			// indicamos con for la 2 cifra que se va a dividir entre i
			for (int j = 2; j < i; j++) {
				// con if declaramos que si el resto de i/j es igual a 0, primo es falso y se
				// rompe el bucle
				if (i % j == 0) {
					esPrimo = false;
					break;
				}
			} // declaramos con if de nuevo, que si el resultado es primo, se incremente
				// numpri
			if (esPrimo) {
				numpri++;
			}
		}
		// imprimimos en consola el resultado
		System.out.println("Hay " + numpri + " numeros primos entre 1 y " + num);

		// cerramos scanner
		sc.close();
	}
}
