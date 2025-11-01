// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		int total = Integer.parseInt(args[3]);

		// Converts to Double and Splits the total payment to three 
		double pay_each = (double) total/3;

		// Ceils the payment for each
		double round_pay_each = Math.ceil(pay_each);

		// Print the Names and the amount to pay ecah
		System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 +
						   ": pay " + round_pay_each + " Shekels each.");

	}
}
