package Javapreparation;

import java.util.Arrays;

public class reverseArrayNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers= {23,25,26,27,29};
		
		int [] num =new int[numbers.length];
		
		for (int i = 0; i < numbers.length; i++) {
			num[i]=numbers[numbers.length-1-i];
		}
		
		
		System.out.println(Arrays.toString(num));
	}

}
