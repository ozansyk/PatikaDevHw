package patikaJavaHw.calculatorSwitch;

import java.util.Scanner;

public class CalculatorSwitchCase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Ýlk sayýyý giriniz: ");
		double a = input.nextDouble();
		
		System.out.print("Ýkinci sayýyý giriniz: ");
		double b = input.nextDouble();
		
		System.out.println("1-Toplama\n2-Çýkarma\n3-Çarpma\n4-Bölme");
		System.out.print("Seçiminizi yapýnýz: ");
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
			System.out.println("Hatalý giriþ yaptýnýz!");
		}
		
		input.close();
	}

}
