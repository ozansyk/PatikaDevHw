package patikaJavaHw.combinationCalculator;

import java.util.Scanner;

public class CombinationCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("K�menin eleman say�s�: ");
		int k = input.nextInt();
		
		System.out.print("Ka� elemanl� kombinasyon?: ");
		int e = input.nextInt();
		
		int no = 1;
		int deno = 1;
		int x = 1;
		
		int combination = 0;
		
		for(int i=k; i>k-e; i--) {
			 no *= i;
			 deno *= x;
			 x++;
		}
		combination = no/deno;
		System.out.println("Kombinasyon: " + combination);
		
		input.close();
	}

}
