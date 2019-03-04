package combination;
public class MathOperationsCombination {

	static int c = 0;
	static boolean found = false;
	static int m = -1;
	public static void main(String[] args) {
		
		int[] set = {1,2,3,4,5,9,8}; // Set of good touch
		int[] opers = {0,1,2,3}; // + - * /
		int target = 300; // Target number
		int M = 15; // Maximum of touch, including =
		int n = set.length; // set size
		int p = divide(M, 2); // Combination subset size, should be less than equal M (maximum of touch)
		int[] choose = new int[p]; // start subset size
		
		// start combinations
		getCombination(choose,set,0,p,0,n-1, target, M, opers);
	}
	
	static void getCombination(int[] choose, int[] set, int index, int p, int start, int end, int target, int M, int[] opers) {
		
		if(!found) {
			if(index==p) {
				// Combine number combination subset with operators subset combination
				getOperation(choose, opers, new int[p-1], 0, p-1, 0, opers.length-1, target, M);
				
				// If m is not 0 or -1 and less than or equal the M (maximum of touches)
				//System.out.println(m);
				if(m>0 && m<=M) {
					System.out.println("Result found m = " + m);
				}
				return;
			}
			
			for(int i=start;i<=end;i++) {
				choose[index] = set[i];
				getCombination(choose, set, index+1, p, i, end, target, M, opers);
			}
		}
	}
	
	static void getOperation(int[] set, int[] opers, int[] choose, int index, int p, int start, int end, int target, int M) {
		
		if(!found) {
			if(index==p) {
				int a = set[0]; // Set a equals to the first element set
				m = 1; // First touch to add the first element
				System.out.print(a);
				for(int i=1;i<set.length;i++) { // start loop for set numbers combining operators sub set
					System.out.print(" " + getoOpe(choose[i-1]) + " " + set[i]);
					a = math(a, set[i], choose[i-1]); // a will be equals to latest a operation against next number from set
					if(i==set.length-1) {
						System.out.print(" = " + a);
						System.out.println();
					}
					m = m + 2; // Adding touch of operator and next number
					if(a==target && (m+1) <= M) { // if a==target and m is under limit, desired m found
						found=true; // set true flag to stop next getOperation if exists
						m = m + 1; // Adding = touch
						System.out.print(" = " + a);
						System.out.println();						
						return; // Stop this recursion
					}else if(a==-1) { //
						m = -1; // Set m as -1
						System.out.print(" = " + a);
						System.out.println();						
						return; // Stop this recursion
					}
				}
				//System.out.println();
				if(!found)m=0; // If no flag found, reset m for next iteration
				return; // Stop this recursion
			}
			
			for(int i=start;i<=end;i++) {
				choose[index] = opers[i];
				getOperation(set, opers, choose, index+1, p, i, end, target, M);
			}	
		}
		
	}
	
	static char getoOpe(int x) {
		char v = '.';
		switch (x) {
		case 0:
			v='+';
			break;
		case 1:
			v='-';
			break;
		case 2:
			v='*';
			break;
		case 3:
			v='/';
			break;			
		default:
			break;
		}
		return v;
	}
	
	static int math(int a, int b, int o) {
		switch (o) {
		case 0: // sum
			//System.out.println(a + " + " + b + " = " + (a+b));
			return a + b;
		case 1: // minus
			if((a - b)>=0) {
				//System.out.println(a + " - " + b + " = " + (a-b));
				return a-b;
			}else {
				return -1;
			}
		case 2: // multiply
			//System.out.println(a + " * " + b + " = " + (a*b));
			return a * b;

		case 3: // division
			int x = divide(a, b); 
			//System.out.println(a + " / " + b + " = " + x);
			return x;

		}
		return 0;
	}
	
    public static int divide(int dividend, int divisor) {
        
    	if(dividend>=divisor) {
	    	if((dividend-divisor)>=divisor)
	            return (1 + divide((dividend-divisor),divisor));
	        else
	            return 1;
        }else {
        	return -1;
        }
    }

}
