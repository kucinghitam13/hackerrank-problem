package algorithms.warmup;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimpleArraySumTest {

	@Test
	public void test1() {
		final int[] input = {1, 2, 3};
		final int output = 6;
		assertEquals(output, SimpleArraySum.simpleArraySum2(input));
	}

	@Test
	public void test2() {
		final int[] input = {1, 2, 3, 4, 10, 11};
		final int output = 31;
		assertEquals(output, SimpleArraySum.simpleArraySum2(input));
	}

}
