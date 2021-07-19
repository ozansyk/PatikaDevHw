package patikaJavaHw.userLogin;

import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("L�tfen kullan�c� ad�n�z� giriniz: ");
		String userName = input.nextLine();
		
		System.out.print("L�tfen �ifrenizi giriniz: ");
		String password = input.nextLine();
		
		if(!password.equals("123456")) {
			System.out.print("�ifreniz hatal�. �ifrenizi s�f�rlamak istiyorsan�z 1, istemiyorsan�z 2 yaz�n�z: ");
			int a = input.nextInt();
			switch (a) {
			case 1:
				String tempPassword = password;
				System.out.print("L�tfen yeni �ifrenizi giriniz: ");
				password = input.nextLine();
				
				if(password.equals(tempPassword) || password.equals("123456") ) {
					System.out.println("�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz.");
				} else {
					System.out.println("�ifre olu�turuldu");
				}
				break;
			case 2:
				System.out.print("�ifreniz ayn� kald�!");
				break;
			}
		} else {
			System.out.println("Ba�ar�yla giri� yap�ld�!");
		}
		
		input.close();
	}

}
