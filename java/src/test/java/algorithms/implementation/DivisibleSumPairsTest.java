package algorithms.implementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisibleSumPairsTest {

	@Test
	public void test() {
		int[] ar = {1,2,3,4,5,6};
		int k = 5;
		int n = ar.length;
		int output = 3;
		
		assertEquals(output, DivisibleSumPairs.divisibleSumPairs(n, k, ar));
	}

	@Test
	public void test0() {
		int[] ar = {1,3,2,6,1,2};
		int k = 3;
		int n = ar.length;
		int output = 5;
		
		assertEquals(output, DivisibleSumPairs.divisibleSumPairs(n, k, ar));
	}

}
