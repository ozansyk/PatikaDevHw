package patikaJavaHw.powerCalculator;

import java.util.Scanner;

public class PowerCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Say�y� giriniz: ");
		int a = input.nextInt();
		
		System.out.print("�ss� giriniz: ");
		int b = input.nextInt();
		
		int result = 1;
		
		for(int i =0; i<b; i++) {
			result *= a;
		}
		
		System.out.println("Sonu�: " + result);
		
		input.close();
	}

}
