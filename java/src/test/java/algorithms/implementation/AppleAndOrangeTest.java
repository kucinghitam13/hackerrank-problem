package algorithms.implementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppleAndOrangeTest {

	@Test
	public void test() {
		int s = 7, t = 10; //HOUSE
		int a = 4; // APPLE TREE
		int b = 12; // ORANGE TREE
//		int m = 3; //APPLES
//		int n = 3; //ORANGES
		int[] apples = {2,3,-4};
		int[] oranges = {3,-2,-4};
		int[] output = {1,2};
		assertArrayEquals(output, AppleAndOrange.countApplesAndOranges(s, t, a, b, apples, oranges));
	}

	@Test
	public void test0() {
		int s = 7, t = 11; //HOUSE
		int a = 5; // APPLE TREE
		int b = 15; // ORANGE TREE
		int[] apples = {-2,2,1};
		int[] oranges = {5,-6};
		int[] output = {1,1};
		assertArrayEquals(output, AppleAndOrange.countApplesAndOranges(s, t, a, b, apples, oranges));
	}

}
