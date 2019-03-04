package dynamic;

public class GreedyGasStation2 {

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
		
		
		//int[] gas = {1,2,3,4,5};
		//int[] cost= {3,4,5,1,2};
		int[] gas = {2,3,4};
		int[] cost = {3,4,3};		
		int costs = 0;
		int add = 0;
		int max_index = -1;
		int max = -1;
		int len = gas.length;

		    for(int i=0; i< len; i++){
		        int temp = gas[i]-cost[i];
		        costs += temp;
		        add += temp;
		        
		        if(add < 0){
		            max = -1;
		            add = 0;
		        }
		        
		        if(max < 0 && temp >= 0){
		            max=temp;
		            max_index= i;
		        }
		        
		    }
		    if(costs<0)
		    	System.out.println(-1);
		    else
		    	System.out.println(max_index);

	}

}
