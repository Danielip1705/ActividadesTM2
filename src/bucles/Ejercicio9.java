package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio9 {
	/*
	 * /ENTRADA: 1| RES.ESPERADO:En el numero insertado hay 1 cifras |
	 * RES.OBTENIDO:En el numero insertado hay 1 cifras ENTRADA:26 | RES.ESPERADO:En
	 * el numero insertado hay 2 cifras | RES.OBTENIDO:En el numero insertado hay 2
	 * cifras ENTRADA:999 | RES.ESPERADO:En el numero insertado hay 3 cifras |
	 * RES.OBTENIDO:En el numero insertado hay 3 cifras . . . ENTRADA:-5 |
	 * RES.ESPERADO: Inserte un numero positivo | RES.OBTENIDO: Inserte un numero
	 * positivo ENTRADA:hola | RES.ESPERADO: No se puede insertar letras |
	 * RES.OBTENIDO: No se puede insertar letras
	 */
	public static void main(String[] args) {
		// declaramos con la variable int el num
		int num = 0, contador = 0;

		// creamos scanner
		Scanner sc = new Scanner(System.in);
		// iniciamos do-w, si num no es menor que cero, saldra del bucle
		do {
			//iniciamos try
			try {
				// imprimimos en consola que nos escriba el num
				System.out.println("Inserte un numero positivo");

				// escribimos el numero
				num = sc.nextInt();
				// iniciamos catch, si se escribe una letra imprimira el error y volveremos a
				// escribir de nuevo el num
			} catch (InputMismatchException e) {
				System.out.println("No se puede insertar letras");
				sc.nextLine();
			}
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
