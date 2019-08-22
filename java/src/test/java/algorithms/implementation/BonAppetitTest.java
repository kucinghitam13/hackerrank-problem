package algorithms.implementation;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BonAppetitTest {

	@Test
	public void test() {
		List<Integer> bill = Arrays.asList(2,4,6);
		int k = 2;
		int b = 6;
		String output = "3";
		
		assertEquals(output, BonAppetit.bonAppetit2(bill, k, b));
	}

	@Test
	public void test0() {
		List<Integer> bill = Arrays.asList(3,10,2,9);
		int k = 1;
		int b = 12;
		String output = "5";
		
		assertEquals(output, BonAppetit.bonAppetit2(bill, k, b));
	}

	@Test
	public void test1() {
		List<Integer> bill = Arrays.asList(3,10,2,9);
		int k = 1;
		int b = 7;
		String output = "Bon Appetit";
		
		assertEquals(output, BonAppetit.bonAppetit2(bill, k, b));
	}

}
