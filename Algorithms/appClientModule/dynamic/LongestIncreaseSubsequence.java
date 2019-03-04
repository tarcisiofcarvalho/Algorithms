package dynamic;

import java.util.Arrays;

public class LongestIncreaseSubsequence {

	public static void main(String[] args) {
		//int[] arr = {5,2,7,4,3,8};
		int[] arr = {6,2,4,3,7,4,5};
		System.out.println(LongestIncreasingSubsequence(arr,arr.length));
	}
	
	static int LongestIncreasingSubsequence(int arr[], int n){
		// Add boundary case, when array n is zero 
		// Depend on smart pointers 
		
		int[] tailIndices = new int[n];
		Arrays.fill(tailIndices, 0);
		
		int[] prevIndices = new int[n];
		Arrays.fill(prevIndices, -1);
		
		// it will always point to empty location
		int len = 1;
		
		for(int i=1;i<n;i++){
			if(arr[i]<arr[tailIndices[0]]){ // If the next array element is small than current smallest value
				tailIndices[0]=i; //new smallest value
			}else if(arr[i] > arr[tailIndices[len-1]]){ // If the next array element is greater than current greatest value
				//prevIndices[i] = tailIndices[len-1]; // arr[i] wants to extend largest subsequence
				tailIndices[len]=i; // empty spot. Added the new greatest element
				len++;
			}else{
				// arr[i] wants to be a potential condidate of future subsequence 
				// It will replace ceil value in tailIndices 
				//int pos = GetCeilIndex(arr,tailIndices,-1,len-1,arr[i]);
				//prevIndices[i] = tailIndices[pos - 1]; 
				//prevIndices[i] = tailIndices[len-2];//???
				tailIndices[len -1] = i;				
			}
		}
		System.out.println("LIS of given input"); 
		
		for(int i=0; i<len;i++){
			System.out.println(arr[tailIndices[i]]);
			System.out.println(" ");
		}		
/*		for (int i = tailIndices[len - 1]; i >= 0; i = prevIndices[i]) 
			System.out.print(arr[i] + " "); 
			System.out.println(); 	*/	
		return len;
		
	}
	// Binary search 
	static int GetCeilIndex2(int arr[],int T[], int l, int r, int key){
		// r = greatest element (len-1)
		while (r - l > 1) {
			int m = l + (r - l) / 2; 
			if (arr[T[m]] >= key)
				r = m; 
			else
				l = m; 
		}
		return r; 
	} 
	// Binary search 
	static int GetCeilIndex(int arr[],int tailX[], int step, int iGreatestElement, int iCurrentArrayElement){
		while (iGreatestElement - step > 1) { // Step = -1
			int m = step + (iGreatestElement - step) / 2; //Try to find some index ( I don't know how) 
			if (arr[tailX[m]] >= iCurrentArrayElement) //If arr element selected by step above is greater than the current arr element
				iGreatestElement = m; // if so, the Greatest (len) element will be replaced by this new one
			else
				step = m; // if not, the step will be replaced by the index calculated before
		}
		return iGreatestElement; 
	}
	
}
