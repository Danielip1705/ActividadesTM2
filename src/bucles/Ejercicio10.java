package bucles;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// declaramos con la variable int el num,num1,numreves,ultnum
		int num, num1, numreves = 0, ultnum;

		// creamos scanner
		Scanner sc = new Scanner(System.in);

		// imprimimos en consola que nos diga escriba un numero
		System.out.println("Indica un numero");

		// escribimos num
		num = sc.nextInt();

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
		//cerramos scanner
		sc.close();
	}

}
