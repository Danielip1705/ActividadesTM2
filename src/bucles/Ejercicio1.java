package bucles;

import java.util.InputMismatchException;
/*/ENTRADA:5,5,5,1 | RES.ESPERADO:05:05:06 | RES.OBTENIDO:05:05:06 
 * ENTRADA:1,1,1,20 | RES.ESPERADO:01:01:21 | RES.OBTENIDO: 01:01:21
 * ENTRADA:1,10,10,20 | RES.ESPERADO:01:10:30 | RES.OBTENIDO:01:10:30
 * ENTRADA:10,10,10,10 | RES.ESPERADO:10:10:20 | RES.OBTENIDO:10:10:20
 * ENTRADA:10,5,5,1 | RES.ESPERADO:10:05:06 | RES.OBTENIDO:10:05:06
 * ENTRADA:10,10,5,1 | RES.ESPERADO:10:10:06 | RES.OBTENIDO:10:10:06
 * ENTRADA:45 | RES.ESPERADO:Inserta la hora | RES.OBTENIDO: Inserta la hora
 * ENTRADA:21,69 | RES.ESPERADO:Inserta los minutos | RES.OBTENIDO: Inserta los minutos
 * ENTRADA:21,3,74 | RES.ESPERADO:Inserta los segundos | RES.OBTENIDO:Inserta los segundos    
 */
import java.util.Scanner;

/*/ENTRADA:10,10,10,10 | RES.ESPERADO:10:10:20 | RES.OBTENIDO:10:10:20
 * ENTRADA:10,10,1,4 | RES.ESPERADO:10:10:05 | RES.OBTENIDO:10:10:05
 * ENTRADA:10,5,4,1 | RES.ESPERADO:10:05:05 | RES.OBTENIDO: 10:05:05
 * ENTRADA:5,5,4,1 | RES.ESPERADO:05:05:05 | RES.OBTENIDO:05:05:05
 * ENTRADA:23,59,59,6 | RES.ESPERADO:00:00:05 | RES.OBTENIDO:00:00:05
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		// Declaramos las variables para hora, minutos, segundos e incremento
		int hora = -1, minutos = -1, segundos = -1, incremento;

		// creamos un scanner

		Scanner sc = new Scanner(System.in);
		// iniciamos bucle do-while para que escriba la hora
		do {
			// iniciamos try para que inserte la hora
			try {
				// imprimimos en consola que nos inserte las horas
				System.out.println("Inserta la hora");

				// escribimos la hora
				hora = sc.nextInt();

				// iniciamos catch para que detecte si escribimos letra y volvamos a escribir la
				// hora
			} catch (InputMismatchException e) {
				System.out.println("El dato introduccido no es correcto");
				sc.nextLine();
				
			}
			//se sale del bucle si la hora no es menor que 0 o mayor de 23
		} while (hora < 0 || hora > 23);

		// ahora con los minutos
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
			//se sale del bucle si los minutos no es menor que 0 o mayor de 59
		} while (minutos < 0 || minutos > 59);

		// ahora con los segundos
		do {
			try {
				// imprimimos en consola que nos inserte los segundos
				System.out.println("Inserta los segundos");

				// escribimos los segundos
				segundos = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El dato introduccido no es correcto");
				sc.nextLine();
			}
			//se sale del bucle si los segundos no es menor que 0 o mayor de 59
		} while (segundos < 0 || segundos > 59);

		// Imprimimos en consola que nos inserte el incremento
		System.out.println("Inserte el cuantos segundos quieres incrementar");

		// escribimos el incremento
		incremento = sc.nextInt();

		for (int i = 0; i < incremento; i++) {
			segundos++;
			if (segundos == 60) {
				segundos = 0;
				minutos++;
			}
			if (minutos == 60) {
				minutos = 0;
				hora++;
			}
			if (hora == 24) {
				hora = 0;

			}
		}
		// imprimimos en pantalla que segun el resultado que obtengamos, que nos ponga
		// un 0(para que se vea mejor)
		if (hora < 10 && minutos < 10 && segundos < 10) {
			System.out.println("0" + hora + ":0" + minutos + ":0" + segundos);
		} else if (hora < 10 && minutos < 10) {
			System.out.println("0" + hora + ":0" + minutos + ":" + segundos);
		} else if (hora < 10 && segundos < 10) {
			System.out.println("0" + hora + ":" + minutos + ":0" + segundos);
		} else if (minutos < 10 && segundos < 10) {
			System.out.println(hora + ":0" + minutos + ":0" + segundos);
		} else if (hora < 10) {
			System.out.println("0" + hora + ":" + minutos + ":" + segundos);
		} else if (minutos < 10) {
			System.out.println(hora + ":0" + minutos + ":" + segundos);
		} else if (segundos < 10) {
			System.out.println(hora + ":" + minutos + ":0" + segundos);
		} else {
			System.out.println(hora + ":" + minutos + ":" + segundos);
		}

		// cerramos scanner
		sc.close();

	}
}
