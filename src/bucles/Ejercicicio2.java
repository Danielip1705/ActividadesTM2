package bucles;

import java.util.Scanner;

public class Ejercicicio2 {

	public static void main(String[] args) {
		//declaramos con la variable int el num
		int num;
		
		//creamos scanner
		Scanner sc = new Scanner(System.in);

		//imprimimos en consola que nos inserte un numero
		System.out.println("Inserta un numero");
		
		//escribimos numero
		num = sc.nextInt();
		
		for (int i=1;i<=num;i++) {
			if (num%i==0) {
				System.out.println(i);
			}
		}
		
		
		
		
		
	}

}
