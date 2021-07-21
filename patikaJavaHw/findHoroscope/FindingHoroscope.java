package patikaJavaHw.findHoroscope;

import java.util.Scanner;

public class FindingHoroscope {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String burc = "";
		boolean isError = false;
		
		System.out.print("Doðum ayýnýzý giriniz(Rakam): ");
		int m = input.nextInt();
		
		System.out.print("Doðduðunuz günü giriniz: ");
		int d = input.nextInt();
		
		if(m==1) {
			if(d<=21) {
				burc = "Oðlak";
			} else {
				burc = "Kova";
			}
		} else if(m==2) {
			if(d<=19) {
				burc = "Kova";
			} else {
				burc = "Balýk";
			}
		} else if(m==3) {
			if(d<=20) {
				burc = "Balýk";
			} else {
				burc = "Koç";
			}
		} else if(m==4) {
			if(d<=20) {
				burc = "Koç";
			} else {
				burc = "Boða";
			}
		} else if(m==5) {
			if(d<=21) {
				burc = "Boða";
			} else {
				burc = "Ýkizler";
			}
		} else if(m==6) {
			if(d<=22) {
				burc = "Ýkizler";
			} else {
				burc = "Yengeç";
			}
		} else if(m==7) {
			if(d<=22) {
				burc = "Yengeç";
			} else {
				burc = "Aslan";
			}
		} else if(m==8) {
			if(d<=22) {
				burc = "Aslan";
			} else {
				burc = "Baþak";
			}
		} else if(m==9) {
			if(d<=22) {
				burc = "Baþak";
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
				burc = "Oðlak";
			}
		} else {
			System.out.println("Hatalý giriþ yaptýnýz.");
			isError = true;
		}
		if(!isError) {
			System.out.println("Burcunuz: " + burc);
		}
		
		
		input.close();
	}

}
