package algorithms.implementation;

public class JumpingOnTheClouds {
	
	static int jumpingOnClouds(int[] c, int k) {
		int e = 99 - (c[0] == 1 ? 2 : 0);
		for(int i = k % c.length; i != 0; i = (i + k) % c.length)
			e -= 1 + (c[i] == 1 ? 2 : 0);
		return e;
    }

//	this will work assuming constraint n % k == 0 is true, but test case 8 saying otherwise (10 % 3 != 0)
//	static int jumpingOnClouds(int[] c, int k) {
//		int e = 100 - c.length/k;
//		for(int i = 0; i < c.length; i += k) 
//			if(c[i] == 1)
//				e -= 2;
//		return e;
//	}
}
