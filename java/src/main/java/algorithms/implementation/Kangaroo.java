package algorithms.implementation;


public class Kangaroo {
	
	private static final String YES = "YES";
	private static final String NO = "NO";
	
	
	public static void main(String[] args) {
		System.out.println(kangaroo(0, 3, 4, 2));
		System.out.println(kangaroo(0, 2, 5, 3));
		System.out.println(kangaroo(0, 50, 5, 3));
	}
	
//	BEST O(1)
	static String kangaroo3(int x1, int v1, int x2, int v2) {
		if(x1 == x2) return YES;
		int lowStart = x1;
		int highStart = x2;
		int lowSpeed = v1;
		int highSpeed = v2;
		if(x1 < x2 && v1 <= v2)
			return NO;
		else if(x1 > x2) {
			if(v1 >= v2)
				return NO;
			lowStart = x2;
			highStart = x1;
			lowSpeed = v2;
			highSpeed = v1;
		}
		return (highStart-lowStart) % (lowSpeed-highSpeed) == 0? YES : NO;
	}
	
	static String kangaroo(int x1, int v1, int x2, int v2) {
		if(x1 == x2) return YES;
		int startComparison = Integer.valueOf(x1).compareTo(x2);
		int velocityComparison = Integer.valueOf(v1).compareTo(v2);
		int lowStart = x1;
		int highStart = x2;
		int lowSpeed = v1;
		int highSpeed = v2;
		switch(startComparison) {
		case -1:
			if(velocityComparison == -1) return NO;
			break;
		case 1:
			if(velocityComparison == 1) return NO;
			lowStart = x2;
			highStart = x1;
			lowSpeed = v2;
			highSpeed = v1;
			break;
		}
		
		return check(lowStart, highStart, lowSpeed, highSpeed) ? YES : NO;
    }
	
	static String kangaroo2(int x1, int v1, int x2, int v2) {
		if(x1 == x2) return YES;
		int lowStart = x1;
		int highStart = x2;
		int lowSpeed = v1;
		int highSpeed = v2;
		if(x1 < x2 && v1 <= v2)
			return NO;
		else if(x1 > x2) {
			if(v1 >= v2)
				return NO;
			lowStart = x2;
			highStart = x1;
			lowSpeed = v2;
			highSpeed = v1;
		}
		return check(lowStart, highStart, lowSpeed, highSpeed) ? YES : NO;
	}
	
	private static boolean check(
			final int lowStart,final int highStart,
			final int lowSpeed,final int highSpeed) {
		int lowPosition = lowStart;
		int highPosition = highStart;
		do {
			lowPosition += lowSpeed;
			highPosition += highSpeed;
		}while(lowPosition < highPosition);
		return lowPosition == highPosition;
	}
}
