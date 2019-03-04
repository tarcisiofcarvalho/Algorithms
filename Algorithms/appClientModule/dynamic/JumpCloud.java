package dynamic;

public class JumpCloud {

	public static void main(String[] args) {
		
		int[] ar = {0,0,0,0,1,0};
		int n = ar.length;
		int jump=0;

		if(n>=2 && n<=100) {// Rule
			if(ar[0]==0 && ar[n-1]==0) {// Rule
				for(int i=1;i<n;i++){// Loop
					if(ar[i]==0 || ar[i]==1) {// Rule
						if((i+1)<=(n-1)) {
							if(ar[i-1]==0 && ar[i]==0 && ar[i+1]==0) {
								jump = jump + 1;
								i++;
							}else if(ar[i]==0){
								jump++;
							}
						}else if(ar[i]==0){
							jump++;
						}
					}				
				}
			}
			System.out.println(jump);
		}
	}

}
