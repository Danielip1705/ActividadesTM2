package bucles;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// indicamos con la variable int num1, num2, maximo y mcm
		int num1, num2, maximo, mcm;

		// creamos scanner
		Scanner sc = new Scanner(System.in);

		// imprimimos en consola que nos escriba el 1º numero
		System.out.println("Escriba el 1º numero");

		// escribimos num1
		num1 = sc.nextInt();

		// imprimimos en consola que nos escriba el 2º numero
		System.out.println("Escriba el 2º numero");

		// escribimos num1
		num2 = sc.nextInt();

		// con if buscamos que numero es mayor, y que se guarde en maximo
		if (num1 > num2) {
			maximo = num1;
		} else {
			maximo = num2;
		}
		// indicamos que el numero mayor se guarde en mcm
		mcm = maximo;

		// con for hacemos el contador para sacar el mcm
		for (int i = 1; ;i++) {

			// mcm es igaul a la multiplicacion de maximo y i
			mcm = maximo * i;

			// declaramos con if que si mcm es divisible entre num1 y num2 se rompa el bucle
			if (mcm % num1 == 0 && mcm % num2 == 0) {
				break;
			}
		}
		// imprimimos en consola el resultado
		System.out.println("El maximo comun divisisor de: " + num1 + " y " + num2 + " es " + mcm);

		// cerramos scanner
		sc.close();
	}

}
