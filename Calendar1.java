/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	static int specialSunday = 0;
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		
	    int debugDaysCounter = 0; 
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
	 	while (true) {
	 		System.out.print(dayOfMonth + "/" + month + "/" + year);	
			if (dayOfWeek == 1) System.out.print (" Sunday");
			System.out.println();
			
	 		advance();
	 		debugDaysCounter++;
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 		if (debugDaysCounter >=36524) { 
			System.out.println("During the 20th century, "+ specialSunday + " Sundays fell on the first day of the month");
	 			break;
			}
        }
	}
	
	 private static void advance() {
		dayOfWeek = dayOfWeek % 7;
		dayOfWeek++;
		
		if(dayOfMonth < nDaysInMonth) {
			dayOfMonth++;
		} else { 
		dayOfMonth =1;
		month++;
		nDaysInMonth= nDaysInMonth(month, year);
		if (dayOfWeek == 1) {
			specialSunday++;
		} 
		if (month == 13) {
			month = 1;
			year++;
			nDaysInMonth = nDaysInMonth(month, year);
			}
		}
	 } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) { 
	    if (((year % 100 !=0) && (year % 4 ==0)) || (year % 400 == 0)) {
		return true;
	} else {
		return false;	
	}
	}
	 private static int nDaysInMonth(int month,int year) {
		 int daysInMonth=0;
	switch (month) {
		case 1: 
		case 3 : 
		case 5 :
		case 7: 
		case 8 : 
		case 10 : 
		case 12 : 
		daysInMonth = 31;
	break;
		case 4 : 
		case 6 : 
		case 9 : 
		case 11 : 
		daysInMonth = 30;
	break;
	case 2: 
	if (isLeapYear(year) == true) {
		daysInMonth = 29;
	} else { 
	daysInMonth= 28;
	} 
	break;
	default :
	break;
	}
		return daysInMonth;
	}
}