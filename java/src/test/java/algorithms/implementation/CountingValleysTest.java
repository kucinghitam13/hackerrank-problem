package algorithms.implementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountingValleysTest {

	@Test
	public void test() {
		int n = 8;
		String s = "UDDDUDUU";
		int expected = 1;
		
		assertEquals(expected, CountingValleys.countingValleys(n, s));
	}

}
