package bucles;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// declaramos con la variable int el num
		int num;

		// creamos scanner
		Scanner sc = new Scanner(System.in);

		// imprimimos en consola que inserte un numero
		System.out.println("Inserte un numero");

		// insertamos el num
		num = sc.nextInt();

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
