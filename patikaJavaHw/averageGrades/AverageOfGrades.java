package patikaJavaHw.averageGrades;

import java.util.Scanner;

public class AverageOfGrades {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lutfen matematik notunuzu giriniz: ");
		double mat = input.nextDouble();

		System.out.print("Lutfen Fizik notunuzu giriniz: ");
		double fizik = input.nextDouble();

		System.out.print("Lutfen Kimya notunuzu giriniz: ");
		double kimya = input.nextDouble();

		System.out.print("Lutfen T�rk�e notunuzu giriniz: ");
		double turkce = input.nextDouble();

		System.out.print("Lutfen Tarih notunuzu giriniz: ");
		double tarih = input.nextDouble();

		System.out.print("Lutfen M�zik notunuzu giriniz: ");
		double muzik = input.nextDouble();
		
		System.out.println(((mat+fizik+kimya+turkce+tarih+muzik)/6)>60?"S�n�f� ge�tiniz!":"S�n�fta kald�n�z!");
	}

}
