package ico.fes.is;

import java.util.Scanner;

public class Prog5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int cuadro = 0;
		char simbolo = '+';
		Scanner scn = new Scanner(System.in);
		try {
			System.out.println("Tamaño del cuadro que desea");
			cuadro = scn.nextInt();
		} catch (Exception e) {
			System.out.println("No es un numero entero");
		}
		for (int i = 0; i < cuadro; i++) {
			System.out.print(simbolo);
			if (i==0) {
				for (int j = 1; j < cuadro; j++) {
					System.out.print(simbolo);	
				}
			} if (i==(cuadro-1)) {
				for (int j = 1; j < cuadro; j++) {
					System.out.print(simbolo);
				}
			}if (i!=0&&i!=(cuadro-1)) {
				for (int j = 1; j < cuadro; j++) {
					if (j!= (cuadro-1)) {
						System.out.print(" ");
					}else{
						System.out.print(simbolo);
					}	
				}
			}
			System.out.println("");
		}
	}
}
