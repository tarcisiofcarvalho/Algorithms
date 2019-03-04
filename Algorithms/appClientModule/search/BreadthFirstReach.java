package search;

import java.util.*;

public class BreadthFirstReach {

	public static void main(String[] args) {
		
		// Defining nodes
		Node[] nodes = new Node[5];
		for (int i = 0; i < nodes.length; i++) {
			nodes[i] = new Node(i);
		}
		// Defining edges between nodes
		nodes[0].adjacents.add(1); // 0 to 1
		nodes[0].adjacents.add(2); // 0 to 2
		nodes[1].adjacents.add(3); // 1 to 3
		nodes[2].adjacents.add(3); // 2 to 3
		nodes[3].adjacents.add(4); // 3 to 4
		
		int startNode = 0;
		
		bfs(nodes,startNode);
		
		for(int i=0;i<nodes.length;i++){
			System.out.println("Node: " + nodes[i].index + " Distance: " + nodes[i].distance);
		}
	}
	
	static void bfs(Node[] nodes, int s){
		Queue<Node> queue = new LinkedList<Node>();
		nodes[s].distance = 0;
		queue.offer(nodes[s]);
		while(!queue.isEmpty()){
			Node head = queue.poll();
			for(int adjacent : head.adjacents){
				if(nodes[adjacent].distance < 0){
					nodes[adjacent].distance = head.distance + 6;
					queue.offer(nodes[adjacent]);
				}
			}
		}
	}

}

class Node{
	int index;
	List<Integer> adjacents = new ArrayList<Integer>();
	int distance = -1;
	
	Node(int index){
		this.index = index;
	}
} 