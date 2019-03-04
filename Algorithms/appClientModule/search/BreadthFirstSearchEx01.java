package search;
import java.util.ArrayList;
import java.util.List;

public class BreadthFirstSearchEx01 {

	private static class Node{
		Object item;
		Node next;
		
		Node() {

		}
	}
	
	private static class Queue {
		
		Node first;
		Node last;
		int size;
		
		public Object dequeue() {
			Object item = first.item;
			first = first.next;
			if(size>0) size--;
			if(size==0) last=null;
			return item;
		}
		
		public void enqueue(Object item) {
			Node oldLast = last;
			last = new Node();
			last.item = item;
			last.next = null;
			
			if(size==0)first=last;
			else oldLast.next=last;
			size++;
		}
		
		public boolean isEmpty() {
			return size==0;
		}
		
		
	}
	
	public static void main(String[] args) {
		int[] level = {-1,-1,-1,-1,-1,-1,-1};
		int[] parent = {-1,-1,-1,-1,-1,-1,-1};
		List<int[]> adjList = new ArrayList<int[]>();
		adjList.add(new int[]{1});
		adjList.add(new int[]{2,3,0});
		adjList.add(new int[]{1,6});
		adjList.add(new int[]{4,5});
		adjList.add(new int[]{3});
		adjList.add(new int[]{6,3});
		adjList.add(new int[]{2,5});		
		
		Queue q = new Queue();		
		q.enqueue(0);
		level[0] = 0;
		
		while(!q.isEmpty()) {
			int current = (int) q.dequeue();
			for(int adj: adjList.get(current)) {
				if(level[adj]==-1) {
					q.enqueue(adj);
					level[adj] = level[current]+1;
					parent[adj] = current;
				}
			}			 
		}
		
		System.out.println("Level: ");
		for(int i: level)
			System.out.print(i + " ");
		
		System.out.println();
		
		System.out.print("Parent: ");
		for(int j: parent)
			System.out.print(j + " ");
		
	}

}
