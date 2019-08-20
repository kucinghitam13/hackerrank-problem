package algorithms.warmup;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import util.Util;

public class PlusMinusTest {

	@Test
	public void test() {
		int[] input = {1,1,0,-1,-1};
		String[] output = {"0.400000", "0.400000", "0.200000"};
		assertThat(PlusMinus.plusMinus(input), is(output));
	}

	@Test
	public void test2() {
		int[] input = Util.splitToIntArr("-4 3 -9 0 4 1");
		String[] output = {"0.500000", "0.333333", "0.166667"};
		assertThat(PlusMinus.plusMinus(input), is(output));
	}

}
