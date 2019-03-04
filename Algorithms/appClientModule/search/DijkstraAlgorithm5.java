package search;

import java.util.Arrays;

public class DijkstraAlgorithm5 {

	public static void main(String[] args) {
		
		//Control
		int inf = 9999;
		
		// Nodes
		int[] nodes = {0,1,2,3,4};
		// Edges
		int[] mapFrom = {0,0,1,2,3};
		
		int[] mapTo = {1,2,3,3,4};
		
		int[] weight = {5,6,1,3,1};
		
		// Output
		int[] cameFrom = {0,-1,-1,-1,-1};
		int[] costSoFar = {0,inf,inf,inf,inf};
		
		boolean[] visited = new boolean[nodes.length];
		Arrays.fill(visited, false);	

		for(int k=0;k<nodes.length;k++){
			if(!visited[k] && costSoFar[k] < inf){
				visited[k]=true;
				for(int j=0; j<nodes.length;j++){
					if(!visited[j] && nodes[k]==mapFrom[j]){
						int cost = costSoFar[j] + weight[mapFrom[j]];
						if(cost<costSoFar[mapFrom[j]]){
							costSoFar[mapFrom[j]] = cost;
							cameFrom[mapTo[j]] = nodes[k];
						}
					}
				}
			}
		}
		
		boolean test = true;
		int target = nodes[nodes.length-1];
		while(test){
			System.out.println("To: " + nodes[target] + " from: " + cameFrom[target] + " costSoFar: " + costSoFar[target]);
			target = cameFrom[target];
			if(target==nodes.length-1)test=false;
		}
	}

}
