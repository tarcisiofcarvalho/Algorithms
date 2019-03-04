package combination;

public class CombinationRepetition2 {

	public static void main(String[] args) {
		
		int[] set = {1,2,3,4};
		int n = set.length;
		int r = 8;
		int c = f(n+r-1)/(f(r)*f(n-1));
		System.out.println("C = " + c);
		
		int chosen[] = new int[r + 1];
		
		combinationRepetition(chosen, set, 0, r, 0, n - 1);

	}
	
	public static void combinationRepetition(int chosen[], int arr[], int index, int r, int start, int end) {
		
		if(index==r) {
			for(int i=0;i<r;i++) {
				System.out.printf("%d ", arr[chosen[i]]); 
			}
            System.out.printf("\n"); 
            return; 			
		}
		
		for(int i=start;i<=end;i++) {
			chosen[index] = i;
			combinationRepetition(chosen,arr,index+1,r,i,end);
		}
		
	}
	
	public static int f(int n) {
		if(n==1)
			return n;
		return n * f(n-1);
	}
}
