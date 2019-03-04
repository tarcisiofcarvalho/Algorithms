package data;

public class BinaryTree {

	static Node root = null;
	
	public static void main(String[] args) {

		BinaryTree bt = new BinaryTree();
	    bt.add(6);
	    bt.add(5);
	    bt.add(8);
	    bt.add(3);
	    bt.add(7);
	    bt.add(9);
	    
	    //System.out.println(containsNodeRecursively(root,10));
	    traverseInOrder(root);
	    bt.add(4);
	    
	    System.out.println(" <> ");
	    //System.out.println(containsNodeRecursively(root,10));
	    
	    traverseInOrder(root);
	}
	
	class Node{
		int value = 0;
		Node left;
		Node right;
		
		Node(int value){
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}
	
	public void add(int value) {
		root = addRecursively(root, value);
	}
	
	public Node addRecursively(Node current, int value){
		// check null
		if(current==null)return new Node(value); 
		
		if(current.value>value){ // Check left
			current.left=addRecursively(current.left,value);
		}else if(current.value<value){ // Check right
			current.right = addRecursively(current.right, value);
		}else{
			return current;
		}
		return current;
	}
	
	public static boolean containsNodeRecursively(Node current, int value) {
		if(current==null) {
			return false;
		}
		
		if(current.value==value) {
			return true;
		}
		
		return value < current.value  
			   ? containsNodeRecursively(current.left, value)
			   : containsNodeRecursively(current.right, value);
	}
	
	public static void traverseInOrder(Node node) {
		if(node != null) {
			traverseInOrder(node.left);
			System.out.print(" " + node.value);
			traverseInOrder(node.right);
		}
	}
	
	public static void traversePreOrder(Node node) {
		if(node != null) {
			System.out.print(" " + node.value);			
			traversePreOrder(node.left);
			traversePreOrder(node.right);
		}
	}	
	
	public static void traversePostOrder(Node node) {
		if(node != null) {
			traversePostOrder(node.left);
			traversePostOrder(node.right);
			System.out.print(" " + node.value);				
		}
	}	
}
