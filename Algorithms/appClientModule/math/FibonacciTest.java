package math;

import java.math.BigInteger;

public class FibonacciTest {

	public static void main(String[] args) {
		BigInteger t1 = new BigInteger("0");
		BigInteger t2 = new BigInteger("1");
		int n = 10;
        BigInteger temp = new BigInteger("0");
        for(int i=3;i<=n;i++){
            temp = t2;
            t2 = t2.multiply(t2);
            t2 = t2.add(t1);
            t1 = temp;
        }
        System.out.println(t2.toString());

	}

}

