package algorithms.implementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class TheHurdleRaceTest {

	@Test
	public void test() {
		int k = 1;
		int[] height = {1,2,3,3,2};
		int expected = 2;
		
		assertEquals(expected, TheHurdleRace.hurdleRace(k, height));
	}

	@Test
	public void test0() {
		int k = 4;
		int[] height = {1,6,3,5,2};
		int expected = 2;
		
		assertEquals(expected, TheHurdleRace.hurdleRace(k, height));
	}

	@Test
	public void test1() {
		int k = 7;
		int[] height = {2,5,4,5,2};
		int expected = 0;
		
		assertEquals(expected, TheHurdleRace.hurdleRace(k, height));
	}

}
