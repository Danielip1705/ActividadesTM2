package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*/ENTRADA:20,15 | RES.ESPERADO:El maximo comun divisisor de: 20 y 15 es 60 | RES.OBTENIDO:El maximo comun divisisor de: 20 y 15 es 60
 * ENTRADA:-1 | RES.ESPERADO:Inserta el 1º numero | RES.OBTENIDO: Inserta el 1º numero
 * ENTRADA:20,-5 | RES.ESPERADO:Inserta el 2º numero | RES.OBTENIDO: Inserta el 2º numero
 * ENTRADA:hola | RES.ESPERADO: No puedes escribir letras| RES.OBTENIDO: No puedes escribir letras
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		// indicamos con la variable int num1, num2, maximo y mcm
		int num1 = 0, num2 = 0, maximo, mcm;

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

		// con if buscamos que numero es mayor, y que se guarde en maximo
		if (num1 > num2) {
			maximo = num1;
		} else {
			maximo = num2;
		}
		// indicamos que el numero mayor se guarde en mcm
		mcm = maximo;

		// con for hacemos el contador para sacar el mcm
		for (int i = 1;; i++) {

			// mcm es igaul a la multiplicacion de maximo y i
			mcm = maximo * i;

			// declaramos con if que si mcm es divisible entre num1 y num2 se rompa el bucle
			if (mcm % num1 == 0 && mcm % num2 == 0) {
				break;
			}
		}
		// imprimimos en consola el resultado
		System.out.println("El maximo comun divisisor de: " + num1 + " y " + num2 + " es " + mcm);

		// cerramos scanner
		sc.close();
	}

}
