package patikaJavaHw.flyingPrice;

import java.util.Scanner;

public class FlyingPrice {

	public static void main(String[] args) {
		
		double perKm = 0.1;
		double discount1 = 0.5;
		double discount2 = 0.9;
		double discount3 = 0.7;
		double total = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Mesafeyi km türünden giriniz: ");
		int km = input.nextInt();
		
		System.out.print("Yaþýnýzý giriniz: ");
		int age = input.nextInt();
		
		System.out.print("Yolculuk türünü giriniz(1->Tek yön, 2->Gidiþ dönüþ): ");
		int type = input.nextInt();
		
		total = km*perKm;
		
		if(km<0 || age<0) {
			if(type!=1 || type!=2) {
			System.out.print("Hatalý giriþ yaptýnýz!");
			System.exit(0);
			}
		}
		
		if(age<12) {
			total *= discount1;
		} else if (age>= 12 && age<=24) {
			total *= discount2;
		} else if (age>=65) {
			total *= discount3;
		}
		
		if(type==2) {
			total *= 2;
			total *= 0.8;
		}
		System.out.println("Toplam tutar: " + total);
		
		input.close();
	}

}
