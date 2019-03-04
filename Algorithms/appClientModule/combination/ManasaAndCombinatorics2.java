package combination;

import java.util.Arrays;

public class ManasaAndCombinatorics2 {

	private static long MOD = 99991;

	private static long pow(long x, long n, long p) {
	    long result = 1;
	    while(n != 0) {
	        if(n % 2 == 1) {
	            result = result * x % p;
	        }
	        n /= 2;
	        x = x * x % p;
	    }
	    return result;
	}

	private static long inverse(long n, long p) {
	    return pow(n, p - 2, p);
	}

	private static long C(long n, long k, long p) {
	    long top = 1;
	    long bottom = 1;
	    for(long i = 1; i <= k; i++) {
	        top = top * (n + 1 - i) % p;
	        bottom = bottom * i % p;
	    }
	    return top * inverse(bottom, p) % p;
	}

	private static long C(long n, long k) {
	    long result = 1;
	    while(k > 0) {
	        result = (result * C(n % MOD, k % MOD, MOD)) % MOD;
	        n /= MOD;
	        k /= MOD;
	    }
	    return result;
	}

	public static void main(String args[]) {
	    int T = 2;
	    int N=2;
	    //for(long N; cin >> N; ) {
	        if(N == 1) {
	            System.out.println(1);
	        } else {
	            System.out.println((C(3 * N, N) - 2 * C(3 * N, N - 1) + C(3 * N, N - 2) + MOD + MOD) % MOD);
	        }
	    //}
	    //return 0;
	}
}
