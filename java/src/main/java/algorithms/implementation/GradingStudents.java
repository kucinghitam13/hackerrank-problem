package algorithms.implementation;

import java.util.List;
import java.util.stream.Collectors;

public class GradingStudents {

	public static List<Integer> gradingStudents(List<Integer> grades) {
		final int n = 5;
		return grades.stream().map(g -> (g > 37 && g % n > 2) ? (g += 5 - (g % n)) : g)
				.collect(Collectors.toList());
	}

//	not ternary
	public static List<Integer> gradingStudents2(List<Integer> grades) {
		final int n = 5;
		return grades.stream().map(g -> {
			if(g > 37 && g % n > 2)
				g += 5 - (g%n);
			return g;
		}).collect(Collectors.toList());
	}
}
