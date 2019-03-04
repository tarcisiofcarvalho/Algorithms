package combination;

import java.util.Arrays;

public class Combinatorics {

	public static void main(String[] args) {
		
		int[] size = {2,3,3};
		int total = 1;
		
		for(int i: size)
			total *= i;
		
		int[] n = new int[size.length];
		
		for(int i=0;i<total;i++){
			int remain = i;
			for(int j=size.length-1;j>=0;j--){
				n[j] = remain % size[j];
				remain /= size[j];
			}
			System.out.println(Arrays.toString(n));
		}

	}

}
