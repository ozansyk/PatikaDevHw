package patikaJavaHw.sortingNumbersInArray;

import java.util.Arrays;
import java.util.Scanner;

public class SortingNumbersInArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Dizinin boyutu n: ");
		int n = input.nextInt();
		int[] list = new int[n];
		
		System.out.println("Dizinin elemanlarýný giriniz: ");
		for(int i=0; i<n; i++) {
			System.out.print((i+1) + ". Elemaný: ");
			list[i] = input.nextInt();
		}
		
		sortNumbers(list);
		
		System.out.println("Sýralama: " + Arrays.toString(list));
		
		input.close();
	}

	public static void sortNumbers(int[] list) {
		for(int i=0; i<list.length-1; i++) {
			for(int j=i+1; j<list.length; j++) {
				if(list[i] > list[j]) {
					int temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
	}

}
