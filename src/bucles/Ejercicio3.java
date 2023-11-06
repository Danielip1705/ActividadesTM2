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
		for(int altura=1;altura<=num;altura++) {
			for(int espacio=1;espacio<=num-altura;espacio++) {
				System.out.print(" ");
			}
			for(int relleno=1;relleno<=altura;relleno++) {
				System.out.print(" * ");
				
			}
			System.out.println( );
		}

	}
}
