package dynamic;

public class HourGlassSum {

	public static void main(String[] args) {
		int[][] arr = new int[][] {
			new int[] {-1, -1,  0, -9, -2, -2},
			new int[] {-2, -1, -6, -8, -2, -5},
			new int[] {-1, -1, -1, -2, -3, -4},
			new int[] {-1, -9, -2, -4, -4, -5},
			new int[] {-7, -3, -3, -2, -9, -9},
			new int[] {-1, -3, -1, -2, -4, -5}
		};

		int sum = 0;
		int large = -999;
		if(arr.length<=6 && arr[0].length<=6) {
			for(int i=0;i<4;i++) {
				for(int j=0;j<4;j++) {
					sum = (arr[i][j]   + arr[i][j+1]   + arr[i][j+2])+
						     		     arr[i+1][j+1] +
						  (arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]);
					if(sum>large) large = sum;
				}			
			}
		}
		System.out.println(large);
	}

}
