package algorithms.warmup;

import java.util.*;

public class CompareTriplets {
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		int na = 0, nb = 0;
		for (int i = 0; i < a.size(); i++) {
			final int comparer = a.get(i).compareTo(b.get(i));
			if (comparer > 0)
				na++;
			else if (comparer < 0)
				nb++;
		}
		return Arrays.asList(na, nb);
	}
}
