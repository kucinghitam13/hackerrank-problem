package algorithms.implementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class ViralAdTest {

	@Test
	public void test() {
		int n = 5;
		int expected = 24;
		
		assertEquals(expected, ViralAd.viralAdvertising(n));
	}

	@Test
	public void test0() {
		int n = 3;
		int expected = 9;
		
		assertEquals(expected, ViralAd.viralAdvertising(n));
	}

}
