package patikaJavaHw.findHoroscope;

import java.util.Scanner;

public class FindingHoroscope {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String burc = "";
		boolean isError = false;
		
		System.out.print("Do�um ay�n�z� giriniz(Rakam): ");
		int m = input.nextInt();
		
		System.out.print("Do�du�unuz g�n� giriniz: ");
		int d = input.nextInt();
		
		if(m==1) {
			if(d<=21) {
				burc = "O�lak";
			} else {
				burc = "Kova";
			}
		} else if(m==2) {
			if(d<=19) {
				burc = "Kova";
			} else {
				burc = "Bal�k";
			}
		} else if(m==3) {
			if(d<=20) {
				burc = "Bal�k";
			} else {
				burc = "Ko�";
			}
		} else if(m==4) {
			if(d<=20) {
				burc = "Ko�";
			} else {
				burc = "Bo�a";
			}
		} else if(m==5) {
			if(d<=21) {
				burc = "Bo�a";
			} else {
				burc = "�kizler";
			}
		} else if(m==6) {
			if(d<=22) {
				burc = "�kizler";
			} else {
				burc = "Yenge�";
			}
		} else if(m==7) {
			if(d<=22) {
				burc = "Yenge�";
			} else {
				burc = "Aslan";
			}
		} else if(m==8) {
			if(d<=22) {
				burc = "Aslan";
			} else {
				burc = "Ba�ak";
			}
		} else if(m==9) {
			if(d<=22) {
				burc = "Ba�ak";
			} else {
				burc = "Terazi";
			}
		} else if(m==10) {
			if(d<=22) {
				burc = "Terazi";
			} else {
				burc = "Akrep";
			}
		} else if(m==11) {
			if(d<=21) {
				burc = "Akrep";
			} else {
				burc = "Yay";
			}
		} else if(m==12) {
			if(d<=21) {
				burc = "Yay";
			} else {
				burc = "O�lak";
			}
		} else {
			System.out.println("Hatal� giri� yapt�n�z.");
			isError = true;
		}
		if(!isError) {
			System.out.println("Burcunuz: " + burc);
		}
		
		
		input.close();
	}

}
