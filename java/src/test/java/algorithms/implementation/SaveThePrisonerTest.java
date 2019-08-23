package algorithms.implementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class SaveThePrisonerTest {

	@Test
	public void test() {
		int n = 4; //prisoners
		int m = 6; //candies
		int s = 2;
		int expected = 3;
		
		assertEquals(expected, SaveThePrisoner.saveThePrisoner2(n, m, s));
	}

	@Test
	public void test0() {
		int n = 5; //prisoners
		int m = 2; //candies
		int s = 1;
		int expected = 2;
		
		assertEquals(expected, SaveThePrisoner.saveThePrisoner2(n, m, s));
	}

	@Test
	public void test00() {
		int n = 5; //prisoners
		int m = 2; //candies
		int s = 2;
		int expected = 3;
		
		assertEquals(expected, SaveThePrisoner.saveThePrisoner2(n, m, s));
	}

	@Test
	public void test1() {
		int n = 7; //prisoners
		int m = 19; //candies
		int s = 2;
		int expected = 6;
		
		assertEquals(expected, SaveThePrisoner.saveThePrisoner2(n, m, s));
	}
	
	@Test
	public void test11() {
		int n = 3; //prisoners
		int m = 7; //candies
		int s = 3;
		int expected = 3;
		
		assertEquals(expected, SaveThePrisoner.saveThePrisoner2(n, m, s));
	}

}
