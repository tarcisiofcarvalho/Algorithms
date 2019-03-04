package string;

public class RepeatedString {

	public static void main(String[] args) {
		
		String s = "udjlitpopjhipmwgvggazhuzvcmzhulowmveqyktlakdufzcefrxufssqdslyfuiahtzjjdeaxqeiarcjpponoclynbtraaawrps";
		long n = 872514961806l;
		int k = s.length();
		long as = s.length()-s.replace("a", "").length();
		long count = 0;
		if((n % k)==0) {
			count = as * (n/k);
		}else {
			long remain = n % k;
			String temp = s.substring(0,(int)remain);
			count = (as * ((n-(int)remain)/k)) + temp.length()-temp.replace("a", "").length();
		}

		System.out.println(count);

	}

}
