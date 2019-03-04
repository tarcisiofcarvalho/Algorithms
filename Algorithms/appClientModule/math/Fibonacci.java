package math;

public class Fibonacci {

	public static void main(String[] args) {

		int n = 11;
		
		int t1 = 1;
		int t2 = 1;
		int t3 = 0;
		
		for(int i=1;i<n;i++) {
			t3 = t1+t2;
			t1 = t2;
			t2 = t3;
			System.out.print(t3 + " ");
		}

	}

}
