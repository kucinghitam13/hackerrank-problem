package algorithms.warmup;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CompareTripletsTest {

	@Test
	public void test1() {
		List<Integer> input1 = Arrays.asList(1,2,3);
		List<Integer> input2 = Arrays.asList(3,2,1);
		List<Integer> output = Arrays.asList(1,1);
//		Assert.assertTrue(output.equals(CompareTriplets.compareTriplets(input1, input2)));
		assertThat(output, is(CompareTriplets.compareTriplets(input1, input2)));
	}

	@Test
	public void test2() {
		List<Integer> input1 = Arrays.asList(5,6,7);
		List<Integer> input2 = Arrays.asList(3,6,10);
		List<Integer> output = Arrays.asList(1,1);
		assertThat(output, is(CompareTriplets.compareTriplets(input1, input2)));
	}

	@Test
	public void test3() {
		List<Integer> input1 = Arrays.asList(17,28,30);
		List<Integer> input2 = Arrays.asList(99,16,8);
		List<Integer> output = Arrays.asList(2,1);
		assertThat(output, is(CompareTriplets.compareTriplets(input1, input2)));
	}

}
