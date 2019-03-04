package search;
import java.util.Iterator;
import java.util.LinkedList;

public class DFSGraph {

	
	private int v; // no of vertices
	private LinkedList<Integer> adj[];
	
	public DFSGraph(int v) {
		this.v = v;
		adj = new LinkedList[v];
		for(int i=0;i<adj.length;i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int v, int w) {
		adj[v].add(w);
		adj[w].add(v);
	}	
	
	public void dfs() {
		
		boolean[] visited = new boolean[v];
		
		for(int i=0;i<v;i++) {
			if(!visited[i]) {
				dfsUtil(i, visited);
			}
		}
		
	}
	
	public void dfsUtil(int v, boolean visited[]) {
		visited[v] = true;
		System.out.print(v + " ");
		
		//recur for all vertices adjacent to this vertices
		Iterator<Integer> it = adj[v].iterator();
		
		while(it.hasNext()) {
			Integer i = it.next();
			
			if(!visited[i])
				dfsUtil(i, visited);
		}
	}
	
	public static void main(String[] args) {
		
		DFSGraph g = new DFSGraph(9);

		g.addEdge(0, 1);
		g.addEdge(0, 5);
		g.addEdge(0, 7);
		g.addEdge(1, 2);
		g.addEdge(5, 6);
		g.addEdge(2, 8);
		g.addEdge(6, 8);
		g.addEdge(2, 3);
		g.addEdge(2, 7);
		g.addEdge(4, 3);
		g.addEdge(4, 6);
		g.addEdge(4, 8);

		System.out.println("Following is Depth First Traversal: ");
		g.dfs();
	}

}
