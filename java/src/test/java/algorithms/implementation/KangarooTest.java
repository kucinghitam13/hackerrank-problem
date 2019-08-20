package algorithms.implementation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KangarooTest {

	@Test
	public void test() {
		int x1 = 2, v1 = 1;
		int x2 = 1, v2 = 2;
		String output = "YES";
		assertEquals(output, Kangaroo.kangaroo3(x1, v1, x2, v2));
	}

	@Test
	public void test0() {
		int x1 = 0, v1 = 3;
		int x2 = 4, v2 = 2;
		String output = "YES";
		assertEquals(output, Kangaroo.kangaroo3(x1, v1, x2, v2));
	}

	@Test
	public void test1() {
		int x1 = 0, v1 = 2;
		int x2 = 5, v2 = 3;
		String output = "NO";
		assertEquals(output, Kangaroo.kangaroo3(x1, v1, x2, v2));
	}

	@Test
	public void test3() {
		int x1 = 21, v1 = 6;
		int x2 = 47, v2 = 3;
		String output = "NO";
		assertEquals(output, Kangaroo.kangaroo3(x1, v1, x2, v2));
	}

	@Test
	public void test17() {
		int x1 = 55, v1 = 8223;
		int x2 = 5803, v2 = 6509;
		String output = "NO";
		assertEquals(output, Kangaroo.kangaroo3(x1, v1, x2, v2));
	}

	@Test
	public void test22() {
		int x1 = 23, v1 = 9867;
		int x2 = 9814, v2 = 5861;
		String output = "NO";
		assertEquals(output, Kangaroo.kangaroo3(x1, v1, x2, v2));
	}

	@Test
	public void test29() {
		int x1 = 1571, v1 = 4240;
		int x2 = 9023, v2 = 4234;
		String output = "YES";
		long start = System.nanoTime();
		assertEquals(output, Kangaroo.kangaroo(x1, v1, x2, v2));
		System.out.println(String.format("%,d", (System.nanoTime() - start)));
	}
}
