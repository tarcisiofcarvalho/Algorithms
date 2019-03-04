package dynamic;

import java.util.Arrays;

public class LongestIncreaseSubsequence4 {

	public static void main(String[] args) {
		
		int[] arr = {6,2,4,3,7,4,5};
		
		int[] sequenceX = {0,0,0,0,0,0,0};
		
		int[] prevX = {-1,-1,-1,-1,-1,-1,-1};
		
		int len = 1;
		
		for(int i=1;i<arr.length;i++){
			
			if(arr[i]<arr[sequenceX[0]]){
				sequenceX[0]=i;
			}else if(arr[i]>arr[sequenceX[len-1]]){
				sequenceX[len] = i;
				prevX[i] = sequenceX[len-1];
				len++;
			}else{
				int pos = binarySearch(arr, sequenceX, -1, len-1, arr[i]);
				sequenceX[pos] = i;
				prevX[i] = sequenceX[pos-1];
			}
		}
		
		for(int i = 0; i< len;i++){
			System.out.println(arr[sequenceX[i]] + " ");
		}

		System.out.println("Longest: " + len);
	}

	static int binarySearch(int[] arr, int T[], int l, int r, int x){
		while((r-l)>1){
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
