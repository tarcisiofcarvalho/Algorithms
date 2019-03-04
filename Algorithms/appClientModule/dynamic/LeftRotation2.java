package dynamic;

public class LeftRotation2 {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		int d = 4;
		
		int n = a.length; 
		int[] b = new int[n];		
		
		if(n>=1 && n<=Math.pow(10, 5) && d>=1 && d<=n) {
			for(int i=0;i<d;i++) {
				for(int j=0;j<n-1;j++) {
					b[j] = a[j+1];
				}
				b[n-1] = a[0];
				a = b.clone();
			}
		}
		for(int k:b)
			System.out.print(k + " ");
		System.out.println();
	}
}
