package dynamic;

public class GreedyGasStation {

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
		//int[] gas = {2,3,4};
		//int[] cost = {3,4,3};
		int n = gas.length;
		
		int start=0;
		int next=0;
		int tank=0;
		int remain=0;
		int max = n-1;
		int count = 1;
		boolean status = false;
		tank = gas[start];
		while(!status) {
			for(int i=start;i<=max;i++) {
				if(i==max && start>0) { 
					next = 0;
				}else {
					next = i+1;
				}
				tank = tank - cost[i] + gas[next]; // Calculate amount of gas in the tank
				if(tank<cost[next]) { // Checking if there is no tank fuel enough to reach next gas station
					tank = 0;
					count=0;
					break;
				}
				if(count==n) { // Path completed, print the index to be started
					System.out.println(start);
					status=true; // Stop verification
					break;					
				}
				if(next==max && start>0) {
					max = max - (max - start) -2;
					//start=0;
					i=-1;
					//next = i;
				}
				count++;
			}
			start++; // Moving the first index and do the loop again
			if(start<n) 
				tank = gas[start];
			if(start==n){
				System.out.println(-1);
			}
		}
		
	}

}
