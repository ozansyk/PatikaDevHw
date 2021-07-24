package patikaJavaHw.patternRecursive;

import java.util.Scanner;

public class PatternRecursive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("N sayýsý: ");
		int a = input.nextInt();
		
		patternRecursive(a, a, true);
		
		input.close();
	}

	public static void patternRecursive(int a,int c, boolean b) {
		System.out.print(a + " ");
		if(a<=0) {
			b = false;
		}
		if(b) {
			a -=5;
		} else {
			a +=5;
		}
		if(a==c) {
			return;
		}
		patternRecursive(a,c, b);
	}

}
