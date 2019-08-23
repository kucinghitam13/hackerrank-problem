package algorithms.implementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class SequenceEquationTest {

	@Test
	public void test() {
		int[] p = {5,2,1,3,4};
		int[] expecteds = {4,2,5,1,3};
		
		assertArrayEquals(expecteds, SequenceEquation.permutationEquation(p));
	}

	@Test
	public void test0() {
		int[] p = {2,3,1};
		int[] expecteds = {2,3,1};
		
		assertArrayEquals(expecteds, SequenceEquation.permutationEquation(p));
	}

	@Test
	public void test1() {
		int[] p = {4,3,5,1,2};
		int[] expecteds = {1,3,5,4,2};
		
		assertArrayEquals(expecteds, SequenceEquation.permutationEquation(p));
	}

}
