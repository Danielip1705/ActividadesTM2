package bucles;

import java.util.Scanner;

public class Ejercicicio2 {

	public static void main(String[] args) {
		int num, numpri = 0;
		// creamos scanner
		Scanner sc = new Scanner(System.in);
		// imprimimos en consola que nos inserte un numero
		System.out.println("Inserta un numero");

		// escribimos num
		num = sc.nextInt();

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
		System.out.println("Hay " + numpri + " numeros primos");
		
		//cerramos scanner
		sc.close();
	}
}
