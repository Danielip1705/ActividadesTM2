package condicionales;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Indicamos con la variable int el dni
		int dni;
		int result=0;
		
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//pedimos el dni
		System.out.println("Inserta su dni");
		
		//escribe dni
		dni = sc.nextInt();
		
		dni = result;
		
		//hacemos la operacion para 
		dni%=23;
		switch (dni) {
		case 0:
			System.out.println(result+"T");
		case 1:
			System.out.println(result+"R");
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
