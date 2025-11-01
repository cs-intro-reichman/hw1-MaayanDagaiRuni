// Computes the future value of a saving investment.

public class FVCalc {
	public static void main(String[] args){
		// Gets three 
		int currentValue = Integer.parseInt(args[0]);
		int rate = Integer.parseInt(args[1]);
		int n = Integer.parseInt(args[2]);

		double intrest_rate = ((double) rate)/100 ;

		double FutureValue = currentValue*(Math.pow((1+ intrest_rate),n));

		System.out.println("After " + n + " years, " + currentValue + " saved at " + rate +
						   "% will yield " + (int)FutureValue + "$.");		
	}
}