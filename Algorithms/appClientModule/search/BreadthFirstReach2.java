package search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstReach2 {

	public static void main(String[] args) {
		
		Node2[] nodes = new Node2[5];
		for(int i=0;i<nodes.length;i++){
			nodes[i] = new Node2(i);
		}
		
		nodes[0].neighbors.add(1);
		nodes[0].neighbors.add(2);
		nodes[1].neighbors.add(3);
		nodes[2].neighbors.add(3);
		nodes[3].neighbors.add(4);
		
		int s = 0;
		bfs(nodes,s);
		
		for(int i=0;i<nodes.length;i++){
			System.out.println("Node: " + nodes[i].index + " Distance: " + nodes[i].distance);
		}
	}
	
	static void bfs(Node2[] nodes, int s){
		Queue<Node2> queue = new LinkedList<Node2>();
		nodes[s].distance = 0;
		queue.offer(nodes[s]);
		while(!queue.isEmpty()){
			Node2 head = queue.poll();
			for(int neighbor: head.neighbors){
				nodes[neighbor].distance = head.distance + 6;
				queue.offer(nodes[neighbor]);
			}
		}
	}
}
class Node2{
	int index;
	int distance = -1;
	List<Integer> neighbors = new ArrayList<Integer>();
	
	Node2(int index){
		this.index = index;
	}
}