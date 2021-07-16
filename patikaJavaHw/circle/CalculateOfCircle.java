package patikaJavaHw.circle;

import java.util.Scanner;

public class CalculateOfCircle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Daire'nin yar��ap�n� giriniz: ");
		double r = input.nextDouble();
		
		System.out.print("Daire diliminin merkez a��s�n� giriniz: ");
		double a = input.nextDouble();
		
		double area = (Math.PI * r * r * a) / 360;
		area = ((int)(area * 100)) / 100.0;
		System.out.print(a +" derecelik daire diliminin alan�: " + area);
		
		input.close();
	}

}
