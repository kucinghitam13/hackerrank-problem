package algorithms.implementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class BreakingTheRecordsTest {

	@Test
	public void test() {
		int[] input = {12,24,10,24};
		int[] output = {1,1};
		
		assertArrayEquals(output, BreakingTheRecords.breakingRecords(input));
	}

	@Test
	public void test0() {
		int[] input = { 10, 5, 20, 20, 4, 5, 2, 25, 1 };
		int[] output = {2,4};
		
		assertArrayEquals(output, BreakingTheRecords.breakingRecords(input));
	}

	@Test
	public void test1() {
		int[] input = { 3, 4, 21, 36, 10, 28, 35, 5, 24, 42 };
		int[] output = {4,0};
		
		assertArrayEquals(output, BreakingTheRecords.breakingRecords(input));
	}

}
