package condicionales;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//declaramos con int cantidad y animales
		int animales;
		
		//declaramos con double resultado y kilos
		double kilos,comen,total,cantidad;
		
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos en consola los kilos de comida ha comprado
		System.out.println("¿Cuantos kilos de comida has comprado?");
		
		//escribimos la cantidad
		cantidad = sc.nextInt();
		
		//imprimimos en consola cuantos animales tiene
		System.out.println("¿Cuantos animales hay?");
		
		//escribimos los animales
		animales = sc.nextInt();
		
		//imprimimos en consola cuantos kilos de comida comen los animales
		System.out.println("¿Cuantos kilos de comida comen?");
		
		//Escribimos los kilos que comen los animales
		kilos = sc.nextDouble();
		
		comen = animales*kilos;
		
		total= cantidad-comen;
		if ((cantidad-comen)>0) {
			System.out.println("Tenemos suficiente comida para alimentar a todos los animaeles");
			
		} else {
			cantidad/=animales;
			System.out.println("No hay suficiente comida, cada animal tendra que comer  " + cantidad +"kg el dia de hoy");
		}
			
		
		
		
		

	}

}
