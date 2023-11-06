package condicionales;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// indicamos con la variable int el num
		int num;

		// creamos un scanner
		Scanner sc = new Scanner(System.in);

		// imprimimos en consola que indique el numero que quiera
		System.out.println("Indica el numero");

		// creamos num
		num = sc.nextInt();

		// Indicamos con if que si numero es mayor que 10000
		if (num > 10000 && num < 0) {
			// Nos imprime que solo se admiten numeros del 0 a 9999
			System.out.println("Solo se admiten numeros del 0 hasta el 9999 ");
		}
		// capicua 1 cifra
		if (num < 10) {
			System.out.println("Es capicua");
		}
		// capicua 2 cifras
		if (num >= 10 && num < 100) {
			if ((num / 10) == (num % 10)) {
				System.out.println("Es capicua");
			} else {
				System.out.println("No es capicua");
			}
		}

		// capicua 3 cifras
		if (num <= 100 && num > 1000) {
			if (((num / 100) == (num % 10))&&(((num/10))==(num%100))) {
				System.out.println("Es capicua");
			}
		}

	}
}
