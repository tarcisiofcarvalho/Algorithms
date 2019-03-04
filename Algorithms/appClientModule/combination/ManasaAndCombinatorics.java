package combination;

import java.util.Arrays;

public class ManasaAndCombinatorics {

	private static long number = 0;
	
	public static void main(String[] args) {

		long n = 2934829348l;
		long m = 2*n;
	    long N = n+m;
	    printBin("", N, N);
	    System.out.println(number);

	}
	
	public static int fatorial(int num) {
		int f = 1;
		while (num > 1){ 
			  f = f *(num-1); num--; 
			                    }
		return f;
	}
	
	public static void printBin(String soFar, long iterations, long N) {
	    if(iterations == 0) {
	    	if(accepted(soFar, N)) {
	    		System.out.println(soFar);
	    		number +=1;
	    	}
	    }
	    else {
	        printBin(soFar + "A", iterations - 1, N);
	        printBin(soFar + "B", iterations - 1, N);
	    }
	}
	
	public static boolean accepted(String str, long N) {
		
		// Restriction one : Prefix and Suffix with no A
    	if(str.charAt(0)=='A' || str.charAt((int)N-1)=='A')	return false;
    	
    	// Restriction two : more A than B
    	long b = 0;
    	long a = 0;
    	long m = 0;
    	m=((N+(N % 2))/2);
    	
    	for(char ch:str.toCharArray())
    		if(ch=='A') a++; else b++;    	
    	
    	if((a*2)!=b) return false;
    	
    	a=0;
    	b=0;
    	
    	String prefix = str.substring(0, (int) m);
    	for(char ch:prefix.toCharArray())
    		if(ch=='A') a++; else b++;
		
    	if(a == 0 || b < a) return false;

    	String suffix = str.substring((int) m, (int) N-1);
    	a=0;
    	b=0;
    	for(char ch:suffix.toCharArray())
    		if(ch=='A') a++; else b++;

    	if(a == 0 || b < a) return false;
    	
		return true;
	}

}
