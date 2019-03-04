package dynamic;

public class GreedyGasStation3 {

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
		int[] sum = new int[gas.length+1];
		int[] index = {0,1,2,3,4,0};
		int n = gas.length;

		int max = index.length;
		int start = 3;
		//sum[index[start]] = gas[index[start]]-cost[index[start]];
		int last=0;
		int result = -1;
		for(int j=0;j<gas.length;j++) {
			start = j;
			for(int i=start;i<max;i++) {
				if(i==0)
					last = index[index.length-1];
				else
					last = index[i-1];
				
				sum[index[i]] = gas[index[i]] - cost[index[i]] + sum[last];
				
				if(sum[index[i]] < 0) {
					result=-1; 
					break;
				}else {
					result=start;
				}

				if(i==(index.length-1)) {
					i=-1;
					max=start-1;
				}
			}
			if(result>=0)
				break;

		}
		System.out.println(result);
	}

}
