package patikaJavaHw.chineseZodiac;

import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String zodiac = "";
		
		System.out.print("Do�um y�l�n�z� giriniz: ");
		int y = input.nextInt();
		
		y %=12;
		
		switch (y) {
			case 0:
				zodiac = "Maymun";
				break;
			case 1:
				zodiac = "Horoz";
				break;
			case 2:
				zodiac = "K�pek";
				break;
			case 3:
				zodiac = "Domuz";
				break;
			case 4:
				zodiac = "Fare";
				break;
			case 5:
				zodiac = "�k�z";
				break;
			case 6:
				zodiac = "Kaplan";
				break;
			case 7:
				zodiac = "Tav�an";
				break;
			case 8:
				zodiac = "Ejderha";
				break;
			case 9:
				zodiac = "Y�lan";
				break;
			case 10:
				zodiac = "At";
				break;
			case 11:
				zodiac = "Koyun";
				break;
		}
		
		System.out.println("�in burcunuz: " + zodiac);
		
		input.close();
	}

}
