package algorithms.warmup;

import java.util.Arrays;

public class BirthdayCakeCandles {
	
	static int birthdayCakeCandles(int[] ar) {
		int max = Arrays.stream(ar).max().getAsInt();
		int count = (int) Arrays.stream(ar).filter(i -> i == max).count();
		return count;
    }
}
