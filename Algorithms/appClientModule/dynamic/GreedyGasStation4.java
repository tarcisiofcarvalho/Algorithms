package dynamic;

public class GreedyGasStation4 {

	public static void main(String[] args) {
		// gas station > index
		// amount of gas at each station gas[i]
		// car costs[i] to move from i to i+
		// begin with an empty tank
		// Return the starting gas station's index if you can travel 
		//  around the circuit once in the clockwise direction, otherwise return -1.
		// gas  = [1,2,3,4,5]
		// cost = [3,4,5,1,2]
		// Travel to station 4. Your tank = 4 - 1 + 5 = 8
		
		
		int[] gas = {1,2,3,4,5};
		int[] cost= {3,4,5,1,2};
		int max = 0;
		int startIndex = 0;
		int left = 0;
		
		for(int i=gas.length-1;i>=0;i--) {
			left += gas[i]-cost[i];
			if(left>max) {
				max=left;
				startIndex=i;
			}
		}
		if(left<0)
			System.out.println(-1);
		else
			System.out.println(startIndex);
			
	}

}
