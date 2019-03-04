package math;

import java.math.BigInteger;

public class FibonacciTest2 {

	public static void main(String[] args) {
		BigInteger t1 = new BigInteger("0");
		BigInteger t2 = new BigInteger("1");
		BigInteger temp = new BigInteger("0");
		for(int i=3; i<=10;i++){
			temp = t2;
			t2 = t2.multiply(t2);
			t2 = t2.add(t1);			
			t1 = temp;
		}
		System.out.println(t2.toString());
	}

}

