package algorithms.implementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class ElectronicShopTest {

	@Test
	public void test() {
		int b = 60;
		int[] keyboards = {40,50,60};
		int[] drives = {5,8,12};
		int expected = 58;
		
		assertEquals(expected, ElectronicShop.getMoneySpent(keyboards, drives, b));
	}

	@Test
	public void test0() {
		int b = 10;
		int[] keyboards = {3,1};
		int[] drives = {5,2,8};
		int expected = 9;
		
		assertEquals(expected, ElectronicShop.getMoneySpent(keyboards, drives, b));
	}

	@Test
	public void test1() {
		int b = 5;
		int[] keyboards = {4};
		int[] drives = {5};
		int expected = -1;
		
		assertEquals(expected, ElectronicShop.getMoneySpent(keyboards, drives, b));
	}

}
