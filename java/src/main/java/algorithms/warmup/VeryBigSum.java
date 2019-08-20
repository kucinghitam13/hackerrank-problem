package algorithms.warmup;

import java.math.*;
import java.util.*;
import java.util.stream.*;

public class VeryBigSum {
	
	static long aVeryBigSum(long[] ar) {
		List<BigInteger> collect = Arrays.stream(ar).mapToObj(l -> new BigInteger(String.valueOf(l)))
				.collect(Collectors.toList());
		BigInteger result = BigInteger.ZERO;
		for(BigInteger x : collect)
			result = result.add(x);
		return result.longValue();
    }

//	BEST
	static long aVeryBigSum2(long[] ar) {
		return Arrays.stream(ar).mapToObj(l -> new BigInteger(String.valueOf(l)))
				.reduce(BigInteger.ZERO, (n1,n2) -> n1.add(n2)).longValue();
	}

}
