package condicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//indicamos con la variable int maq1/2,resultadi y resultadomaq
		int maq1,maq2,resultado,resultadomaq;
		
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//creamos random
		Random rand = new Random();
		
		//imprimimos en consola que se han generado dos numeros aleatorios
		System.out.println("Se han generado 2 numeros aleatorio del 1 al 99");
		
		//creamos el 1º numero aleatorio
		maq1 = rand.nextInt(1,99);
		
		//creamos el 2º numero aleatorio
		maq2 = rand.nextInt(1,99);
		
		//sumamos los numeros aleatorios
		resultadomaq = maq1+maq2;
		
		//imprimimos en pantalla que nos inserte el resultado que crea
		System.out.println("Inserte el resultado de la suma de estos dos numeros");
		
		//insertamods resultado
		resultado = sc.nextInt();
		
		//indicamos con if, que si resultado es distinto que el resultado de la maquina(maq1+maq2)
		if (resultado!=resultadomaq) {
			//Que imprima en consola que es incorrecto
			System.out.println("El numero insertado es incorrecto");
			//si no, que imprima en consola que el numero es correcto
		} else {
			System.out.println("El numero insertado es correcto");
			
			//cerramos scanner
			sc.close();
		}

		
		
		
		
		
		
		
		
	}

}
