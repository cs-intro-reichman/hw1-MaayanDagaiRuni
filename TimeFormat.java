// Represents the hh:mm time format using an AM/PM format. 

import java.nio.channels.NonReadableChannelException;

public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

		// Set Vars
		String am_pm = "None";
		int real_hours = hours;
		int real_minutes = minutes;
		String strHours = "None";
		String strMinutes = "None";

		// Hour and am_pm state handling
		if (hours > 12){
			am_pm = "PM";
			real_hours = hours - 12;
		}
		else if(hours == 12){
			am_pm = "PM";
			real_hours = hours;
		}
		else{
			am_pm = "AM";
			real_hours = hours;
		}
		if (real_hours <10){
			strHours = "0"+ real_hours;
		}
		else{
			strHours =  String.valueOf(real_hours);
			
		}

		// Minutes Handling - if less then 10 minutes add "0"
		if (minutes <10){
			strMinutes = "0"+ real_minutes;
		}
		else{
			strMinutes = String.valueOf(real_minutes);
			
		}
		System.out.print(strHours + ":" + strMinutes + " " + am_pm );
	}
}