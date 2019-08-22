package algorithms.implementation;

import java.util.Arrays;

public class TheHurdleRace {
	
	static int hurdleRace(int k, int[] height) {
		int max = Arrays.stream(height).max().getAsInt();
		return k >= max ? 0 : max - k ;
    }
}
