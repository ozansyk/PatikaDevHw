package patikaJavaHw.taximeter;

import java.util.Scanner;

public class TaximeterPriceCalculator {

	public static void main(String[] args) {
		double perKm= 2.2;
		double minPrice = 20;
		double startPrice = 10;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Gideceðiniz mesafeyi giriniz(km): ");
		double km = input.nextDouble();
		
		double totalPrice = startPrice + (perKm*km);
		totalPrice = totalPrice>20 ? totalPrice : minPrice;
		
		System.out.println("Toplam ücret: " + totalPrice + " TL");
		
		input.close();
	}

}
