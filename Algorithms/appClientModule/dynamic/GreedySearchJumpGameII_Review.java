package dynamic;

public class GreedySearchJumpGameII_Review {

	public static void main(String[] args) {
		int[] set = {2,3,1,1,4};
		int n = set.length;
		System.out.println(jump(set,n));
	}
	
	static int jump(int[] set, int n) {
		
		int start = 0;
		int end = 0;
		int count = 0;
		if(n==1) return 0;
		while(end<n) {
			int max = 0;
			count++;
			for(int i=start;i<=end;i++) {
				if(set[i]+i >=n-1) {
					return count;
				}
				if(set[i]+i > max) {
					max = set[i]+i;
				}				
			}
			start = end+1;
			end = max;
		}
		return 0;
	}
}
