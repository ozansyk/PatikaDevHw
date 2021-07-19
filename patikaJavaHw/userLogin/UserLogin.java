package patikaJavaHw.userLogin;

import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen kullanýcý adýnýzý giriniz: ");
		String userName = input.nextLine();
		
		System.out.print("Lütfen þifrenizi giriniz: ");
		String password = input.nextLine();
		
		if(!password.equals("123456")) {
			System.out.print("Þifreniz hatalý. Þifrenizi sýfýrlamak istiyorsanýz 1, istemiyorsanýz 2 yazýnýz: ");
			int a = input.nextInt();
			switch (a) {
			case 1:
				String tempPassword = password;
				System.out.print("Lütfen yeni þifrenizi giriniz: ");
				password = input.nextLine();
				
				if(password.equals(tempPassword) || password.equals("123456") ) {
					System.out.println("Þifre oluþturulamadý, lütfen baþka þifre giriniz.");
				} else {
					System.out.println("Þifre oluþturuldu");
				}
				break;
			case 2:
				System.out.print("Þifreniz ayný kaldý!");
				break;
			}
		} else {
			System.out.println("Baþarýyla giriþ yapýldý!");
		}
		
		input.close();
	}

}
