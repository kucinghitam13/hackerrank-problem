package algorithms.implementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class CatsAndAMouseTest {

	@Test
	public void test() {
		int x = 2, y = 5;
		int z = 4;
		String expected = "Cat B";
		
		assertEquals(expected, CatsAndAMouse.catAndMouse(x, y, z));
	}

	@Test
	public void test0() {
		int x = 1, y = 2;
		int z = 3;
		String expected = "Cat B";
		
		assertEquals(expected, CatsAndAMouse.catAndMouse(x, y, z));
	}
	
	@Test
	public void test00() {
		int x = 1, y = 3;
		int z = 2;
		String expected = "Mouse C";
		
		assertEquals(expected, CatsAndAMouse.catAndMouse(x, y, z));
	}

}
