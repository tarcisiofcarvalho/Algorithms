package data;

import java.util.Iterator;

public class Queue2<Object> implements Iterable<Object> {

	Node2 first;
	Node2 last;
	int n;
	
	public class Node2{
		private Object item;
		private Node2 next;
	}
	
	public Queue2(){
		first = null;
		last = null;
		n = 0;
	}
	
	public Object peek(){
		return first.item;
	}
	
	public Object poll(){
		Object item = first.item;
		first = first.next;
		n--;
		return item;
	}
	
	public void offer(Object item){
		Node2 oldLast = last;
		last = new Node2();
		last.item = item;
		last.next = null;
		if(isEmpty()) first = last;
		oldLast.next = last;
		n++;
	}
	
	public boolean isEmpty(){
		return first==null;
	}
	
	public int size(){
		return n;
	}	
	
	
	public static void main(String[] args) {
    	Queue2<String> queue = new Queue2<String>();
    	queue.offer("a");
    	queue.offer("b");
    	queue.offer("c");
    	queue.offer("d");
    	
    	System.out.println("Queue size: " + queue.size());
    	
    	String first = queue.poll();
    	
    	System.out.println("first: " + first);
    	
    	System.out.println("Queue size: " + queue.size());
	}

	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
