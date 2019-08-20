package algorithms.warmup;

import static org.junit.Assert.*;

import org.junit.Test;

public class MiniMaxSumTest {

	@Test
	public void test() {
		int[] input = {1,3,5,7,9};
		long[] output = {16, 24};
		long start = System.nanoTime();
		assertArrayEquals(output, MiniMaxSum.miniMaxSum3(input));
		System.out.println(String.format("%,d", (System.nanoTime() - start)));
	}

	@Test
	public void test1() {
		int[] input = {1,2,3,4,5};
		long[] output = {10, 14};
		assertArrayEquals(output, MiniMaxSum.miniMaxSum3(input));
	}

}
