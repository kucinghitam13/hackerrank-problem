package algorithms.implementation;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BetweenTwoSetsTest {

	@Test
	public void test() {
		List<Integer> input1 = Arrays.asList(2,6);
		List<Integer> input2 = Arrays.asList(24,36);
		int output = 2;

		assertEquals(output, BetweenTwoSets.getTotalX(input1, input2));
	}

	@Test
	public void test0() {
		List<Integer> input1 = Arrays.asList(2,4);
		List<Integer> input2 = Arrays.asList(16,32,96);
		int output = 3;
		
		assertEquals(output, BetweenTwoSets.getTotalX(input1, input2));
	}

}
