package patikaJavaHw.minMaxNumbers;

import java.util.Scanner;

public class MinMaxNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		System.out.print("Ka� adet say� gireceksiniz: ");
		int numbers = input.nextInt();
		
		for(int i=0; i<numbers; i++) {
			System.out.print((i+1) + ". say�y� giriniz: ");
			a = input.nextInt();
			if(a>max) {
				max = a;
			}
			if(a<min) {
				min = a;
			}
		}
		
		System.out.println("En b�y�k say�: " + max);
		System.out.println("En k���k say�: " + min);
		
		input.close();
	}

}
