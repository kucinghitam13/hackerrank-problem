package algorithms.warmup;

public class TimeConversion {
	private static final String AM = "AM";
	private static final String PM = "PM";
	
	public static void main(String[] args) {
		String time = "12:45:54PM";
		System.out.println(timeConversion(time));
	}
	
	static String timeConversion(String s) {
		int hour = Integer.parseInt(s.substring(0, 2));
		String period = s.substring(s.length()-2);
		switch(period) {
		case AM:
			if(hour == 12)
				hour = 0;
			break;
		case PM:
			if(hour != 12)
				hour += 12;
			break;
		}

		StringBuilder builder = new StringBuilder(String.format("%02d", hour))
				.append(s.substring(2, s.length()-2));
		
		return builder.toString();
    }
}
