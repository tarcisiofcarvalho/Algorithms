package search;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] set = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(binSearch(set, 2));

	}
	
	public static int binSearch(int[] set, int val) {
		
		int low = 0;
		int high = set.length-1;
		
		if(set == null || set.length == 0) {
			return -1;
		}
		
		while(low < high) {
			
			int mid = low + (high-low)/2;
			
			if(set[mid]==val) {
				return mid;
			}else if(val>set[mid]) {
				low = mid +1;
			}else {
				high = mid -1;
			}
			
		}
		return set[low] == val ? low : -1;
	}

}
