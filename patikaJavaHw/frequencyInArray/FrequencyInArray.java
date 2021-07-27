package patikaJavaHw.frequencyInArray;

import java.util.Arrays;

public class FrequencyInArray {

	public static void main(String[] args) {
		int[] list = new int[] {10, 20, 20, 10, 10, 20, 5, 20};
		
		System.out.println("Dizi: " + Arrays.toString(list));
		System.out.println("Tekrar sayýlarý");
		
		sortNumbers(list);
		// [5, 10, 10, 10, 20, 20, 20, 20]
		int count = 1;
		for(int i=0; i<list.length-1; i+=count) {
			count = 1;
			for(int j=i+1; j<list.length; j++) {
				if(list[i] == list[j]) {
					count++;
				} else {
					System.out.println(list[i] + " sayýsý " + count + " kere tekrar edildi.");
					break;
				}
			}
		}
		if(count>1) {
			System.out.println(list[list.length-1] + " sayýsý " + count + " kere tekrar edildi.");
		}
		
	}
	
	public static void sortNumbers(int[] list) {
		for(int i=0; i<list.length-1; i++) {
			for(int j=i+1; j<list.length; j++) {
				if(list[i] > list[j]) {
					int temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
	}

}
