package dynamic;

public class NewYearChaos2 {

	public static void main(String[] args) {
		
		//int[] q = {2,1,5,3,4};
		int[] q = {1,2,5,3,7,8,6,4}; // 7
		//int[] q = {5, 1, 2, 3, 7, 8, 6, 4}; // Too chaotic
		int n = q.length;		
		int bribe = 0;
		boolean status = true;
				
		int dif = 0;
		for(int i=n;i>0;i--){
			dif = q[i-1]-i;
			if(dif>2) {
				status=false;
				break;
			}else if((dif<=2&&dif>=0)) {
				for(int j = Math.max(0, q[i]-2); j<i;j++) {
					if(q[j]>q[i])bribe++;
				}
			}
		}

		if(status) {
			System.out.println(bribe);
		}else {
			//System.out.println(bribe);
			System.out.println("Too chaotic");
		}
	}

}
