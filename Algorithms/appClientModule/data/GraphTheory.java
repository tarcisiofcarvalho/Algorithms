package data;

public class GraphTheory {

	public static void main(String[] args) {

		Node[] adjacencyList = new Node[4];
		
		adjacencyList[1] = new Node(2,2); // node, weight
		adjacencyList[1].next = new Node(3,4); // node, weight
		// 1 -> 2 (2) ; 1 -> 3 (4)

	}
	
	public static class Node{
		
		int vertice;
		int weight;
		Node next;
		
		public Node(int vertice, int weight) {
			this.vertice = vertice;
			this.weight = weight;
		}
	}
}


