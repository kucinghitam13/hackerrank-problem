package algorithms.implementation;

import java.util.List;

import util.Util;

public class BetweenTwoSets {

	static int getTotalX(List<Integer> a, List<Integer> b) {
		int lcmA = Util.lcm(a.stream().mapToInt(i-> i).toArray());
		int gcdB = Util.gcd(b.stream().mapToInt(i-> i).toArray());
		
		int count = 0;
		for(int i = lcmA; i <= gcdB; i += lcmA) {
			if(gcdB % i != 0) continue;
			count++;
		}
		
		return count;
	}

}
