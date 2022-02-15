/*
* File: Terkup.java
* Author: Gubis Zsombor Dániel
* Copyright: 2021, Gubis Zsombor Dániel
* Group: Szoft_I_N
* Date: 2022.02.15.
* Github: https://github.com/Zsomi/
* Licenc: GNU GPL
*/
import java.util.Scanner;

class Terkup {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Kör sugara: ");
			double sugar = scan.nextDouble();

			System.out.print("Magasság: ");
			double magassag = scan.nextDouble();

			double terfogat = (1.0 /3.0) * Math.pow(sugar, 2) * Math.PI * magassag;

			System.out.printf("%.2f", terfogat);
		}
	}
}