package patikaJavaHw.primeNumbers;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		boolean isPrime = true;
		
		System.out.print("1-100 arasýndaki asal sayýlar: ");
		
		for(int i=1; i<=100; i++) {
			isPrime = true;
			for(int j=i-1; j>1; j--) {
				if(i%j == 0) {
					isPrime = false;
				}
			}
			if(isPrime) {
				System.out.print(i + " ");
			}
		}
		
	}

}
