package algorithms.implementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class SockMerchantTest {

	@Test
	public void test() {
		int n = 7;
		int[] ar = {1,2,1,2,1,3,2};
		int expected = 2;
		
		assertEquals(expected, SockMerchant.sockMerchant(n, ar));
	}

	@Test
	public void test0() {
		int n = 9;
		int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		int expected = 3;
		
		assertEquals(expected, SockMerchant.sockMerchant(n, ar));
	}

}
