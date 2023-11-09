package bucles;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		//declaramos con la variable int el num
		int num=0,contador=0;
		
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				//imprimimos en consola que nos escriba el num
				System.out.println("Inserte un numero positivo");
				
				//escribimos el numero
				num = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Numero erróneo, escriba de nuevo");
			sc.nextLine();
			}
		} while (num<0);
		while (num>0) {
			num/=10;
			contador++;
		}
		System.out.println("En el numero insertado hay " +contador+" cifras");
	}

}
