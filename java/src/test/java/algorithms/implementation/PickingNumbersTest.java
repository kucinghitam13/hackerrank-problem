package algorithms.implementation;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PickingNumbersTest {

	@Test
	public void test() {
		List<Integer> a = Arrays.asList(1,1,2,2,4,4,5,5,5);
		int expected = 5;
		
		assertEquals(expected, PickingNumbers.pickingNumbers2(a));
	}

	@Test
	public void test0() {
		List<Integer> a = Arrays.asList(4,6,5,3,3,1);
		int expected = 3;
		
		assertEquals(expected, PickingNumbers.pickingNumbers2(a));
	}

	@Test
	public void test1() {
		List<Integer> a = Arrays.asList(1,2,2,3,1,2);
		int expected = 5;
		
		assertEquals(expected, PickingNumbers.pickingNumbers2(a));
	}

}
