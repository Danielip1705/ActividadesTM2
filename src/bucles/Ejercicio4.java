package bucles;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// indicamos con la variable int num1 y num2
		int num1, num2,menor,mcd=0;

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
		//con if declaramos que si num1 es menor o num 2, que se guarde el resultado en menor 
		if (num1 > num2) {

			menor = num2;

		} else {

			menor = num1;
		}
		//con for hacemos que se haga las intrucciones hasta que i sea igual a menor
		for (int i=2;i<=menor;i++ ) {
			//declaramos con if que si num1 o num2 no da resto, que se guarde el divisor actual en mcd
			if (num1 % i == 0 && num2 % i == 0) {
                mcd = i;
            }
		}
		//imprimimos en consola el resultado
		System.out.println("El maximo comun divisor de: " +num1+" y " +num2+" es " +mcd);	
		
		//cerramos scanner
		sc.close();
	}
}
