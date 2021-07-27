package patikaJavaHw.nearNumbers;

import java.util.Arrays;
import java.util.Scanner;

public class NearNumbersofArrays {

	public static void main(String[] args) {
		int[] list = {56, 34, 1, 8, 101, -2, -33};
		int small = Integer.MIN_VALUE;
		int big = Integer.MAX_VALUE;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dizi: " + Arrays.toString(list));
		System.out.print("Sayý giriniz: ");
		int e = input.nextInt();
		
		for(int i : list) {
			if(i<e && i>small) {
				small = i;
			}
			
			if(i>e && i<big) {
				big = i;
			}
		}
		
		System.out.println("Girilen sayýdan küçük en yakýn sayý: " + small);
		System.out.println("Girilen sayýdan büyük en yakýn sayý: " + big);
		
		input.close();
	}

}
