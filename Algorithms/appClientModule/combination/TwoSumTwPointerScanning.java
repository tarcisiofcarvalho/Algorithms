package combination;
import java.util.Arrays;

public class TwoSumTwPointerScanning {

	public static void main(String[] args) {
		int[] num = {2,7,11,15};
		int[] map = new int[16];
		int[] result = new int[2];
		int target = 9;
		
		for(int i=0;i<num.length;i++) {
			map[num[i]]=i;
		}
		
		Arrays.sort(num);
		
		int start=0;
		int end=num.length-1;
		
		while(start<end) {
			int sum = num[start] + num[end];
			if(sum==target) {
				result[0]=map[num[start]];
				result[1]=map[num[end]];
				break;
			}else if(sum > target) {
				end--;
			}else {
				start++;
			}
		}
	
		System.out.println("index1: " + result[0] + " Value: " + num[result[0]]);
		System.out.println("index2: " + result[1] + " Value: " + num[result[1]]);
		
	}
}