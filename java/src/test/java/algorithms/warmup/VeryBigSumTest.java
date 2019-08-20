package algorithms.warmup;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VeryBigSumTest {

	@Test
	public void test1() {
		long[] input1 = { 1000000001, 1000000002, 1000000003, 1000000004, 1000000005 };
		long output = 5000000015L;
		
		long start = System.nanoTime();
		assertEquals(output, VeryBigSum.aVeryBigSum2(input1));
		System.out.println(String.format("%,d", (System.nanoTime() - start)));
	}

}
