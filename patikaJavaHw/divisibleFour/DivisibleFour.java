package patikaJavaHw.divisibleFour;

import java.util.Scanner;

public class DivisibleFour {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total = 0;
		
		System.out.print("L�tfen �ift say� giriniz: ");
		int a = input.nextInt();
		
		while(a%2 == 0) {
			if(a%4 == 0) {
				total += a;
			}
			System.out.print("L�tfen �ift say� giriniz: ");
			a = input.nextInt();
		}
		
		System.out.println("Girilen say�lardan 4'e b�l�nenlerin toplam�: " + total);
		
		input.close();
	}

}
