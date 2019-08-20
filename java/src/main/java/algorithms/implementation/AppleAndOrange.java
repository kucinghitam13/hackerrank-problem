package algorithms.implementation;


import java.util.*;

public class AppleAndOrange {
	
	static /*void*/int[] countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
//		System.out.println(Arrays.stream(apples).filter(app -> a + app >= s && a + app <= t).count());
//		System.out.println(Arrays.stream(oranges).filter(or -> b + or >= s && b + or <= t).count());
		return new int[] {
			(int) Arrays.stream(apples).filter(app -> a + app >= s && a + app <= t).count(),
			(int) Arrays.stream(oranges).filter(or -> b + or >= s && b + or <= t).count()
		};
    }
}
