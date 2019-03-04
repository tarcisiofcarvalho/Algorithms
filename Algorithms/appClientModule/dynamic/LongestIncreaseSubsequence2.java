package dynamic;

import java.util.Arrays;

public class LongestIncreaseSubsequence2 {

	public static void main(String[] args) {

		int[] arr = {6,2,4,3,7,4,5};
		
		int[] sequenceIndex = new int[arr.length];
		Arrays.fill(sequenceIndex, 0);
		
		int[] prevIndex = new int[arr.length];
		Arrays.fill(prevIndex, -1);
		
		int sequenceLen = 1;
		
		for(int i=1;i<arr.length;i++){
			if(arr[i]<arr[sequenceIndex[0]]){
				sequenceIndex[0] = i;
			}else if(arr[i]>arr[sequenceIndex[sequenceLen-1]]){
				sequenceIndex[sequenceLen]=i;
				prevIndex[i] = sequenceIndex[sequenceLen-1];
				sequenceLen++;
			}else{
				int pos = binarySearch(arr,sequenceIndex,-1,sequenceLen-1,arr[i]);
                prevIndex[i] = sequenceIndex[pos - 1]; 
                sequenceIndex[pos] = i;
			}
		}
		
		System.out.println("Longest: " + sequenceLen + "\n");
		for(int i=0; i<sequenceLen;i++){
			System.out.println(arr[sequenceIndex[i]] + " ");
			System.out.println();
		}
		
		
	}
	
	static int binarySearch(int arr[], int T[], int l, int r, int key) 
	{
		while (r - l > 1) {
			int m = l + (r - l) / 2; 
			if (arr[T[m]] >= key)
				r = m; 
			else
				l = m; 
		}
		return r; 
	} 	

}
