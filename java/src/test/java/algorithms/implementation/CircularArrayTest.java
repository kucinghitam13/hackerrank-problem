package algorithms.implementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircularArrayTest {

	@Test
	public void test() {
		int[] a = {3,4,5};
		int k = 2;
		int[] queries = {1,2};
		int[] expecteds = {5,3};

		assertArrayEquals(expecteds, CircularArray.circularArrayRotation(a, k, queries));
	}

	@Test
	public void test0() {
		int[] a = {1,2,3};
		int k = 2;
		int[] queries = {0,1,2};
		int[] expecteds = {2,3,1};
		
		assertArrayEquals(expecteds, CircularArray.circularArrayRotation(a, k, queries));
	}

}
