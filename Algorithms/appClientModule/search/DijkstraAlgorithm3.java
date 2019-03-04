package search;

import java.util.Arrays;

public class DijkstraAlgorithm3 {

	public static void main(String[] args) {
		
		int inf = 999;
		
		int[] node = {0,1,2,3,4};

		int[] mapFrom = {0,0,1,2,3};
				
		int[] mapTo = {1,2,3,3,4};
		
		int[] weight = {5,6,1,3,1};
	
		int[] cameFrom = {0,99,99,99,99};
		
		int[] costSoFar = {0,999,999,999,999};
		
		boolean[] visited = new boolean[5];
		Arrays.fill(visited, false);
		
		for(int k=0;k<node.length;k++){
			if(visited[k]==false){ // k not visited yet
				if(costSoFar[k]<inf){ // Minor costs
					visited[k]=true;
					for(int j=0;j<node.length;j++){ // Looking for successor of k
						if(visited[j]==false){ // Possible successor not visisted
							if(mapFrom[j]==node[k]){ // Successor match
								int cost = costSoFar[k] + weight[j]; // New cost cost so far + edge cost
								if(cost<costSoFar[mapTo[j]]){ // Is the new cost minor than successor costs
									costSoFar[mapTo[j]] = cost; // update costs so far
									cameFrom[mapTo[j]] = node[k]; // update cameFrom
								}
							}
						}
					}
				}
			}
		}
		System.out.println(Arrays.toString(cameFrom));
		boolean test = true;
		int target = 4;
		while(test){
			System.out.println("To: " + node[target] + " From: " + cameFrom[target] + " costs so far: " + costSoFar[target]);
			target = cameFrom[target];
			if(target==0)test=false;
		}
	}
}
