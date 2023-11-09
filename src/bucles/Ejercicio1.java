package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Declaramos con la variable int hora minutos, segundos incremtno
		int hora = 0, minutos = 0, segundos = 0, incremento;

		// creamos un scanner
		Scanner sc = new Scanner(System.in);

		do {
			try {
				// imprimimos en consola que nos inserte las horas
				System.out.println("Inserta la hora");

				// escribimos la hora
				hora = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El dato introduccido no es correcto");
				sc.nextLine();
			}

		} while (hora < 0 || hora > 23);

		do {
			try {
				// imprimimos en consola que nos inserte los minutos
				System.out.println("Inserta los minutos");

				// escribimos los minutos
				minutos = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El dato introduccido no es correcto");
				sc.nextLine();
			}

		} while (minutos < 0 || minutos > 59);

		do {
			try {
				// imprimimos en consola que nos inserte los segundos
				System.out.println("Inserta los segundos");

				// escribimos los minutos
				segundos = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El dato introduccido no es correcto");
				sc.nextLine();
			}

		} while (segundos < 0 || segundos > 59);

		// Imprimimos en consola que nos inserte el incremento
		System.out.println("Inserte el cuantos segundos quieres incrementar");

		// escribimos el incremento
		incremento = sc.nextInt();

		for (int i)
		System.out.println(hora + ":" + minutos + ":" + segundos);

		// cerramos scanner
		sc.close();

	}
}
