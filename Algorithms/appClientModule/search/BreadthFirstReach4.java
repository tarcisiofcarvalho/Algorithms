package search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstReach4 {

	public static void main(String[] args) {

		Node5[] nodes = new Node5[5];
		for(int i=0;i<nodes.length;i++){
			nodes[i] = new Node5(i);
		}
		nodes[0].neighbors.add(1);
		nodes[0].neighbors.add(2);
		nodes[1].neighbors.add(3);
		nodes[2].neighbors.add(3);
		nodes[3].neighbors.add(4);
		
		bfs(nodes,0);
		
		for(int i=0; i < nodes.length;i++){
			System.out.println("Node: " + nodes[i].index + " distance: " + nodes[i].distance);
		}
		
	}
	static void bfs(Node5[] nodes, int s){
		
		Queue<Node5> q = new LinkedList<Node5>();
		nodes[s].distance=0;
		q.add(nodes[s]);
		
		while(!q.isEmpty()){
			Node5 head = q.poll();
			for(int neighbor: head.neighbors){
				nodes[neighbor].distance = 6 + head.distance;
				q.offer(nodes[neighbor]);
			}
		}
		
	}
}
class Node5{
	int index;
	int distance = -1;
	List<Integer> neighbors = new ArrayList<Integer>();
	
	Node5(int index){
		this.index = index;
	}
}