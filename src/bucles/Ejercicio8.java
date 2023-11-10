package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*/ENTRADA:20,15 | RES.ESPERADO:Error, el numero es menor, dime un numero | RES.OBTENIDO:Error, el numero es menor, dime un numero 
 * ENTRADA:25,54 | RES.ESPERADO:Dime un numero | RES.OBTENIDO:dime un numero
 * ENTRADA:20,21,8,14,0 | RES.ESPERADO: 
Total de numeros introducidos: 4
Numeros fallados: 2
| RES.OBTENIDO:
Total de numeros introducidos: 4
Numeros fallados: 2
* ENTRADA:-5 | RES.ESPERADO:Inserta un numero | RES.OBTENIDO: Inserta un numero
* ENTRADA:hola | RES.ESPERADO: No puedes escribir letras | RES.OBTENIDO: No puedes escribir letras
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		// declaramos con la variable int el valor,num,numintroducido,fallo
		int valor = 0, num = 1, numintroducido = 0, fallos = 0;

		// creamos scanner
		Scanner sc = new Scanner(System.in);

		// iniciamos do-w, si valor no es menor que cero, saldra del bucle
		do {
			try {
				// imprimimos en consola que nos inserte un numero
				System.out.println("Inserta un numero");

				// escribimos num
				valor = sc.nextInt();
				// iniciamos catch, si se escribe una letra imprimira el error y volveremos a
				// escribir de nuevo el num
			} catch (InputMismatchException e) {
				System.out.println("No puedes escribir letras");
				sc.nextLine();
			}
		} while (valor < 0);

		// iniciamos while, si num es 0, se termina el bucle
		while (num > 0) {

			// imprimimos en consola que nos escriba un numero
			System.out.println("Dime un numero");

			// escribimos num
			num = sc.nextInt();
			// con if, declaramos que si num es menor, nos imprima en consola error
			// y incrememente fallos
			if (num <= valor && num != 0) {
				System.out.println("Error, el numero es menor");
				fallos++;
			}
			// tras finalizar el ciclo, aumentamos el numintroducido
			numintroducido++;
			// se acaba la funcion do-while cuando se escriba 0
		}
		// imprimimos en consola los numeros introducidos
		System.out.println("Total de numeros introducidos: " + numintroducido);

		// imprimimos en consola el numero de fallos
		System.out.println("Numeros fallados: " + fallos);

		// cerramos scanner
		sc.close();
	}

}
