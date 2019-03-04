package data;

import java.util.Iterator;

public class Queue<Object> implements Iterable<Object> {
	
	private Node first;
	private Node last;
	private int n;
	
	public class Node{
		private Object item;
		private Node next;
	}

	public Queue(){
		first = null;
		last = null;
		n = 0;
	}
	
	public boolean isEmpty(){ 
		return first == null;
	}
	
	public int size(){
		return n;
	}
	
	public Object peek(){
		return first.item;
	}
	
	public void offer(Object item){
		Node oldLast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if(isEmpty()) first = last;
		else oldLast.next = last;
		n++;
	}
	
	public Object poll(){
		Object item = first.item;
		first = first.next;
		n--;
		if(isEmpty()) last = null;
		return item;
	}
	
	
	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

    public static void main(String[] args) {
    	Queue<String> queue = new Queue<String>();
    	queue.offer("a");
    	queue.offer("b");
    	queue.offer("c");
    	queue.offer("d");
    	
    	System.out.println("Queue size: " + queue.size());
    	
    	String first = queue.poll();
    	
    	System.out.println("first: " + first);
    	
    	System.out.println("Queue size: " + queue.size());   	
    }
	
}

