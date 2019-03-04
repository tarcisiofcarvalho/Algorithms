package data;

import java.beans.Visibility;
import java.util.ArrayList;
import java.util.List;

public class SameTree {

	 public static class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) {
			 val = x;
		 }
	}
	
	static boolean status = true;
	static List<Boolean> visited = new ArrayList<Boolean>();
	static List<Integer> parent = new ArrayList<Integer>();
	
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null)
        	if(p==null && q==null)
                return true;
            else
                return false;
        
    	if(p.val==q.val) {
	    	dfs(p.left,q.left);
	    	dfs(p.right,q.right);
    	}else {
    		status=false;
    	}
    	
    	return status; 
    }
    
    public static void dfs(TreeNode p, TreeNode q) {
    	if(p==null || q==null) // end node comparison
    		if(q==null && p==null) {
    			return;
    		}else {
    			status=false;
    			return;
    		}
    	if(p.val!=q.val) {
    		status = false;
    	}else{    	
	    	if(visited.size()<=p.val)
	    		visited.add(true);
	    	dfs(p.left,q.left);
	    	dfs(p.right,q.right);
    	}
    }
	
	public static void main(String[] args) {
		
/*		TreeNode p = new TreeNode(0);
		p.left = new TreeNode(1);
		//p.right = new TreeNode(2);
		
		TreeNode q = new TreeNode(0);
		q.left = null;
		q.right = new TreeNode(2);
		//q.right.left = new TreeNode(3);
		System.out.println(isSameTree(p, q));*/
		System.out.println(isSameTree(null, null));
	}
	


}
