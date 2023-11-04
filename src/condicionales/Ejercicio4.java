package condicionales;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//declaramos con la variable int num,uni y dec
		int num, uni,dec;
		
		//declaramos con la variable String unidad y decena
		String unidad="",decena1="",decena2="";
		
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos en la consola que nos inserte su numero
		System.out.println("Inserte su numero");
		
		//ponemos num
		num = sc.nextInt();
		
		//cogemos la decimal de num
		dec = num/10;
		
		//cogemos la unidad de num
		uni=(num%10)/1;
		
		//con if, hacemos que si num es igual a 1, que escriba su numero en palabras, y asi con los demas
		if (uni == 1) {
			unidad = "Uno";
		} else if (uni==2) {
			unidad ="Dos";
		} else if (uni==3) {
			unidad ="Tres";
		} else if (uni==4) {
			unidad ="Cuatro";
		} else if (uni==5) {
			unidad ="Cinco";
		} else if (uni==6) {
			unidad ="Seis";
		} else if (uni==7) {
			unidad ="Siete";
		} else if (uni==8) {
			unidad ="Ocho";
		} else if (uni==9) {
			unidad ="Nueve";
		}
		
		//con if, hacemos que si la decena es 1 y la unidad es 0/1/2/3..., que escriba su numero en palabras
		if (dec==1&&uni==0) {
			decena1="Diez";
		} else if (dec==1&&uni==1) {
			decena1="Once";
		} else if (dec==1&&uni==2) {
			decena1="Doce";
		} else if (dec==1&&uni==3) {
			decena1="Trece";
		} else if (dec==1&&uni==4) {
			decena1="Catorce";
		} else if (dec==1&&uni==5) {
			decena1="Quince";
		} else if (dec==1&&uni==6) {
			decena1="Dieciseis";
		} else if (dec==1&&uni==7) {
			decena1="Diecisiete";
		} else if (dec==1&&uni==8) {
			decena1="Dieciocho";
		} else if (dec==1&&uni==9) {
			decena1="Diecinueve";
		}
		
		//con if, hacemos que si la num =20, que escriba su numero en palabras
		if (num==20) {
			decena2="Veinte";
			
			//con if, hacemos que si la decena es 2/3/4... que escriba su numero en palabras
		} else if (dec==2) {
			decena2="Veinti";
		} else if (dec==3) {
			decena2="Treinta";
		} else if (dec==4) {
			decena2="Cuarenta";
		} else if (dec==5) {
			decena2="Cincuenta";
		} else if (dec==6) {
			decena2="Seseinta";
		} else if (dec==7) {
			decena2="Setenta";
		} else if (dec==8) {
			decena2="Ochenta";
		} else if (dec==9) {
			decena2="Noventa";
		}
		
		//si num es menor que 10 escriba la palabra(unidad)
		if (num<10) {
			System.out.println(unidad);
			
			//si num es menor que 20 escriba la palabra(decena1)
		} else if (num<20) {
			System.out.println(decena1);
		} else if (num==20) {
			//si num es menor que 20 escriba la palabra(decena2)
			System.out.println(decena2);
		} else {
			//si num es menor que 20 escriba las palabras(decena2 y unidad)
			System.out.println(decena2 +" y "+ unidad);
		}
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
