package patikaJavaHw.divisibiltyThreeAndFour;

import java.util.Scanner;

public class DivisibleThreeAndFour {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double total = 0;
		int number = 0;
		
		System.out.print("Sayýyý giriniz: ");
		int a = input.nextInt();
		
		for(int i =0; i<=a; i++) {
			if(i%12 == 0) {
				total +=i;
				number++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		double average = total/number;
		System.out.println("3 ve 4'e bölünebilen sayýlarýn ortalamasý: " + average);
		
		input.close();
	}

}
