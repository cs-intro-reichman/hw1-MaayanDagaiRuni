// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Get arg
		int lim = Integer.parseInt(args[0]);

		// Set random ints in the limit range
		int a = (int) (Math.random() * lim);
		int b = (int) (Math.random() * lim);
		int c = (int) (Math.random() * lim);

		// Print the random number (not ascending)
		System.out.println(a + " " + b + " " + c);
		
		// Find the Max, Mid and Min
		int a_b_max = Math.max(a, b);
		int max = Math.max(a_b_max, c);
		int a_b_min = Math.min(a, b);
		int min = Math.min(a_b_min,c);

		int mid = (a + b + c) - max - min;

		// Print Ascending
		System.out.println(min + " " + mid + " " + max);

	
	}
}
