package patikaJavaHw.activityForTemperature;

import java.util.Scanner;

public class ActivityForTemperature {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("S�cakl�k de�eri giriniz: ");
		int t = input.nextInt();
		
		if(t<5) {
			System.out.println("Kayak yapmaya gidebilirsin.");
		} else if(t>=5 && t<10) {
			System.out.println("Sinemaya gidebilirsin.");
		} else if(t>=10 && t<=15) {
			System.out.println("Sinemaya gidebilirsin.");
			System.out.println("Piknik yapmaya gidebilirsin.");
		} else if(t>15 && t<=25) {
			System.out.println("Piknik yapmaya gidebilirsin.");
		} else {
			System.out.println("Y�zmeye gidebilirsin.");
		}
		
		input.close();
	}

}
