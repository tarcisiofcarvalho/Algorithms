package combination;

public class CombinationRepetition {

	public static void main(String[] args) {

		int[] set = {1,2,3,4};
		int n = set.length;
		int p = 10;
		int c = ((f(n+p-1))/(f(p)*f(n-1)));
		System.out.println(c);
		int[] chosen = new int[p+1];
		
		combinationRepetition(chosen,set,0,p,0,n-1);
	}
	
	public static void combinationRepetition(int[] chosen, int[] set, int index, int p, int start, int end) {
		
		if(index==p) {
			for(int i=0;i<p;i++) {
				System.out.printf("%d ", set[chosen[i]]);
			}
			System.out.println();
			return;
		}
		
		for(int i=start;i<=end;i++) {
			chosen[index] = i;
			combinationRepetition(chosen, set, index+1, p, i, end);
		}
	}

	public static int f(int num) {
		if(num==1)
			return num;
		return num *f(num-1);
	}
}
