
public class Calendar {	
	
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     
	static int nDaysInMonth = 31; 
	
	public static void main(String args[]) {
		int givenyear = Integer.parseInt(args[0]);
	    int debugDaysCounter = 0; 
	     
		 while (year < givenyear) {
			advance();
		 }
		 int nDaysInGivenyear;
		if (isLeapYear(year)) {
			nDaysInGivenyear= 366;
		} else {
			nDaysInGivenyear= 365;
		}
		for (int i = 0; i < nDaysInGivenyear; i++) {
	 		System.out.print(dayOfMonth + "/" + month + "/" + year);	
			if (dayOfWeek == 1) {
				System.out.print (" Sunday");
			}
			System.out.println();
			
	 		advance();
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
		} 
		if (month == 13) {
			month = 1;
			year++;
			nDaysInMonth = nDaysInMonth(month, year);
			}
		}
	 } 
		 
   
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