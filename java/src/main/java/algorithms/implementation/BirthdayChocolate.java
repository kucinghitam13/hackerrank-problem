package algorithms.implementation;

import java.util.List;

public class BirthdayChocolate {

	static int birthday(List<Integer> s, int d, int m) {
		int count = 0;
		for (int i = 0; i < s.size() - m + 1; i++) {
			int sum = 0;
			for (int j = i; j < (i + m); j++)
				sum += s.get(j);
			if (sum == d) count++;
		}
		return count;
	}
}
