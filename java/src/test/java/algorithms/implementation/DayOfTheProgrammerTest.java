package algorithms.implementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class DayOfTheProgrammerTest {

	@Test
	public void test() {
		int year = 1984;
		String output = "12.09.1984";
				
		assertEquals(output, DayOfTheProgrammer.dayOfProgrammer(year));
	}

	@Test
	public void test0() {
		int year = 2017;
		String output = "13.09.2017";
		
		assertEquals(output, DayOfTheProgrammer.dayOfProgrammer(year));
	}

	@Test
	public void test1() {
		int year = 2016;
		String output = "12.09.2016";
		
		assertEquals(output, DayOfTheProgrammer.dayOfProgrammer(year));
	}

	@Test
	public void test2() {
		int year = 1800;
		String output = "12.09.1800";
		
		assertEquals(output, DayOfTheProgrammer.dayOfProgrammer(year));
	}

	@Test
	public void test3() {
		int year = 1918;
		String output = "26.09.1918";
		
		assertEquals(output, DayOfTheProgrammer.dayOfProgrammer(year));
	}
}
