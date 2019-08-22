package algorithms.implementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class BeautifulDaysTest {

	@Test
	public void test() {
		int i = 20;
		int j = 23;
		int k = 6;
		int expected = 2;
		
		assertEquals(expected, BeautifulDays.beautifulDays(i, j, k));
	}

}
