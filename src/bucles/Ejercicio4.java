package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*/ENTRADA:10,15 | RES.ESPERADO:El máximo comun divisor de: 15 y 10 es 5 | RES.OBTENIDO:El máximo comun divisor de: 15 y 10 es 5
 * ENTRADA:-8 | RES.ESPERADO: Inserta el 1º numero | RES.OBTENIDO: Inserta el 1º numero
 * ENTRADA:5,-6 | RES.ESPERADO:Inserta el 2º numero | RES.OBTENIDO: Inserta el 2º numero
 * ENTRADA:hola | RES.ESPERADO:No puedes escribir  letras | RES.OBTENIDO:No puedes escribir letras
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		// indicamos con la variable int num1 y num2
		int num1 = -1, num2= -1, menor, mcd = 0;

		// creamos scanner
		Scanner sc = new Scanner(System.in);
		
		// Iniciamos do-w, si num1 es no es menor que 0, sale del programa
		do {
			try {
				// imprimimos en consola que nos inserte un numero
				System.out.println("Inserta el 1º numero");

				// escribimos num
				num1 = sc.nextInt();
				// iniciamos catch, si se escribe una letra imprimira el error y volveremos a
				// escribir de nuevo el num
			} catch (InputMismatchException e) {
				System.out.println("No puedes escribir letras");
				sc.nextLine();
			}
		} while (num1 < 0);
		// lo mismo que num1 pero ahora con num2
		do {
			try {
				// imprimimos en consola que nos inserte un numero
				System.out.println("Inserta el 2º numero");

				// escribimos num
				num2 = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("No puedes escribir una letra");
				sc.nextLine();
			}
		} while (num2 < 0);

		// con if declaramos que si num1 es menor o num 2, que se guarde el resultado en
		// menor
		if (num1 > num2) {

			menor = num2;

		} else {

			menor = num1;
		}
		// con for hacemos que se haga las intrucciones hasta que i sea igual a menor
		for (int i = 2; i <= menor; i++) {

			// declaramos con if que si num1 o num2 no da resto, que se guarde el divisor
			// actual en mcd
			if (num1 % i == 0 && num2 % i == 0) {
				mcd = i;
			}
		}
		// imprimimos en consola el resultado
		System.out.println("El máximo comun divisor de: " + num1 + " y " + num2 + " es " + mcd);

		// cerramos scanner
		sc.close();
	}
}
