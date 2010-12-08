/**
 * Dominik Feller, 06-117-949 
 * Fibonacci.java
 * 
 * Class to print out the first 50 fibonacci numbers non-recursively
 */
public class Fibonacci {

	public static void main(String[] args) {
		long previous = -1;
		long result = 1;
		for (int i = 0; i <= 50; i++) {
			long sum = result + previous;
			previous = result;
			result = sum;
			System.out.println(result);
		}

	}

}
