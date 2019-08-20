package algorithms.warmup;

import static org.junit.Assert.*;

import org.junit.Test;

public class StaircaseTest {

	@Test
	public void test() {
		int input = 4;
		String output =
				"   #\n" + 
				"  ##\n" + 
				" ###\n" + 
				"####\n";
		assertEquals(output, Staircase.staircase(input));
	}

	@Test
	public void test1() {
		int input = 6;
		String output =
				"     #\n" + 
				"    ##\n" + 
				"   ###\n" + 
				"  ####\n" + 
				" #####\n" + 
				"######\n";
		assertEquals(output, Staircase.staircase(input));
	}

}
