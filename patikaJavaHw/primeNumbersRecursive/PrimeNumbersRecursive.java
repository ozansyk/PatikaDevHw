package patikaJavaHw.primeNumbersRecursive;

import java.util.Scanner;

public class PrimeNumbersRecursive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Sayý giriniz: ");
		int p = input.nextInt();
		
		System.out.println(isPrime(p, p));
		
		input.close();
	}

	public static boolean isPrime(int p, int n) {
		n--;
		if(n==2) {
			return true;
		}
		
		if(p%n==0) {
			return false;
		}
		return isPrime(p, n);
	}

}
