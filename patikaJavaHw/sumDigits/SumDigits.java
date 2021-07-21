package patikaJavaHw.sumDigits;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("Lütfen bir sayý giriniz: ");
		int a = input.nextInt();
		
		while(a != 0) {
			sum += a%10;
			a /=10;
		}
		
		System.out.println("Girdiðiniz sayýnýn rakamlarý toplamý: " + sum);
		
		input.close();
	}

}
