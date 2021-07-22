package patikaJavaHw.minMaxNumbers;

import java.util.Scanner;

public class MinMaxNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		System.out.print("Kaç adet sayý gireceksiniz: ");
		int numbers = input.nextInt();
		
		for(int i=0; i<numbers; i++) {
			System.out.print((i+1) + ". sayýyý giriniz: ");
			a = input.nextInt();
			if(a>max) {
				max = a;
			}
			if(a<min) {
				min = a;
			}
		}
		
		System.out.println("En büyük sayý: " + max);
		System.out.println("En küçük sayý: " + min);
		
		input.close();
	}

}
