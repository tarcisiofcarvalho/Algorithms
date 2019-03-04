package dynamic;

public class TwoSumHash {

	public static void main(String[] args) {
		
		int[] num = {2,7,11,15};
		int[] map = new int[16];
		int[] result = new int[2];
		int target = 9;
		int searched = 0;
		for(int i=0;i<num.length;i++) {
			map[num[i]]=i+1;
		}
		
		for(int i=0;i<num.length;i++) {
			searched = target-num[i];
			if(searched>0) {
				if(map[searched]!=0) {
					if(searched>num[i]) {
						result[0]=i;
						result[1]=map[searched]-1;
						break;
					}else {
						result[0]=i;
						result[1]=map[searched]-1;
						break;
					}
				}
			}
		}
		
		System.out.println("index1: " + result[0] + " Value: " + num[result[0]]);
		System.out.println("index2: " + result[1] + " Value: " + num[result[1]]);
	}

}
