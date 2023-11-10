
package bucles;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// declaramos con la variable int el num
		int num;

		// creamos scanner
		Scanner sc = new Scanner(System.in);

		// imprimimos en consola que inserte un numero
		System.out.println("Inserta el numero");

		// insertamos num
		num = sc.nextInt();

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
