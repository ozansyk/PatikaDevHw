package patikaJavaHw.failPassClass;

import java.util.Scanner;

public class FailPassClass {

	public static void main(String[] args) {
		double totalGrade = 0;
		int totalClass = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lutfen matematik notunuzu giriniz: ");
		double mat = input.nextDouble();
		if(mat>=0 && mat<=100) {
			totalGrade += mat;
			totalClass++;
		}

		System.out.print("Lutfen Fizik notunuzu giriniz: ");
		double fizik = input.nextDouble();
		if(fizik>=0 && fizik<=100) {
			totalGrade += mat;
			totalClass++;
		}

		System.out.print("Lutfen Kimya notunuzu giriniz: ");
		double kimya = input.nextDouble();
		if(kimya>=0 && kimya<=100) {
			totalGrade += mat;
			totalClass++;
		}

		System.out.print("Lutfen T�rk�e notunuzu giriniz: ");
		double turkce = input.nextDouble();
		if(turkce>=0 && turkce<=100) {
			totalGrade += mat;
			totalClass++;
		}

		System.out.print("Lutfen Tarih notunuzu giriniz: ");
		double tarih = input.nextDouble();
		if(tarih>=0 && tarih<=100) {
			totalGrade += mat;
			totalClass++;
		}

		System.out.print("Lutfen M�zik notunuzu giriniz: ");
		double muzik = input.nextDouble();
		if(muzik>=0 && muzik<=100) {
			totalGrade += mat;
			totalClass++;
		}
		
		if((totalGrade/totalClass)>=55) {
			System.out.println("S�n�f� ge�tiniz, tebrikler!");
		} else {
			System.out.println("S�n�fta kald�n�z!");
		}
		System.out.println("Ortalaman�z: " + (totalGrade/totalClass));
		
		input.close();
	}

}
