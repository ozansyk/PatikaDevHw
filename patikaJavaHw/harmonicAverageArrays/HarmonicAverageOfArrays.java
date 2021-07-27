package patikaJavaHw.harmonicAverageArrays;

public class HarmonicAverageOfArrays {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
        double harmonicSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            harmonicSum += 1.0/numbers[i];
        }

        System.out.println(numbers.length / harmonicSum);
	}

}
