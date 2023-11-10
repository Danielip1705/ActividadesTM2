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

		//con for declaramos la altura que tiene la piramide
		for (int altura = 1; altura <= num; altura++) {
			
			//con for declaramos los numeros accedentes
			for (int numizq = 1; numizq <=altura ;numizq++) {
				
				//imprimimos numizq
				System.out.print(numizq);
			}
			//con for declaramos los numeros de forma desendende 
			for (int numder = altura-1; numder >= 1 ; numder--) {
				
				//imprimimos numder
				System.out.print(numder);
			}
			//imprimimos en consola un salto de linea
			System.out.println();
			
			//cerramos scanner
			sc.close();
		}

	}

}
