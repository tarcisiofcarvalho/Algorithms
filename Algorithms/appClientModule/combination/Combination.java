package combination;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination {

	public static void main(String[] args) {
		
		//int[] set = {10,1,2,7,6,1,5};
		//Arrays.sort(set);
		int n = 4;
		int k = 2;
		getCombination(n, k, 1, new ArrayList<Integer>());

	}
	
	static void getCombination(int n, int k, int level, List<Integer> solution) {
		
		if(solution.size()==k) { // Print the solution found
			for(Integer i: solution)
				System.out.print(i + " ");
			System.out.println();
			return;		
		}
		for(int i=level;i<=n;i++) { // first level is 1 because it is not a array
			solution.add(i); // Add element to solution
			getCombination(n,k,i+1,solution); // With i+1 you skip element repetition
			solution.remove(solution.size()-1); // Remove when solution found
		}

		
	}

}
