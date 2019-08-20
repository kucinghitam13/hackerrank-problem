package algorithms.warmup;

import static org.junit.Assert.*;

import org.junit.Test;

public class TimeConversionTest {

	@Test
	public void test0() {
		String input = "07:05:45PM";
		String output = "19:05:45";
		assertEquals(output, TimeConversion.timeConversion(input));
	}

	@Test
	public void test1() {
		String input = "12:45:54PM";
		String output = "12:45:54";
		assertEquals(output, TimeConversion.timeConversion(input));
	}

}
