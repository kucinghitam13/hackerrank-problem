package algorithms.implementation;

public class DayOfTheProgrammer {
	
	static String dayOfProgrammer(int year) {
		int day = 13;
		int month = 9;
		if(year == 1918)
			day = 26;
		else if(year % 4 == 0)
			if(year < 1918 || year % 100 != 0 || year % 400 == 0)
				day--;
		
		return String.format("%02d.%02d.%d", day,month,year);
    }
}
