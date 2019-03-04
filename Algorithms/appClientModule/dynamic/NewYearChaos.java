package dynamic;

public class NewYearChaos {

	public static void main(String[] args) {
		
		//int[] q = {1,2,5,3,4,7,8,6}; // 4
		int[] q = {1,2,5,3,7,8,6,4}; // 7
		//int[] q = {2,1,5,3,4}; // 3
		int n = q.length;		
		int bribe = 0;
		boolean status = true;
		
		// Ride read from n....1
		for(int i=n;i>1;i--) {
			System.out.println();
			if(i==q[i-2]) { //check if the ride value is equal to expected output value
				//i=i-1; // move to the next member
				bribe++; // compute bribes
			}else if((i-3)>=0) {
				if(i==q[i-3]) { //if not and it is the first step, so run loop again
					i=i-1; // move to the next member
					bribe=bribe+2; // compute bribes
				}else { //if not and it is the last loop, so break and print "Too chaotic"
					status=false;
				}				
			}
			System.out.println();
		}
		if(status) {
			System.out.println(bribe);
		}else {
			System.out.println(bribe);
			System.out.println("Too chaotic");
		}
	}
}
