package algorithms.implementation;

public class CircularArray {

	static int[] circularArrayRotation(int[] a, int k, int[] queries) {
		int[] result = new int[queries.length];
		k %= a.length;
		for(int i = 0 ; i < queries.length; i++)
			result[i] = a[queries[i] - k >= 0 ? queries[i] - k : a.length+(queries[i] - k)];
		return result;
	}
}
