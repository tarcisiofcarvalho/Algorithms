package combination;

import java.util.Arrays;

public class Combinatorics2 {

	public static void main(String[] args) {
		
		int[] arr = {2,3,3};
		
		int total = 1;
		
		for(int i: arr){
			total *= i; // Number of lines
		}
		
		int[] n = new int[arr.length]; // size of columns
		
		// Combinatorics
		for(int i=0;i<total;i++){
			int remain = i;
			for(int j=arr.length-1;j>=0;j--){
				n[j] = remain % arr[j];
				remain /= arr[j];
			}
			System.out.println(Arrays.toString(n));
		}

	}

}
