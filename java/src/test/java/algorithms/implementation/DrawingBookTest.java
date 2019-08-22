package algorithms.implementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class DrawingBookTest {

	@Test
	public void test() {
		int n = 6;
		int p = 2;
		int expected = 1;
		assertEquals(expected, DrawingBook.pageCount2(n, p));
	}
	@Test
	public void test1() {
		int n = 5;
		int p = 4;
		int expected = 0;
		assertEquals(expected, DrawingBook.pageCount2(n, p));
	}

}
