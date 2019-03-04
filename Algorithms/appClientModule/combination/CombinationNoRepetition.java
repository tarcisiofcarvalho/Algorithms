package combination;

public class CombinationNoRepetition {

	public static void main(String[] args) {

		int[] set = {1,2,3,4};
		int n = set.length;
		int p = 3;
		int[] data = new int[p];
		int c = f(n)/(f(p)*f(n-p));
		System.out.println(c);
		
		combination(data,set,0,p,0,n-1);
	}
	
	public static void combination(int[] data, int[] set, int index,int p, int start, int end) {
	
		if(index==p) {
			for(int i=0;i<p;i++) {
				System.out.print(data[i] + " ");
			}
			System.out.println();
			return;
		}

		for(int i=start;i<=end && end-i+1 >= p-index;i++) {
			data[index] = set[i];
			combination(data, set, index+1, p, i+1, end);
		}
	}
	
	public static int f(int num) {
		if(num==1)
			return num;
		return num * f(num-1);
	}
	
	
}
