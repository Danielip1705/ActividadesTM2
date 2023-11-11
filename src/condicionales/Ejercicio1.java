package condicionales;

import java.util.Scanner;

/*/ENTRADA:5 | RES.ESPERADO:Es capicua | RES.OBTENIDO:Es capicua
 * ENTRADA:11 | RES.ESPERADO:Es capicua | RES.OBTENIDO: Es capicua
 * ENTRADA:10 | RES.ESPERADO:No es capicua | RES.OBTENIDO:No es capicua
 * ENTRADA:111 | RES.ESPERADO:Es capicua | RES.OBTENIDO:Es capicua
 * ENTRADA:112 | RES.ESPERADO:No es capicua | RES.OBTENIDO:No es capicua
 * ENTRADA:1001  | RES.ESPERADO: Es capicua | RES.OBTENIDO: Es capicua
 * ENTRADA:1002 | RES.ESPERADO:No es capicua | RES.OBTENIDO: No es capicua
 * ENTRADA:10000 | RES.ESPERADO:El número debe de estar entre el 0 y 9999 | RES.OBTENIDO:El número debe de estar entre el 0 y 9999
 * ENTRADA:-1 | RES.ESPERADO:El número deve de estar entre el 0 y 9999 | RES.OBTENIDO: El número debe de estar entre el 0 y 9999
 */
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

		// declaramos con if que si num es menor que 0 o mayor que 9999
		if (num < 0 || num > 9999) {
			// imprima en consola que el numero no puede ser menor que 0 y mayor que 9999
			System.out.println("El número debe de estar entre 0 y 9999.");
			// declaramos la else
		} else {
			// con if declaramos que si num es menor que 9, es capicua
			if (num <= 9) {
				System.out.println("Es capicúa.");
				// con else if, si num es mayor/menor que 10/99, y si el resto de num es igual a
				// su coeficiente
				// imprima capicua
			} else if (num >= 10 && num <= 99 && num % 10 == num / 10) {
				System.out.println("Es capicúa.");
				// con else if, si num es mayor/menor que 100,999, y si el resto de num es igual
				// a su coeficiente
				// imprima capicua
			} else if (num >= 100 && num <= 999 && num / 100 == num % 10) {
				System.out.println("Es capicúa.");
				// con else if, si num es mayor/menor que 1000/9999, y si el resto de num es
				// igual a su coeficiente
				// imprima capicua
			} else if (num >= 1000 && num <= 9999 && num / 1000 == num % 10
					&& ((num / 100) % 10) == ((num / 10) % 10)) {
				System.out.println("Es capicúa.");
				// y si no se cumple los valores anteriores, no es capicua
			} else {
				System.out.println("No es capicúa.");
			}
		}
		// cerramos scanner
		sc.close();

	}
}
