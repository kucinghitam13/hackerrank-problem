package algorithms.implementation;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BirthdayChocolateTest {
	
	@Test
	public void test() {
		List<Integer> chocolates = Arrays.asList(2, 2, 1, 3, 2);
		int birthDate = 4;
		int birthMonth = 2;
		int output = 2;
		
		assertEquals(output, BirthdayChocolate.birthday(chocolates, birthDate, birthMonth));
	}

	@Test
	public void test0() {
		List<Integer> chocolates = Arrays.asList(1, 2, 1, 3, 2);
		int birthDate = 3;
		int birthMonth = 2;
		int output = 2;
		
		assertEquals(output, BirthdayChocolate.birthday(chocolates, birthDate, birthMonth));
	}

	@Test
	public void test1() {
		List<Integer> chocolates = Arrays.asList(4);
		int birthDate = 4;
		int birthMonth = 1;
		int output = 1;
		
		assertEquals(output, BirthdayChocolate.birthday(chocolates, birthDate, birthMonth));
	}

}
