package patikaJavaHw.harmonicNumbers;

import java.util.Scanner;

public class HarmonicNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("N sayýsýný giriniz: ");
		int n = input.nextInt();
		double sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum += 1.0/i;
		}
		
		System.out.print("Harmonik sayýnýn toplamý: " + sum);
		
		input.close();
	}

}
