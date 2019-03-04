package string;

public class Anagram {

	public static void main(String[] args) {
		String a = "cde";
		String b = "abc";
		
		int[] indexA = new int[26]; // hash number array A
		for(int i=0;i<a.length();i++) {
			indexA[a.charAt(i)-'a']++;
		}
		
		int[] indexB = new int[26]; // hash number array B
		for(int i=0;i<b.length();i++) {
			indexB[b.charAt(i)-'a']++;
		}
		
		int count = 0;
		
		int dif = 0;
		for(int i=0;i<26;i++) {
			dif = Math.abs(indexA[i] - indexB[i]); 
			if(dif>0) {
				count = count + dif;
			}
		}
		
		System.out.println(count);

	}
}
