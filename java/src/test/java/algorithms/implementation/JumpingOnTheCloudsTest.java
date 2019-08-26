package algorithms.implementation;

import static org.junit.Assert.*;

import org.junit.Test;

import util.ParsingUtil;

public class JumpingOnTheCloudsTest {

	@Test
	public void test() {
		int[] c = {0,0,1,0};
		int k = 2;
		int expected = 96;
		assertEquals(expected, JumpingOnTheClouds.jumpingOnClouds(c, k));
	}

	@Test
	public void test0() {
		int[] c = {0,0,1,0,0,1,1,0};
		int k = 2;
		int expected = 92;
		assertEquals(expected, JumpingOnTheClouds.jumpingOnClouds(c, k));
	}

	@Test
	public void test2() {
		int[] c = ParsingUtil.splitToIntArr("1 1 0 1 0 1 0 1 0 1 0 1 1 0 1 1 1 1 1");
		int k = 19;
		int expected = 97;
		assertEquals(expected, JumpingOnTheClouds.jumpingOnClouds(c, k));
	}

	@Test
	public void test8() {
		int[] c = {1,1,1,0,1,1,0,0,0,0};
		int k = 3;
		int expected = 80;
		assertEquals(expected, JumpingOnTheClouds.jumpingOnClouds(c, k));
	}

}
