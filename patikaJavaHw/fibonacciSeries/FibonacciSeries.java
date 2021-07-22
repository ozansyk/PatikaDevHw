package patikaJavaHw.fibonacciSeries;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int fs1 = 0;
		int fs2 = 1;
		int fsTemp;
		
		System.out.print("Kaç elemanlý fibonacci serisi istiyorsunuz: ");
		int numbers = input.nextInt();
		
		for(int i=0; i<numbers; i++) {
			System.out.println(fs1 + " + " + fs2 + " = " + (fs1+fs2));
			fsTemp = fs1;
			fs1 = fs2;
			fs2 += fsTemp;
		}
		
		input.close();
	}

}
