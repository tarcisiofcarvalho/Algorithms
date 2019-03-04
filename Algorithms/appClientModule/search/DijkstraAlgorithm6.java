package search;

import java.util.Arrays;

public class DijkstraAlgorithm6 {

	public static void main(String[] args) {
		
		// Graph
		int[] nodes = {0,1,2,3,4}; //Index
		int[] mapFrom = {0,0,1,2,3}; //[Index]
		int[] mapTo = {1,2,3,3,4}; //[Index]
 		int[] weight = {5,4,1,1,1};
		
		// Shortest path
		int[] cameFrom = {0,-1,-1,-1,-1};

		// Control
		int inf = 999;
		boolean[] visited = {false,false,false,false,false};
		int[] costSoFar = {0,inf,inf,inf,inf};
		
		for(int k=0; k<nodes.length;k++){
			if(!visited[k]&&costSoFar[k]<inf){
				//visited[k]=true;
				for(int j=0;j<nodes.length;j++){
					if(!visited[j]&&nodes[k]==mapFrom[j]){
						int cost = costSoFar[k] + weight[j];
						if(cost<costSoFar[mapTo[j]]){
							costSoFar[mapTo[j]] = cost;
							cameFrom[mapTo[j]] = nodes[k];
						}
					}
				}
			}
		}
		
		System.out.println(Arrays.toString(cameFrom));
		boolean test=true;
		int target = 4;
		while(test){
			System.out.println("To: " + nodes[target] + " From: " + cameFrom[target] + " cost: " + costSoFar[target]);
			target = cameFrom[target];
			if(target==0)test=false;
		}
	}

}
