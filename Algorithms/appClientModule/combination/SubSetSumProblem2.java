package combination;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * https://www.geeksforgeeks.org/subset-sum-problem-dp-25/ 
 * @author TARCISIOFRANCODECARV
 *
 */

public class SubSetSumProblem2 {

	public static void main(String[] args) {
	
		int[] set = {1, 34, 1, 12, 1, 2};
		int sum = 5;
		int n = set.length;
		
		if(isSubSet(set, n, sum)) {
			System.out.println(" The set is a sub set of sum");
		}else {
			System.out.println(" The set isn't a sub set of sum");
		}

	}

	public static boolean isSubSet(int[] set, int n, int sum) {
		
		boolean[][] subSet = new boolean[sum+1][n+1];
		
		for(int i=0; i<n;i++) {
			subSet[0][i] = true;
		}
		
		for(int i=1;i<sum;i++) {
			subSet[i][0] = false;
		}
		
		for(int i=1;i<=sum;i++) {
		
			for(int j=1;j<=n;j++) {
				
				subSet[i][j] = subSet[i][j-1];
				
				if(i>=set[j-1]) {
					subSet[i][j] = subSet[i][j] || subSet[i-set[j-1]][j-1];
				}
			}
			
		}
		
		return subSet[sum][n];
		
	}
}
