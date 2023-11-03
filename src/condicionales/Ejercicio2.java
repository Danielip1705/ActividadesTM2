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
		
		//El dni se almacena en result
		result =dni;
		
		//hacemos la operacion para saber la letra
		dni%=23;
		
		//declaramos 23 casos, cada caso es la letra correspondiente al dni
		switch (dni) {
		case 0:
			System.out.println(result+"T");
			break;
		case 1:
			System.out.println(result+"R");
			break;
		case 2:
			System.out.println(result+"W");
			break;
		case 3:
			System.out.println(result+"A");
			break;
		case 4:
			System.out.println(result+"G");
			break;
		case 5:
			System.out.println(result+"M");
			break;
		case 6:
			System.out.println(result+"Y");
			break;
		case 7:
			System.out.println(result+"F");
			break;
		case 8:
			System.out.println(result+"P");
			break;
		case 9:
			System.out.println(result+"D");
			break;
		case 10:
			System.out.println(result+"X");
			break;
		case 11:
			System.out.println(result+"B");
			break;
		case 12:
			System.out.println(result+"N");
			break;
		case 13:
			System.out.println(result+"J");
			break;
		case 14:
			System.out.println(result+"Z");
			break;
		case 15:
			System.out.println(result+"S");
			break;
		case 16:
			System.out.println(result+"Q");
			break;
		case 17:
			System.out.println(result+"V");
			break;
		case 18:
			System.out.println(result+"H");
			break;
		case 19:
			System.out.println(result+"L");
			break;
		case 20:
			System.out.println(result+"C");
			break;
		case 21:
			System.out.println(result+"K");
			break;
		case 22:
			System.out.println(result+"E");
			
	//cerramos scanner
	sc.close();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
