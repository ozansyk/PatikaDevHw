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
		
		System.out.print("Ka� kg armut ald�n�z?: ");
		double pearKg = input.nextDouble();

		System.out.print("Ka� kg elma ald�n�z?: ");
		double appleKg = input.nextDouble();

		System.out.print("Ka� kg domates ald�n�z?: ");
		double tomatoKg = input.nextDouble();

		System.out.print("Ka� kg muz ald�n�z?: ");
		double bananaKg = input.nextDouble();

		System.out.print("Ka� kg patl�can ald�n�z?: ");
		double eggplantKg = input.nextDouble();
		
		double totalPrice = pear*pearKg + apple*appleKg + tomato*tomatoKg + banana*bananaKg + eggplant*eggplantKg;
		totalPrice = ((int)(totalPrice * 100)) / 100.0;
		System.out.println("Toplam �cret: " + totalPrice);
		input.close();
	}
}
