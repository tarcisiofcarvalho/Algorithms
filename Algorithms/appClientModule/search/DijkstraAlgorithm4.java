package search;

import java.util.Arrays;

public class DijkstraAlgorithm4 {

	public static void main(String[] args) {

		// Control variable
		int inf = 999;
		boolean[] visited = new boolean[5];
		Arrays.fill(visited, false);
		
		// Input: Node, edges and weight
		int[] node = {0,1,2,3,4};
		int[] mapFrom = {0,0,1,2,3};
 		int[] mapTo = {1,2,3,3,4};
 		int[] weight = {5,6,1,3,1};
 		
 		// Output: costsSoFar, cameFrom
		int[] costSoFar = {0,inf,inf,inf,inf};
		int[] cameFrom = {0,-1,-1,-1,-1};
 		
		// Read all nodes k
		for(int k=0;k<node.length;k++){
			// 1. select not visited node k
			// 2. select the not visited node k with cost less than inf
			if(!visited[k] && costSoFar[k]<inf){
				// Real all nodes j successor of k
				for(int j=0;j<node.length;j++){
					// 1. select not visited node j
					// 2. select node j successor of k
					if(!visited[j] && mapFrom[j]==node[k]){
						// 3. calc new cost > cost so far + edge weight
						int cost = costSoFar[k] + weight[j];
						// 4. if new cost less than j cost so far, update j cost so far
						// 5. Update the cameFrom
						if(cost<costSoFar[mapTo[j]]){
							costSoFar[mapTo[j]] = cost;
							cameFrom[mapTo[j]] = node[k];
						}
					}
				}
			}
		}
		int target = 4;
		boolean test = true;
		while(test){
			System.out.println("To: " + node[target] + " from: " + cameFrom[target] + " costs: " + costSoFar[target]);
			target = cameFrom[target];
			if(target==0)test=false;
		}
	}

}
