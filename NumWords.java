// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int value = Integer.parseInt(args[0]);
		int ones = value % 10;
		int tens = (value / 10 ) % 10;
		int hundreds = value /100;

		System.out.println(hundreds + " hundreds, " + tens + " tens, and "+ ones + " ones.");
	}
}
