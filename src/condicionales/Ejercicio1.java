package condicionales;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//indicamos con la variable int el num
		int num;
		
		//creamos un scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos en consola que indique el numero que quiera
		System.out.println("Indica el numero");
		
		//creamos num
		num = sc.nextInt();
		
		//Indicamos con if que si numero es mayor que 10000
		if (num>10000) {
			//Nos imprime que solo se admiten numeros del 0 a 9999
			System.out.println("Solo se admiten numeros del 0 hasta el 9999 ");
		}
		//Indicamos con un if que si num es menor que 0
		if (num<0) {
			//Nos imprima que solo se admiten numeros del 0 a 9999
			System.out.println("Solo se admiten numeros del 0 hasta el 9999 ");
		}
		//indicamos con if que si num es menor que 10
		if (num<10) {
			//Nos imprime en consola que es un numero capicua
			System.out.println("Es un numero capicua");	
		}
		//Indicamos con if que si num es mayor que 10 O es menor que 100
		if (num>=10 && num<100) {
			//Indicamos con if que si num/10 es lo mismo que num%10(para saber si el coficiente es igual al resto)
			if ((num/10)==(num%10)){
				//Nos imprima en consola que es capicua
				System.out.println("Es un numero capicua");
				//y con else (si no)
			} else {
				//Que nos imprima que no es capicua
				System.out.println("No es capicua");
			}
		}
		//Indicamos con if que si num es mayor igual que 100 O menor que 1000
		if (num>=100&&num<1000) {
			//Indicamos con if que haga la operacion num/10 == num%100(para saber si el coficiente es igual al resto)
			if ((num/10) == (num%100)) {
				//Nos imprima en consola que es capicua
				System.out.println("Es un numero capicua");
				//Y con if else (si no)
			} else {
				//Que nos imprima que no es capicua
				System.out.println("No es un numero capicua");
			}
		}
		//Indicamos con if que si num es mayor igual que 100 O menor que 1000
		if (num>1000&&num<=9999) {
			//Indicamos con if que haga la operacion num/10 == num%100(para saber si el coficiente es igual al resto)
			if ((num/100)==(num%100)) {
				//Nos imprima en consola que es capicua
				System.out.println("Es un numero capicua");
				//Y con if else (si no)
			} else {
				//Que nos imprima que no es capicua
				System.out.println("No es un numero capicua");
			}
		}
		//cerramos scanner
		sc.close();
		
		
		
	}

}
