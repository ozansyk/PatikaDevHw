package patikaJavaHw.hipotenusCalculator;

import java.util.Scanner;

public class CalculateOfHipotenus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�lk kenar� giriniz: ");
		double a = input.nextDouble();
		
		System.out.print("�kinci kenar� giriniz: ");
		double b = input.nextDouble();
		
		System.out.print("�kinci kenar� giriniz: ");
		double c = input.nextDouble();
		double u = (a+b+c)/2;
		double area = Math.sqrt(u * (u-a) * (u-b) * (u-c));
		System.out.println("��genin alan�: " + area);
		
		input.close();
	}

}
