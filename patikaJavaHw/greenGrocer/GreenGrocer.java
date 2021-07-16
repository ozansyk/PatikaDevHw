package patikaJavaHw.greenGrocer;

import java.util.Scanner;

public class GreenGrocer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double pear = 2.14;
		double apple = 3.67;
		double tomato = 1.11;
		double banana = 0.95;
		double eggplant =5.0;
		
		System.out.print("Kaç kg armut aldýnýz?: ");
		double pearKg = input.nextDouble();

		System.out.print("Kaç kg elma aldýnýz?: ");
		double appleKg = input.nextDouble();

		System.out.print("Kaç kg domates aldýnýz?: ");
		double tomatoKg = input.nextDouble();

		System.out.print("Kaç kg muz aldýnýz?: ");
		double bananaKg = input.nextDouble();

		System.out.print("Kaç kg patlýcan aldýnýz?: ");
		double eggplantKg = input.nextDouble();
		
		double totalPrice = pear*pearKg + apple*appleKg + tomato*tomatoKg + banana*bananaKg + eggplant*eggplantKg;
		totalPrice = ((int)(totalPrice * 100)) / 100.0;
		System.out.println("Toplam ücret: " + totalPrice);
		input.close();
	}
}
