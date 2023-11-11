package condicionales;

import java.util.Scanner;

/*/ENTRADA:100,5,5 | RES.ESPERADO:Tenemos suficiente comida para alimentar a todos los animales | RES.OBTENIDO:Tenemos suficiente comida para alimentar a todos los animales
 * ENTRADA:45,5,10 | RES.ESPERADO:No hay suficiente comida, cada animal tendra que comer  9.0 kg el dia de hoy | RES.OBTENIDO:No hay suficiente comida, cada animal tendra que comer  9.0 kg el dia de hoy
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		// declaramos con int animales
		int animales;

		// declaramos con double los kilos,comen,y cantidad
		double kilos, comen, total, cantidad;

		// creamos scanner
		Scanner sc = new Scanner(System.in);

		// imprimimos en consola los kilos de comida ha comprado
		System.out.println("¿Cuantos kilos de comida has comprado?");

		// escribimos la cantidad
		cantidad = sc.nextInt();

		// imprimimos en consola cuantos animales tiene
		System.out.println("¿Cuantos animales hay?");

		// escribimos los animales
		animales = sc.nextInt();

		// imprimimos en consola cuantos kilos de comida comen los animales
		System.out.println("¿Cuantos kilos de comida comen?");

		// Escribimos los kilos que comen los animales
		kilos = sc.nextDouble();

		// calculamos lo que comen los animales
		comen = animales * kilos;
		// con if imprimimmos el 1º resultado si tienen suficiente comida
		if ((cantidad - comen) > 0) {
			System.out.println("Tenemos suficiente comida para alimentar a todos los animales");
			// con else imprimimos el 2º resultado si no tienen suficiente comida y que muestren la comida que debe de comer cada uno
		} else {
			cantidad /= animales;
			System.out.println(
					"No hay suficiente comida, cada animal tendra que comer  " + cantidad + " kg el dia de hoy");
		}
		// cerramos scanner
		sc.close();
	}

}
