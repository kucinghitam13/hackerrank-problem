package algorithms.implementation;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MigratoryBirdsTest {

	@Test
	public void test() {
		List<Integer> arr = Arrays.asList(1,1,2,2,3);
		int expected = 1;
		
		assertEquals(expected, MigratoryBirds.migratoryBirds2(arr));
	}

	@Test
	public void test0() {
		List<Integer> arr = Arrays.asList(1,4,4,4,5,3);
		int expected = 4;
		
		assertEquals(expected, MigratoryBirds.migratoryBirds2(arr));
	}
	
	@Test
	public void test1() {
		List<Integer> arr = Arrays.asList(1,2,3,4,5,4,3,2,1,3,4);
		int expected = 3;
		
		assertEquals(expected, MigratoryBirds.migratoryBirds2(arr));
	}

}
