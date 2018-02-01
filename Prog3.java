package ico.fes.is;

import java.util.Scanner;

public class Prog3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int factor1 = 0;
		int factor2 = 0;
		Scanner scn = new Scanner(System.in);
		try {
			System.out.println("Hasta que tabla desea");
			factor1 = scn.nextInt();
		} catch (Exception e) {
			System.out.println("No es un numero entero");
		}
		try {
			System.out.println("Hasta que factor desea cada tabla");
			factor2 = scn.nextInt();
		} catch (Exception e) {
			System.out.println("No es un numero entero");
		}
		
		for (int i = 0; i < factor1; i++) {
			for (int j = 0; j < factor2; j++) {
				System.out.println((i+1)+ "*" + (j+1) + "=" + ((i+1)*(j+1)));
			}
		}
	}
}
