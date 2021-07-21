package patikaJavaHw.sortingThreeNumbers;

import java.util.Scanner;

public class SortingThreeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("a sayýsýný giriniz: ");
		int a = input.nextInt();
		
		System.out.print("b sayýsýný giriniz: ");
		int b = input.nextInt();
		
		System.out.print("c sayýsýný giriniz: ");
		int c = input.nextInt();
		
		if(a<b && a<c) {
			if(b<c) {
				System.out.println("a<b<c");
			} else {
				System.out.println("a<c<b");
			}
		} else if(b<a && b<c) {
			if(a<c) {
				System.out.println("b<a<c");
			} else {
				System.out.println("b<c<a");
			}
		} else {
			if(a<b) {
				System.out.println("c<a<b");
			} else {
				System.out.println("c<b<a");
			}
		}
		
		input.close();
	}

}
