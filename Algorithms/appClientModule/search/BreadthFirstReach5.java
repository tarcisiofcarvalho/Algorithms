package search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BreadthFirstReach5 {

	public static void main(String[] args) {
		
		Node6[] graph = new Node6[5];
		graph[0] = new Node6(0);
		graph[1] = new Node6(1);
		graph[2] = new Node6(2);
		graph[3] = new Node6(3);
		graph[4] = new Node6(4);

		//Edges
		graph[0].neighbors.add(1);
		graph[0].neighbors.add(2);
		graph[1].neighbors.add(3);
		graph[2].neighbors.add(3);
		graph[3].neighbors.add(4);
		
		Queue<Node6> q = new LinkedList<Node6>();
		
		q.add(graph[0]);
		
		while(!q.isEmpty()){
			Node6 head = q.poll();
			for(Integer neigbor: head.neighbors){
				graph[neigbor].distance = 6 + head.distance;
				q.add(graph[neigbor]);
			}
		}
		
	}

}

class Node6{
	int index;
	int distance = 0;
	List<Integer> neighbors = new ArrayList<Integer>();
	public Node6(int index){
		this.index = index;
	}
}