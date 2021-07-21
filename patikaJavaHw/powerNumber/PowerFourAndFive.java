package patikaJavaHw.powerNumber;

import java.util.Scanner;

public class PowerFourAndFive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double f1 = 4, f2 = 5;
		
		System.out.print("Sayýyý giriniz: ");
		int a = input.nextInt();
		
		System.out.print("4'ün ve 5'in katlarý: ");
		for(int i = 1; f1<=a && f2<=a; i++) {
			f1 = Math.pow(4, i);
			f2 = Math.pow(5, i);
			
			System.out.print(f1 + " ");
			System.out.println(f2);
		}
		
		input.close();
	}

}
