package algorithms.implementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtopianTreeTest {

	@Test
	public void test() {
		int n = 0;
		int expected = 1;
		
		assertEquals(expected, UtopianTree.utopianTree3(n));
	}

	@Test
	public void test1() {
		int n = 1;
		int expected = 2;
		
		assertEquals(expected, UtopianTree.utopianTree3(n));
	}

	@Test
	public void test2() {
		int n = 2;
		int expected = 3;
		
		assertEquals(expected, UtopianTree.utopianTree3(n));
	}

	@Test
	public void test3() {
		int n = 3;
		int expected = 6;
		
		assertEquals(expected, UtopianTree.utopianTree3(n));
	}

	@Test
	public void test4() {
		int n = 4;
		int expected = 7;
		
		assertEquals(expected, UtopianTree.utopianTree3(n));
	}

	@Test
	public void test5() {
		int n = 5;
		int expected = 14;
		
		assertEquals(expected, UtopianTree.utopianTree3(n));
	}

}
