package patikaJavaHw.harmonicNumbers;

import java.util.Scanner;

public class HarmonicNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("N say�s�n� giriniz: ");
		int n = input.nextInt();
		double sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum += 1.0/i;
		}
		
		System.out.print("Harmonik say�n�n toplam�: " + sum);
		
		input.close();
	}

}
