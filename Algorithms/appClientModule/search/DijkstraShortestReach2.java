package search;

public class DijkstraShortestReach2 {

	public static void main(String[] args) {
	    	System.out.println(Integer.MAX_VALUE);
/*		int n = 4;
	    int[][] edges = new int[8][3];
	    edges[0][0] = 1;
	    edges[0][1] = 2;
	    edges[0][2] = 24;
	    edges[1][0] = 1;
	    edges[1][1] = 4;
	    edges[1][2] = 20;
	    edges[2][0] = 3;
	    edges[2][1] = 1;
	    edges[2][2] = 3;
	    edges[3][0] = 4;
	    edges[3][1] = 3;
	    edges[3][2] = 12;
	    int s=1;*/

		int n = 5;
	    int[][] edges = new int[4][3];
	    edges[0][0] = 1;
	    edges[0][1] = 2;
	    edges[0][2] = 10;
	    edges[1][0] = 1;
	    edges[1][1] = 3;
	    edges[1][2] = 6;
	    edges[2][0] = 2;
	    edges[2][1] = 4;
	    edges[2][2] = 8;
	    int s=2;		

	    int[] result = new int[n-1];
	    
	    int[][] graph = new int[n*2+1][n*2+1];
	    
	    for(int i=0;i<edges.length;i++) {
	    	graph[edges[i][0]][edges[i][1]] = edges[i][2];
	    	graph[edges[i][1]][edges[i][0]] = edges[i][2]; // Undirected
	    }
	    
	    // initializing distances and visited control list
	    int[] D = new int[n+1];
	    boolean[] visited = new boolean[n+1];
	    for(int i=0;i<=n;i++) {
	    	D[i] = Integer.MAX_VALUE;
	    	visited[i] = false;
	    }
	    
	    D[s] = 0;
	    
	    for(int count=0;count<=n;count++) {
	    	
	    	int v = nextFromPriorityQueue(D,visited);
	    	if(v>=0) {
		    	visited[v]=true;
		    	
	            for(int u=1;u<=n;u++)
	            	if(!visited[u] && graph[v][u]!=0 && D[v]!= Integer.MAX_VALUE && (D[u] > (D[v] +  graph[v][u])))
		    			D[u] = D[v] +  graph[v][u];
	    	}
	    }
	    int j = 0;
	    for(int i=1;i<=n;i++) {
	    	if(i!=s) {
	    		if(D[i]==Integer.MAX_VALUE)
	    			result[j] = -1;
	    		else
	    			result[j] = D[i];
	    		j++;
	    	}
	    }
	    for(int x: result)
	    	System.out.print(x + " ");
	    	
	}
	
	public static int nextFromPriorityQueue(int[] D, boolean[] visited) {
		
		int min = Integer.MAX_VALUE;
		int index = -1;

		for(int v=0;v<D.length;v++) {
			if(!visited[v] && D[v] <= min) {
				min = D[v];
				index = v;
			}
		}
		return index;
	}

}
