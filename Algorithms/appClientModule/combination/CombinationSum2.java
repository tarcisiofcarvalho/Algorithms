package combination;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

	public static void main(String[] args) {
		
		int[] set = {10,1,2,7,6,1,5};
		Arrays.sort(set);
		int target = 8;
		int sum = 0;
		getCombination(set, sum, 0, target, new ArrayList<Integer>());

	}
	
	static void getCombination(int[] set, int sum, int level, int target, List<Integer> solution) {
		
		if(sum>target) return; //??
		
		if(sum==target) { // Print the solution found
			for(Integer i: solution)
				System.out.print(i + " ");
			System.out.println();
			return;		
		}
		for(int i=level;i<set.length;i++) {
			sum += set[i]; // Add element to sum
			solution.add(set[i]); // Add element to solution
			getCombination(set,sum,i+1,target,solution); // With i+1 you skip element repetition
			solution.remove(solution.size()-1); // ??
			sum-=set[i]; // ??
			while(i<set.length-1 && set[i]==set[i+1]) // Just when you have duplicated number in set
				i++;
		}

		
	}

}
