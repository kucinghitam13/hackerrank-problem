package algorithms.implementation;


public class BeautifulDays {
	
	static int beautifulDays(int i, int j, int k) {
		int count = 0;
		for(int n = i; n <= j; n++)
			if(Math.abs(n - Integer.parseInt(reverseString(String.valueOf(n)))) %  k == 0)
				count++;
		return count;
    }
	
	private static String reverseString(String s) {
		StringBuilder builder = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--)
			builder.append(s.charAt(i));
		return builder.toString();
	}
}
