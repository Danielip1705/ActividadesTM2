package condicionales;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Declaramos con la variable int las horass,minutos y segundos
		int horas, minutos, segundos;

		// creamos un scanner
		Scanner sc = new Scanner(System.in);

		// imprimimos en consola que nos escriba la horas
		System.out.println("Indique la horas");

		// escibimos la horas
		horas = sc.nextInt();

		// imprimimos en consola que nos escriba los minutos
		System.out.println("Indique los minutos");

		// escribimos los minutos
		minutos = sc.nextInt();

		// imprimimos en pantalla que nos muestre los segundos
		System.out.println("Indique los segundos");

		// escribimos los segundos
		segundos = sc.nextInt();

		// incrementamos los segundos(+1)
		segundos++;
		// con if, hacemos que el tiempo no supere su limite(60 y 23) y en caso de
		// serlo, que incrememente minutos o horas
		if (segundos == 60) {
			segundos = 0;
			minutos++;
		} else if (minutos == 59) {
			minutos = 0;
			horas++;
		} else if (horas == 24) {
			horas = 0;
		}
		// imprimimos en pantalla que segun el resultado que obtengamos, que nos ponga
		// un 0(para que se vea mejor)
		if (horas > 10 && minutos > 10 && segundos > 10) {
			System.out.println(horas + ":" + minutos + ":" + segundos);
		} else if (horas > 10 && minutos > 10) {
			System.out.println(horas + ":" + minutos + ":0" + segundos);
		} else if (horas > 10) {
			System.out.println(horas + ":0" + minutos + ":0" + segundos);
		} else if (horas < 10 && minutos < 10 && segundos < 10) {
			System.out.println("0" + horas + ":0" + minutos + ":0" + segundos);
		} else if (segundos > 10) {
			System.out.println("0" + horas + ":0" + minutos + ":" + segundos);
		} else if (minutos > 10) {
			System.out.println("0" + horas + ":" + minutos + ":0" + segundos);
		}

		// cerramos scanner
		sc.close();
	}

}
