package patikaJavaHw.kdvCalculator;

import java.util.Scanner;

public class CalculatorOfKdv {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double kdvOrani, kdvsizTutar, kdvTutari, kdvliTutar;
		
		System.out.print("Lutfen tutar� giriniz: ");
		kdvsizTutar = input.nextDouble();
		
		if(kdvsizTutar>1000) {
			kdvOrani = 0.08;
		} else {
			kdvOrani = 0.18;
		}
		
		kdvTutari = kdvsizTutar * kdvOrani;
		kdvliTutar = kdvsizTutar + kdvTutari;
		System.out.println("Kdvsiz Tutar: " + kdvsizTutar + " TL");
		System.out.println("Kdv Oran�: %" + kdvOrani);
		System.out.println("Kdv Tutar�: " + kdvTutari + " TL");
		System.out.println("Kdvli Tutar: " + kdvliTutar + " TL");
		
		input.close();
	}
}