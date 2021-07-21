package patikaJavaHw.leapYear;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isLeapYear = false;
		
		System.out.print("Yýl giriniz: ");
		int y = input.nextInt();
		
		if(y%4 == 0) {
			if(y%100 == 0) {
				if(y%400 == 0) {
					isLeapYear = true;
				} else {
					isLeapYear = false;
				}
			} else {
				isLeapYear = true;
			}
		} else {
			isLeapYear = false;
		}
		
		
		if(isLeapYear) {
			System.out.println(y + " bir artýk yýldýr.");
		} else {
			System.out.println(y + " bir artýk yýl deðildir.");
		}
		
		input.close();
	}

}
