package bucles;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// declaramos con la variable int el valor,num,numintroducido,fallo
		int valor = 0, num=1, numintroducido = 0, fallos = 0;

		// creamos scanner
		Scanner sc = new Scanner(System.in);
		// iniciamos do-while

		// imprimimos en consola que nos escriba el nummero inicial
		System.out.println("Dime un numero inicial");

		// escribimos valor
		valor = sc.nextInt();

		// iniciamos do
		while(num>0) {
			
			// imprimimos en consola que nos escriba un numero
			System.out.println("Dime un numero");

			// escribimos num
			num = sc.nextInt();
			// con if, declaramos que si num es menor, nos imprima en consola error
			// y incrememente fallos
			if (num <= valor) {
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
