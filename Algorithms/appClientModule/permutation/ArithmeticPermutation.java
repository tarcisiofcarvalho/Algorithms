package permutation;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class ArithmeticPermutation {

	public static int touch = 0;
	
	public static void main(String[] args) {
		int target = 9;
		int[] inputNumbers = {1,2,10,4};
		char[] operators = {'+','-','*','/'};
		
        int arr[] = {1, 2, 3, 4}; 
        int n = arr.length; 
        int r = arr.length; 
        //CombinationRepetition(arr, n, r, target); 		
		long p = f(inputNumbers.length);
		System.out.println(p);
		
		permutation(inputNumbers,0,inputNumbers.length);
	}

	public static char[] getAllPermutations() {
		return null;
	}
	
	public static long f(long n) {
		if(n==1) return 1;
		return n* f(n-1);
	}
	
	public static void permutation(int[] str, int l, int r) {
		
		if(l==r) {
			for(int i:str)
			System.out.print(i+",");
			
			System.out.println();
		}else {
			for(int i=l;i<r;i++) {
				str = swap(str, l, i);
				permutation(str, l+1, r);
				str = swap(str, l, i);
			}
		}
	}	
	public static int[] swap(int[] str, int i, int j) {
		
		int[] list = str;
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
		
		return list;
	}
	
    static void CombinationRepetitionUtil(int chosen[], int arr[], 
            int index, int r, int start, int end, int target) { 
        // Since index has become r, current combination is  
        // ready to be printed, print  
    	int temp = 0;
    	String tempStr = null;
        if (index == r) { 
            for (int i = 0; i < r; i++) {
            	tempStr = tempStr + arr[chosen[i]];
            	
                //System.out.printf("%d ", arr[chosen[i]]); 
                if((temp + arr[chosen[i]])==target) {
                	touch = i;
                	System.out.println(1);
                	System.out.println(tempStr);
                	
                }
            } 
            System.out.printf("\n"); 
            return; 
        } 
  
        // One by one choose all elements (without considering  
        // the fact whether element is already chosen or not)  
        // and recur  
        for (int i = start; i <= end; i++) { 
            chosen[index] = i; 
            CombinationRepetitionUtil(chosen, arr, index + 1, 
                    r, i, end, target); 
        } 
        return; 
    } 
  
	// The main function that prints all combinations of size r  
	// in arr[] of size n with repitions. This function mainly  
	// uses CombinationRepetitionUtil()  
    static void CombinationRepetition(int arr[], int n, int r, int target) { 
        // Allocate memory  
        int chosen[] = new int[r + 1]; 
  
        // Call the recursice function  
        CombinationRepetitionUtil(chosen, arr, 0, r, 0, n - 1, target); 
    } 	
}
