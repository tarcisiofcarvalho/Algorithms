package permutation;

public class PermutationRepetition {

	public static void main(String[] args) {
		 int[] set = {1,2,3,4};
		 int len = set.length;
		 int[] data = new int[len];
		 recursive(set, data, 0, len-1);
	}
	
	public static int f(int num) {
		if(num==1)
			return 1;
		return num * f(num-1);
	}

	public static void recursive(int[] set, int[] data, int index, int last) {
		
		int len = set.length -1;
		
		for(int i=0;i<len;i++) {
			data[index] = set[i]; // Fix the ith element
			if(index==last) { // if index is the last element, print it
				for(int j:data) {
					System.out.print(j+" ");
				}
				System.out.println();
			}else { // else, recur again
				recursive(set,data,index+1,last);
			}
			
		}
	}
}
