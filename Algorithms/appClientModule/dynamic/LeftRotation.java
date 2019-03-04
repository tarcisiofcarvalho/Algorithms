package dynamic;

public class LeftRotation {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		int d = 4;
		
		int n = a.length; 
		int[] b = new int[n];		
		
		if(n>=1 && n<=Math.pow(10, 5) && d>=1 && d<=n) {
			for(int j=0;j<n;j++) {
				b[j] = a[(j + d) % n];
			}
			for(int k:b)
				System.out.print(k + " ");
		}
	}
}
