package util;

public class MathUtil {
	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
	
	public static int lcm(int a, int b, int gcd) {
		return a == b ? a : a*b/gcd;
	}

	public static int lcm(int[] numbers) {
		int result = numbers[0];
		int gcd = gcd(numbers);
		for (int i = 1; i < numbers.length; i++) {
			result = lcm(result, numbers[i], gcd);
		}
		return result;
	}

	public static int gcd(int[] numbers) {
		int result = numbers[0];
		for (int i = 1; i < numbers.length; i++)
			result = gcd(result, numbers[i]);
		return result;
	}
	
	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}
