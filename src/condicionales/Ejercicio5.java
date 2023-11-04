package condicionales;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Declaramos con la variable int el num
		int num, resultado;
		
		//cremaos un scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimos en consola que nos inserte un numero
		System.out.println("Inserte un numero");
		
		//insertamos num
		num = sc.nextInt();
		
		resultado = num<0 ?(num-num-num):num;
		
		System.out.println("El valor absoltuto de " + num + " es "+resultado);
		
	}

}
