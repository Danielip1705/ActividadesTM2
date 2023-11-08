package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Declaramos con la variable int hora minutos, segundos incremtno
		int hora, minutos, segundos, incremento;

		// creamos un scanner
		Scanner sc = new Scanner(System.in);

		// imprimimos en consola que nos inserte las horas
		System.out.println("Inserta la hora");

		// escribimos la hora
		hora = sc.nextInt();

		// imprimimos en consola que nos inserte los minutos
		System.out.println("Inserta los minutos");

		// escribimos los minutos
		minutos = sc.nextInt();

		// imprimimos en consola que nos inserte los segundos
		System.out.println("Inserta los segundos");

		// escribimos los segundos
		segundos = sc.nextInt();

		// Imprimimos en consola que nos inserte el incremento
		System.out.println("Inserte el cuantos segundos quieres incrementar");

		// escribimos el incremento
		incremento = sc.nextInt();

		do {
			try {
			// imprimimos en consola que nos inserte las horas
			System.out.println("Inserta la hora");

			// escribimos la hora
			hora = sc.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("El dato introduccido no es correcto");
				sc.nextLine();
			}

		} while (segundos >= 60 && minutos >= 60 && hora >= 23);

		System.out.println(hora + ":" + minutos + ":" + segundos);

		// cerramos scanner
		sc.close();

	}
}
