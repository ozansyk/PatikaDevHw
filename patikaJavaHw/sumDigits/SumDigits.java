package patikaJavaHw.sumDigits;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("L�tfen bir say� giriniz: ");
		int a = input.nextInt();
		
		while(a != 0) {
			sum += a%10;
			a /=10;
		}
		
		System.out.println("Girdi�iniz say�n�n rakamlar� toplam�: " + sum);
		
		input.close();
	}

}
