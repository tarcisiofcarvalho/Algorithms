package data;

public class Queue3 {

	public static void main(String[] args) {
		Queue q = new Queue<String>();
		
		q.offer("A");
		q.offer("B");
		q.offer("C");
		
		System.out.println("First: A - " + q.peek() );
		
		System.out.println("poll: " + q.poll());
		
		System.out.println("First: B - " + q.peek() );

	}
	
	Node first;
	Node last;
	int n;
	class Node{
		Object item;
		Node next;
	}
	
	Queue3(){
		first=null;
		last=null;
		n=0;
	}
	
	void offer(Object item){
		Node oldLast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if(isEmpty())first=last;
		oldLast.next = last;
		n++;
	}
	
	Object poll(){
		Object oldFirst = first.item;
		first = first.next;
		n--;
		return oldFirst;
	}
	
	Object peek(){
		return first.item;
	}
	
	boolean isEmpty(){
		return first==null;
	}

}
