// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int value = Integer.parseInt(args[0]);
		int ones = value % 10;
		int tens = ((value % 100)- ones)/10;
		int hundreds = ((value % 1000)- tens -ones)/100;

		System.out.println(hundreds + " hundreds, " + tens + " tens, and "+ ones + " ones.");
	}
}
