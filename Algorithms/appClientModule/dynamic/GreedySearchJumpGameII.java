package dynamic;

public class GreedySearchJumpGameII {

	public static void main(String[] args) {
		int[] A = {2,3,1,1,4};
		int n = A.length;
		System.out.println(jump(A,n));
	}

	static int jump(int A[], int n) {
		int start = 0; // dynamic start
		int end = 0; // dynamic end. It is where the next step is
		int count = 0; // Number of jumps
		if(n==1) return 0; // there is no jump to do
		while(end <n) { // When the dynamic end reach the n
			int max = 0; // will update the new end
			count++; // Jump counting
			for(int i=start;i<=end;i++) {
				if(A[i]+i >=n-1) { // Compare with the real end
					return count;
				}
				if(A[i]+i > max) { // Compare with dynamic end and update max
					max = A[i]+i;
				}
			}
			start = end+1; // move start to next element after current end
			end = max; // move end ahead to new max			
		}
		return 0;
	}
}
