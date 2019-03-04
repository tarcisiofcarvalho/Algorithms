package string;

public class SuffixArray {

	public static void main(String[] args) {

		
		suffixArray("banana");
		
		System.out.println(('a' < 'b'));
		
		//int x = '';
		
		//System.out.println(x);
		
	}
	
	private static void suffixArray(String str) {
		
		int[] sArrIndex = new int[str.length()+1];
		String[] sArraySuff = new String[str.length()+1];
		str = str + '$';
		
		for(int i=0;i<str.length();i++) {
			sArrIndex[i] = i+1;
			//sArraySuff[i] = str.sub
			//System.out.println(i+1 + " " + (str.length()-i));
			System.out.println(str.substring(i, str.length()) + " " + (i+1));
		}
		
		//return null;
	}

}
