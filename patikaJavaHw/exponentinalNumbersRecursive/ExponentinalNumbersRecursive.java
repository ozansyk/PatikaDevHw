package patikaJavaHw.exponentinalNumbersRecursive;

import java.util.Scanner;

public class ExponentinalNumbersRecursive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Taban deðerini giriniz: ");
		int base = input.nextInt();
		
		System.out.print("Üs deðerini giriniz: ");
		int power = input.nextInt();
		
		System.out.println("Sonuç: " + exponentinal(base, power));
		
		input.close();
	}

	public static int exponentinal(int base, int power) {
		if(power==0) {
			return 1;
		}
		
		return base * exponentinal(base, power-1);
	}

}
