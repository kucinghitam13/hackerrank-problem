package algorithms.warmup;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MiniMaxSum {	
	
	static /*void*/long[] miniMaxSum(int[] arr) {
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		int minIndex = list.lastIndexOf(Arrays.stream(arr).min().getAsInt());
		int maxIndex = list.lastIndexOf(Arrays.stream(arr).max().getAsInt());

		long min = list.stream().filter(i -> list.indexOf(i) != maxIndex)
				.reduce(0, (i1,i2) -> i1+i2).longValue();

		long max = list.stream().filter(i -> list.indexOf(i) != minIndex)
				.reduce(0, (i1,i2) -> i1+i2).longValue();
		
//		System.out.println(max + " " + min);
		return new long[] {min, max};
	}

	static /*void*/long[] miniMaxSum2(int[] arr) {
		final int sum = Arrays.stream(arr).sum();
		long max = sum - Arrays.stream(arr).min().getAsInt();
		long min = sum - Arrays.stream(arr).max().getAsInt();;
		
		return new long[] {min, max};
	}
	
//	BEST
	static long[] miniMaxSum3(int[] arr) {
		long sum = 0, max = arr[0], min = arr[0];
		for(int i = 0; i< arr.length; i++) {
			sum += arr[i];
			if(arr[i] > max)
				max = arr[i];
			else if(arr[i] < min)
				min = arr[i];
		}
		return new long[] {sum-max, sum-min};
	}
}
