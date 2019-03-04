package math;
public class Division {

	public static void main(String[] args) {
		System.out.println(divide(12,-2));

	}
    public static int divide(int dividend, int divisor) {
        
        if((dividend-divisor)>=divisor)
            return (1 + divide((dividend-divisor),divisor));
        else
            return 1;
    }
}
