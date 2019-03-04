package dynamic;

public class NewYearChaos3 {

	public static void main(String[] args) {
		
		//int[] q = {2,1,5,3,4};
		int[] q = {1,2,5,3,7,8,6,4}; // 7
		//int[] q = {5, 1, 2, 3, 7, 8, 6, 4}; // Too chaotic
		int n = q.length;		
		int bribe = 0;
		boolean status = true;

	    for (int i = n - 1; i >= 0; i--) {
	        if (q[i] - (i + 1) > 2) {
	            status=false;
	            break;
	        }
	        for (int j = Math.max(0, q[i] - 2); j < i; j++)
	            if (q[j] > q[i]) bribe++;
	    }
		if(status) {
			System.out.println(bribe);
		}else {
			System.out.println("Too chaotic");
		}
	}

}
