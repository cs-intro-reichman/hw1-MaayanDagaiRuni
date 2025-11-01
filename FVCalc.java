// Computes the future value of a saving investment.

public class FVCalc {
	public static void main(String[] args){
		// Gets current value, rate in percentage and years
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);

		// Calcs the rate precentage 
		double intrest_rate = rate/100 ;

		// Calcs the Furutre Value
		double FutureValue = currentValue*(Math.pow((1+ intrest_rate),n));

		System.out.println("After " + n + " years, $" + currentValue + " saved at " + rate +
						   "% will yield " +"$" + (int)FutureValue + "");		
	}
}