package combination;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * https://www.geeksforgeeks.org/subset-sum-problem-dp-25/ 
 * @author TARCISIOFRANCODECARV
 *
 */

public class SubSetSumProblem3 {

	public static void main(String[] args) {
		
		int[] set = {1, 34, 1, 12, 1, 2};
		int sum = 4;
		int n = set.length;
		
        if (isSubSet(set, n, sum) == true) 
            System.out.println("Found a subset"
                          + " with given sum"); 
        else
            System.out.println("No subset with"
                               + " given sum");		

	}

	public static boolean isSubSet(int[] set, int n, int sum) {
		
        // The value of subset[i][j] will be 
        // true if there is a subset of  
        // set[0..j-1] with sum equal to i 
        boolean subset[][] = new boolean[sum+1][n+1]; 
      
        // If sum is 0, then answer is true 
        for (int i = 0; i <= n; i++) 
            subset[0][i] = true; 
      
        // If sum is not 0 and set is empty, 
        // then answer is false 
        for (int i = 1; i <= sum; i++) 
            subset[i][0] = false; 
      
        // Fill the subset table in botton 
        // up manner 
        for (int i = 1; i <= sum; i++) 
        { 
            for (int j = 1; j <= n; j++) 
            { 
                subset[i][j] = subset[i][j-1]; 
                if (i >= set[j-1]) {
                	subset[i][j] = subset[i][j] || subset[i - set[j-1]][j-1];
                	System.out.println("subset[" + i + " ][" + j + "] || subset[" + (i - set[j-1]) + "][" + (j-1) + "] >> " + subset[i][j]);
                }else {
                	System.out.println("subset[" + i + " ][" + j + "] = subset[" + i + "][" + (j-1) + "] >> " + subset[i][j]);
                }
            } 
        } 
      

        for (int i = 0; i <= sum; i++) 
        { 
	        for (int j = 0; j <= n; j++) { 
	        	System.out.print(subset[i][j] + " ; ");
	        }
	        System.out.println();
	    }
      
        return subset[sum][n]; 

	}
}
