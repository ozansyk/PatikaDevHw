package patikaJavaHw.perfectNumbers;

import java.util.Scanner;

public class PerfectNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total = 0;
		
		System.out.print("Bir sayý giriniz: ");
		int a = input.nextInt();
		
		for(int i = a-1; i>0; i--) {
			if(a%i == 0) {
				total += i;
			}
		}
		
		if(total==a) {
			System.out.println(a + " mükemmel bir sayýdýr.");
		} else {
			System.out.println(a+ " mükemmel bir sayý deðildir.");
		}
		
		input.close();
	}

}
