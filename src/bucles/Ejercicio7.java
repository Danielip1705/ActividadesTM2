package bucles;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// declaramos con la variable int el num
		int num;

		// creamos scanner
		Scanner sc = new Scanner(System.in);

		// imprimimos en consola que inserte un numero
		System.out.println("Inserte un numero");

		// escribimos num
		num = sc.nextInt();

		for (int altura = 1; altura <= num; altura++) {
			for (int numizq = 1; numizq >=num ;numizq++) {
				System.out.print(numizq);
			}
			for (int numder = 1; numder < 1; numder--) {
				System.out.print(numder);
				
			}
			System.out.println();
		}

	}

}
