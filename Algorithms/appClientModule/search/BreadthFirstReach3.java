package search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstReach3 {

	public static void main(String[] args) {
		
		// Create graph
		Node4[] nodes = new Node4[5];
		
		for(int i=0;i<nodes.length;i++){
			nodes[i] = new Node4(i);
		}
		
		nodes[0].neighbors.add(1);
		nodes[0].neighbors.add(2);
		nodes[1].neighbors.add(3);
		nodes[2].neighbors.add(3);
		nodes[3].neighbors.add(4);
		
		bfs(nodes,0);
		
		for(int i=0; i< nodes.length;i++){
			System.out.println("Node: " + nodes[i].index + " distance:" + nodes[i].distance);
		}
		
	}
	
	static int bfs(Node4[] nodes, int s){
		
		Queue<Node4> queue = new LinkedList<Node4>();
		nodes[s].distance = 0;
		queue.offer(nodes[s]);
		while(!queue.isEmpty()){
			Node4 head = queue.poll();
			for(int neigbor: head.neighbors){
				nodes[neigbor].distance = 6 + head.distance;
				queue.offer(nodes[neigbor]);
			}
		}
		return 0;
	}

}
class Node4{
	
	int index;
	int distance = -1;
	List<Integer> neighbors = new ArrayList<Integer>();
	
	Node4(int index){
		this.index = index;
	}
}