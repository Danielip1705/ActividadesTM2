package bucles;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//declaramos con la variable int el num
		int num;
		
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos en consola que inserte un numero
		System.out.println("Inserte un numero");
		
		//escribimos num
		num=sc.nextInt();
		
		for (int i =1;i<=num;i++) {
			System.out.print(i);
			//for() {
				
				
			//}
			System.out.println();
		}

	}

}
