package bucles;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// declaramos con la variable int el num
		int num = 0, contador = 0;

		// creamos scanner
		Scanner sc = new Scanner(System.in);

		do {
			try {
				// imprimimos en consola que nos escriba el num
				System.out.println("Inserte un numero positivo");

				// escribimos el numero
				num = sc.nextInt();
				// iniciamos catch para decir el error
			} catch (Exception e) {
				System.out.println("Numero erróneo, escriba de nuevo");
				sc.nextLine();
			}
			// que siga el bucle hasta que num sea mayor que 0
		} while (num < 0);

		// iniciamos while hasta que num sea menor que 0
		while (num > 0) {
			// num se divide entre 10
			num /= 10;
			// contador de incrementa
			contador++;
		}
		// imprimimos el resutlado
		System.out.println("En el numero insertado hay " + contador + " cifras");
		// cerramos scanner
		sc.close();
	}

}
