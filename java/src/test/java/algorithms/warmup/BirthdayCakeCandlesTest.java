package algorithms.warmup;

import static org.junit.Assert.*;

import org.junit.Test;

public class BirthdayCakeCandlesTest {

	@Test
	public void test() {
		int[] input = {4,4,1,3};
		int output = 2;
		assertEquals(output, BirthdayCakeCandles.birthdayCakeCandles(input));
	}

	@Test
	public void test0() {
		int[] input = {3,2,1,3};
		int output = 2;
		assertEquals(output, BirthdayCakeCandles.birthdayCakeCandles(input));
	}

}
