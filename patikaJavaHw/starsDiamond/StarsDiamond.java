package patikaJavaHw.starsDiamond;

import java.util.Scanner;

public class StarsDiamond {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("N sayýsýný giriniz: ");
		int n = input.nextInt();
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
		 
			for(int j=1;j<=i*2-1;j++){
				System.out.print("*");
			}
			System.out.println();
		 
		}
		
		for(int i=n-1;i>0;i--){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		input.close();
	}

}
