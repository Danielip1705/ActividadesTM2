package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*/ENTRADA:5 | RES.ESPERADO: CAPICUA| RES.OBTENIDO: CAPICUA
 * ENTRADA:11 | RES.ESPERADO: CAPICUA | RES.OBTENIDO: CAPICUA
 * ENTRADA:54 | RES.ESPERADO: NO ES CAPICUA | RES.OBTENIDO: NO ES CAPICUA
 * ENTRADA:101 | RES.ESPERADO: CAPICUA | RES.OBTENIDO: CAPICUA
 * ENTRADA:-6 | RES.ESPERADO: Inserte un numero positivo | RES.OBTENIDO:Inserte un numero positivo
 * ENTRADA: | RES.ESPERADO: | RES.OBTENIDO:
 * ENTRADA: | RES.ESPERADO: | RES.OBTENIDO:
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		// declaramos con la variable int el num,num1,numreves,ultnum
		int num = 0, num1, numreves = 0, ultnum;

		// creamos scanner
		Scanner sc = new Scanner(System.in);
		// iniciamos do-w, si num no es menor que 0 saldra del bucle
		do {
			// iniciamos try
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
			// que siga el bucle hasta que num sea mayor que 0
		} while (num < 0);

		// declaramos que num1 es igual a num
		num1 = num;
		// con while,indicamos que si num1 es menor que cero
		while (num1 > 0) {
			// ultnum es igual a el de num1/10
			ultnum = num1 % 10;
			// numreves es multiplicado por 10 + el ultnum
			numreves = numreves * 10 + ultnum;
			// num1 es divide entre 10
			num1 /= 10;
		}
		// con if, declaramos que si el numero al reves es igual a num, es capicua
		if (numreves == num) {
			System.out.println("Capicua");
			// y si no, no es capicua
		} else {
			System.out.println("No es capicua");
		}
		// cerramos scanner
		sc.close();
	}

}
