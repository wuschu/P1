/**
 * Dominik Feller, 06-117-949 
 * FibonacciRec.java
 * 
 * Class to print out the first 50 fibonacci numbers recursively
 */

public class FibonacciRec {
	// recursive method, i = index
	public static long rec(int i) {
		if (i == 0 || i == 1)
			return i;
		else
			return rec(i - 1) + rec(i - 2);
	}

	public static void main(String[] args) {
		int i;
		System.out.println("Die ersten 50 Zahlen der "
				+ "Fibonacci-Folge sind: ");
		for (i = 0; i <= 50; i++)
			System.out.println(rec(i));

	}
}

/**
 * Die ersten Zahlen werden relativ schnell berechnet. Die Ausführung des
 * Programms verzögert sich aber mit jedem Schritt mehr.
 */
