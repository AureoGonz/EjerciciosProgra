package ico.fes.is;

import java.util.Scanner;

public class Prog4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int cuadro = 0;
		char simbolo = '@';
		Scanner scn = new Scanner(System.in);
		try {
			System.out.println("Tamaño del cuadro que desea");
			cuadro = scn.nextInt();
		} catch (Exception e) {
			System.out.println("No es un numero entero");
		}
		System.out.println("Simbolo que desea de las tablas (Si escribre una palabra se tomara el primer caracter)");
		simbolo = scn.next().charAt(0);
		for (int i = 0; i < cuadro; i++) {
			System.out.print(simbolo);
			for (int j = 1; j < cuadro; j++) {
				System.out.print(simbolo);
			}
			System.out.println(" ");
		}
	}

}
