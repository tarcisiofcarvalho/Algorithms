package permutation;

public class Permutation2 {

	public static void main(String[] args) {

		int T = 2;
		
		String str = "ABSG";
		
		permutation(str, 0, str.length());
		
	}
	
	public static String swap(String str, int i, int j) {
		
		char[] list = str.toCharArray();
		char temp = list[i];
		list[i] = list[j];
		list[j] = temp;
		
		return String.valueOf(list);
	}
	
	public static void permutation(String str, int l, int r) {
		
		if(l==r) {
			System.out.println(str);
		}else {
			for(int i=l;i<r;i++) {
				str = swap(str, l, i);
				permutation(str, l+1, r);
				str = swap(str, l, i);
			}
		}
	}

}
