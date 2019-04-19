package Konverter;

import java.util.Scanner;

import Mathquiz.Ispis;

public class TestKonverter {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		Konverter konvert = new Konverter();

		Ispis ispis = new Ispis();

		ispis.ispis();
		int korisnikovUnos = unos.nextInt();

		switch (korisnikovUnos) {
		case 1:
			System.out.println("Unesite iznos: ");
			double kilogram = unos.nextDouble();
			konvert.setKilogram(kilogram);
			System.out.println("Konvertovani iznos: ");
			konvert.izKilogramaUFunte();
			break;

		case 2:
			System.out.println("Unesite iznos: ");
			double funta = unos.nextDouble();
			konvert.setFunta(funta);
			System.out.println("Konvertovani iznos: ");
			konvert.izFunteUKilogram();
			break;

		case 3:
			System.out.println("Unesite iznos: ");
			double centimetar = unos.nextDouble();
			konvert.setCentimetar(centimetar);
			System.out.println("Konvertovani iznos: ");
			konvert.izCentimetaraUInce();
			break;

		case 4:
			System.out.println("Unesite iznos: ");
			double inc = unos.nextDouble();
			konvert.setInc(inc);
			System.out.println("Konvertovani iznos: ");
			konvert.izIncaUCentimetre();
			break;

		case 5:
			System.out.println("Unesite iznos: ");
			double celzijus = unos.nextDouble();
			konvert.setCelzijus(celzijus);
			System.out.println("Konvertovani iznos: ");
			konvert.izCelzijusaUFarenhajte();
			break;

		case 6:
			System.out.println("Unesite iznos: ");
			double farenhajt = unos.nextDouble();
			konvert.setFarenhajt(farenhajt);
			System.out.println("Konvertovani iznos: ");
			konvert.izFarenhajtiUCelzijuse();
			break;

		}

		unos.close();
	}

}
