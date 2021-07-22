package patikaJavaHw.ebobEkok;

import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int ebob = 1, ekok = 1;
		
		System.out.print("Lütfen ilk sayýyý giriniz: ");
		int a = input.nextInt();
		
		System.out.print("Lütfen ikinci sayýyý giriniz: ");
		int b = input.nextInt();
		
		int i = a;
		while(true) {
			if(a%i == 0 && b%i == 0) {
				ebob = i;
				break;
			}
			i--;
		}
		
		int j = a;
		
		while(true) {
			if(j%a == 0 && j%b == 0) {
				ekok = j;
				break;
			}
			j++;
		}
		
		System.out.println("Ebob: " + ebob);
		System.out.println("Ekok: " + ekok);
		
		input.close();
	}

}
