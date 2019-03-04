package permutation;

public class Permutation {

	public static void main(String[] args) {
		
		System.out.println(f(3));
		
        String str = "ABC"; 
        int n = str.length(); 
        permute(str, 0, n-1); 
        
        // looking at the tree, going down in the left and going up in the right
        
	}

	public static long f(long n) {
		if(n==1) return 1;
		return n* f(n-1);
	}
	
	public static void permute(String str, int l, int r) {
		
		if(l==r) {
			System.out.println(str);
		}else {
			for(int i = l; i<=r;i++) {
				str = swap(str,l,i);
				permute(str, l+1, r);
				str = swap(str,l,i);
			}
		}
	}
	
    /** 
     * Swap Characters at position 
     * @param a string value 
     * @param i position 1 
     * @param j position 2 
     * @return swapped string 
     */
    public static String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 	
    
	public static void printBin(String soFar, int iterations, int N) {
	    if(iterations == 0) {
	    	System.out.println(soFar);
	    }else {
	        printBin(soFar + "A", iterations - 1, N);
	        printBin(soFar + "B", iterations - 1, N);
	        printBin(soFar + "C", iterations - 1, N);
	    }
	}	
}
