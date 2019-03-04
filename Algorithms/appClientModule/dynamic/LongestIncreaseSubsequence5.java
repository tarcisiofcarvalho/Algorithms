package dynamic;

public class LongestIncreaseSubsequence5 {

	public static void main(String[] args) {
		
		// Input
		int[] arr = {6,2,4,3,7,4,5};
		
		// Output
		int[] sequenceX = {0,0,0,0,0,0,0};
		
		// Control
		int[] prevX = {-1,-1,-1,-1,-1,-1,-1};
		
		int len = 1;
		
		// Lookup
		for(int i=1;i<arr.length;i++){
			if(arr[i]<arr[sequenceX[0]]){ // Check first
				sequenceX[0] = i;
			}else if(arr[i]>arr[sequenceX[len-1]]){ // Check last
				sequenceX[len] = i;				
				prevX[i] = sequenceX[len-1];
				len++;
			}else{ // Get correct middle position
				int pos = binarySearch(arr,sequenceX,-1,len-1,arr[i]);
				sequenceX[pos] = i;
				prevX[i] = sequenceX[pos-1];
			}
		}
		
		// Print result
		for(int i=0;i<len;i++){
			System.out.println(arr[sequenceX[i]] + " ");
		}
		System.out.println("Longest: " + len);
	}
	
	static int binarySearch(int[] arr, int[] T, int l, int r, int x){
		
		while((r-l) > 1){
			int mid = l + (r-l)/2;
			if(arr[T[mid]]>=x){
				r = mid;
			}else{
				l = mid;
			}
		}
		return r;
	}

}
