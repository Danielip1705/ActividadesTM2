package condicionales;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Declaramos con la variable int las horas,minutos y segundos
		int horas, minutos, segundos;

		// creamos un scanner
		Scanner sc = new Scanner(System.in);

		// imprimimos en consola que nos escriba la hora
		System.out.println("Indique la hora");

		// escibimos la hora
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

		if (segundos == 60) {
			segundos = 0;
			minutos++;
		} else if (minutos == 60) {
			minutos = 0;
			horas++;
		} else if (horas == 24) {
			horas = 0;
		}
		if (horas < 10 && minutos < 10 && segundos < 10) { //01:01:01
			System.out.println("0" + horas + ":0" + minutos + ":0" + segundos);

		} else if (horas < 10 && minutos < 10 && segundos > 10) {//01:01:10
			System.out.println("0" + horas + ":0" + minutos + ":" + segundos);

		} else if (horas < 10 && minutos > 10 && segundos > 10) {//01:10:10
			System.out.println("0" + horas + ":" + minutos + ":" + segundos);

		} else if (horas > 10 && minutos < 10 && segundos < 10) {//10:10:10
			System.out.println(horas + ":0" + minutos + ":0" + segundos);
		//}else if () {
			

		} else {
			System.out.println(horas + ":" + minutos + ":" + segundos);
		}

		// cerramos scanner
		sc.close();
	}

}
