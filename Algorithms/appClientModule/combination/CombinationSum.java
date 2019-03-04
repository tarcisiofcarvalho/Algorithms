package combination;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		
		int[] set = {2,3,6,7};
		Arrays.sort(set);
		int target = 7;
		int sum = 0;
		getCombination(set, sum, 0, target, new ArrayList<Integer>());

	}
	
	static void getCombination(int[] set, int sum, int level, int target, List<Integer> solution) {
		
		if(sum>target) return; // Break if higher
		
		if(sum==target) // Print the solution found
			for(Integer i: solution)
				System.out.print(i + " ");
		System.out.println();
		
		for(int i=level;i<set.length;i++) {
			sum += set[i]; // Add element to sum
			solution.add(set[i]); // Add element to solution
			getCombination(set,sum,i,target,solution); // Recursion
			solution.remove(solution.size()-1); // Remove when higher 
			sum-=set[i]; // // Remove when higher 
		}
		
	}

}
