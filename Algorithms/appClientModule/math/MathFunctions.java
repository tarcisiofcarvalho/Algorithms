package math;

import java.util.Arrays;

public class MathFunctions {

	public static void main(String[] args) {
		
		//System.out.println("Log de 2 na base 10: " + (Math.log(2) / Math.log(10)));
		
		//System.out.println("Max Integer: " + Integer.MAX_VALUE);
		
		//System.out.println("Min Integer: " + Integer.MIN_VALUE);
		
		//System.out.println("Max Double: " + Double.MAX_VALUE);
		
		printPermutations(3, 3, 3);
	}

	public static void printPermutations(int... size) {
	    int total = 1;
	    for (int i : size)
	        total *= i;
	    int[] n = new int[size.length];
	    for (int value = 0; value < total; value++) {
	        int remain = value;
	        for (int i = size.length - 1; i >= 0; i--) {
	            n[i] = remain % size[i];
	            remain /= size[i];
	        }
	        System.out.println(Arrays.toString(n));
	    }
	}
}
