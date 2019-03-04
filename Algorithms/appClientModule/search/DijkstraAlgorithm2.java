package search;

import java.util.Arrays;

public class DijkstraAlgorithm2 {

	public static void main(String[] args) {
		int inf = 999;
		int[] nodes = {0,1,2,3,4}; // Nodes
		int[] cameFrom = {0,99,99,99,99}; // cameFrom
		int[] costsSoFar = {0,999,999,999,999}; // costsSoFar
		
		// Map
		int[] mapFrom = {0,0,1,2,3};
		int[] mapTo = {1,2,3,3,4};
		int[] weight = {5,6,1,3,1};
		
		//Visited control
		boolean[] visited = new boolean[5];
		Arrays.fill(visited, false);
		
		for(int k=0;k<5;k++){ // Simulation
			if(visited[k]==false){ // Not visited yet
				if(costsSoFar[k]<inf){ // Minor costs
					visited[k] = true;
					for(int f=0;f<5;f++){ // Read all nodes looking for k successors
						if(visited[f]==false){ // j node not visited yet
							if(mapFrom[f]==nodes[k]){ // k successor
								int cost = costsSoFar[k] + weight[f];
								if(cost<costsSoFar[mapTo[f]]){
									costsSoFar[mapTo[f]] = cost;
									cameFrom[mapTo[f]] = nodes[k];
								}
							}
						}
					}
				}
			}
		}
		
		System.out.println(Arrays.toString(cameFrom));
		int target = 4;
		boolean test = true;
		while(test){
			System.out.println("To: " + nodes[target] + " From: " + cameFrom[target] + " Costs So Far: " + costsSoFar[target]);
			target = cameFrom[target];
			if(target==0)test=false;
		}
		
	}

}
