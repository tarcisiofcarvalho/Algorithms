package scanner;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Test String to int using Scanner
		
		System.out.println("Insert the value");
		
		String value = input.next();
		
		System.out.println("The value was: " + value);

		Scanner newValue = new Scanner(value).useDelimiter("\\s*fish\\s");
		int x = newValue.nextInt();
		
		System.out.println("Converted value: " + x);
	}

}
