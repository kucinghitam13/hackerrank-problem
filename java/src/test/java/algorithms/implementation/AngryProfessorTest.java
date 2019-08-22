package algorithms.implementation;

import static org.junit.Assert.*;

import org.junit.Test;

import util.Util;

public class AngryProfessorTest {

	@Test
	public void test() {
		int k = 4;
		int[] a = {-1,-1,0,0,1,1};
		String expected = "NO";
		
		assertEquals(expected, AngryProfessor.angryProfessor(k, a));
	}

	@Test
	public void test0() {
		int k = 3;
		int[] a = Util.splitToIntArr("-1 -3 4 2");
		String expected = "YES";
		
		assertEquals(expected, AngryProfessor.angryProfessor(k, a));
	}

	@Test
	public void test1() {
		int k = 2;
		int[] a = Util.splitToIntArr("0 -1 2 1");
		String expected = "NO";
		
		assertEquals(expected, AngryProfessor.angryProfessor(k, a));
	}

}
