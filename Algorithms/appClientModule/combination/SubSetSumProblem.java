package combination;

/**
 * https://www.geeksforgeeks.org/subset-sum-problem-dp-25/ 
 * @author TARCISIOFRANCODECARV
 *
 */

public class SubSetSumProblem {

	public static void main(String[] args) {
		
		int[] set = {3, 34, 4, 12, 5, 2};
		int sum = 9;
		int n = set.length;
		
        if (isSubSet(set, n, sum) == true) 
            System.out.println("Found a subset"
                          + " with given sum"); 
        else
            System.out.println("No subset with"
                               + " given sum");		

	}

	public static boolean isSubSet(int[] set, int n, int sum) {
		
		// Base Cases
		if(sum==0) {return true;} 
		
		if(n==0 && sum !=0) return false;
		
        // If last element is greater than  
        // sum, then ignore it
		if(sum < set[n-1]) return isSubSet(set, n-1, sum);

        /* else, check if sum can be obtained  
        by any of the following 
            (a) including the last element 
            (b) excluding the last element */
		return isSubSet(set, n-1, sum) || isSubSet(set, n-1, sum-set[n-1]); 

	}
}
