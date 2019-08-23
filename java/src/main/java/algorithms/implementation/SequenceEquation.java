package algorithms.implementation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SequenceEquation {

	static int[] permutationEquation(int[] p) {
		List<Integer> list = Arrays.stream(p).boxed().collect(Collectors.toList());
		int[] result = new int[p.length];
		for(int i = 0; i < result.length; i++)
			result[i] = list.indexOf(list.indexOf(i+1) + 1) + 1;
		
		return result;
    }
}
