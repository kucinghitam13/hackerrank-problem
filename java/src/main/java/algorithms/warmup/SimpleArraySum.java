package algorithms.warmup;

import java.util.Arrays;

public class SimpleArraySum {

	static int simpleArraySum(int[] ar) {
		int n = 0;
		for (int i : ar)
			n += i;
		return n;
	}
	
	static int simpleArraySum2(int[] ar) {
		return Arrays.stream(ar).reduce((i1, i2) -> i1 + i2).getAsInt();
	}

}
