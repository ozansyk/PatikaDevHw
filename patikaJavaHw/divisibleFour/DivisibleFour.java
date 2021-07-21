package patikaJavaHw.divisibleFour;

import java.util.Scanner;

public class DivisibleFour {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total = 0;
		
		System.out.print("Lütfen çift sayý giriniz: ");
		int a = input.nextInt();
		
		while(a%2 == 0) {
			if(a%4 == 0) {
				total += a;
			}
			System.out.print("Lütfen çift sayý giriniz: ");
			a = input.nextInt();
		}
		
		System.out.println("Girilen sayýlardan 4'e bölünenlerin toplamý: " + total);
		
		input.close();
	}

}
