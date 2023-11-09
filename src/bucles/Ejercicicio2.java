package bucles;

import java.util.Scanner;

public class Ejercicicio2 {

	public static void main(String[] args) {
		// declaramos con la variable int el num y divisor
		int num, numpri = 0;
		boolean esPrimo = true;
		// creamos scanner
		Scanner sc = new Scanner(System.in);

		// imprimimos en consola que nos inserte un numero
		System.out.println("Inserta un numero");

		// escribimos numero
		num = sc.nextInt();
		
		//con for declaramos que si i(2)es mayorigual a num, se incrementa
		for (int i = 2; i <= num; i++) {
			//hacemos otro for pero 
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					esPrimo = false;
					
				}
			}
			if (esPrimo) {
				numpri++;
			}

		}
		System.out.println("Hay " + numpri + " numeros primos");
	}
}
