package patikaJavaHw.bmi;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double bmi;
		
		System.out.print("Kilonuzu giriniz: ");
		double weight = input.nextDouble();
		
		System.out.print("Boyunuzu giriniz(metre): ");
		double height = input.nextDouble();
		
		bmi = weight / (height*height);
		bmi = ((int)(bmi * 100)) / 100.0;
		System.out.println("Vücut kitle endeksiniz: " + bmi);
		
		input.close();
	}

}
