package condicionales;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Declaramos con la variable int km y estancia
		int km,estancia;
		//Declaramos con la variable double descuento y precio
		double descuento,precio;
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos en consola cuantos km recorrera
		System.out.println("¿Cuantos kilometros sera su recorrido?");
		
		//insertamos los kn
		km = sc.nextInt();
		
		//declaramos que precio es igual a los kilometros*2.5
		precio = km*2.5;
		
		//declaramos que descuento es igual a precio multiplicado por 30 y dividido entre 100 
		descuento=precio*30/100;
		
		//imprimimos en consola cuantos dias sera su estancia
		System.out.println("¿Cuantos dias sera su estancia?");
		
		//insertamos estancia
		estancia = sc.nextInt();
		
		//declaramos con if que si, km es mayor a 800 y la estancia es mayor a 7
		if (km>800&&estancia>7) {
			
			//insertamos en consola el precio a pagar con el descuento del 30%
			System.out.println("Su precio a pagar es de: " +(precio-descuento));
			//si no cumple la condicion
		} else {
			
			//imprimimos en consola el precio a pagar sin el descuento
			System.out.println("Su precio a pagar es de: " +precio);
		}
		
		//cerramos scanner
		sc.close();
		
	}

}
