package algorithms.warmup;

import java.math.*;

public class PlusMinus {
	public static void main(String[] args) {
		int[] test = {-4, 3, -9, 0, 4, 1};
		plusMinus(test);
	}
	
	static /*void*/double[] plusMinus(int[] arr) {
		final MathContext context = new MathContext(6, RoundingMode.HALF_UP);
		final BigDecimal length = new BigDecimal(String.valueOf(arr.length));
		byte plus = 0;
		byte minus = 0;
		byte zero = 0;
		for(int i : arr)
			if(i > 0)
				plus++;
			else if(i < 0)
				minus++;
			else zero++;
		return new double[]{
			new BigDecimal(String.valueOf(plus)).divide(length, context).doubleValue(),
			new BigDecimal(String.valueOf(minus)).divide(length, context).doubleValue(),
			new BigDecimal(String.valueOf(zero)).divide(length, context).doubleValue()
		};
//		System.out.println(new BigDecimal(String.valueOf(plus)).divide(length, context));
//		System.out.println(new BigDecimal(String.valueOf(minus)).divide(length, context));
//		System.out.println(new BigDecimal(String.valueOf(zero)).divide(length, context));
    }
}

