package patikaJavaHw.calculatorSwitch;

import java.util.Scanner;

public class CalculatorSwitchCase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�lk say�y� giriniz: ");
		double a = input.nextDouble();
		
		System.out.print("�kinci say�y� giriniz: ");
		double b = input.nextDouble();
		
		System.out.println("1-Toplama\n2-��karma\n3-�arpma\n4-B�lme");
		System.out.print("Se�iminizi yap�n�z: ");
		int o = input.nextInt();
		
		switch (o) {
		case 1: 
			System.out.println(a + "+" + b + "=" + (a+b));
			break;
		case 2: 
			System.out.println(a + "-" + b + "=" + (a-b));
			break;
		case 3: 
			System.out.println(a + "*" + b + "=" + (a*b));
			break;
		case 4: 
			System.out.println(a + "/" + b + "=" + (a/b));
			break;
		default:
			System.out.println("Hatal� giri� yapt�n�z!");
		}
		
		input.close();
	}

}
