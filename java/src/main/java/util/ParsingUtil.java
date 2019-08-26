package util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParsingUtil {
	public static List<Integer> splitToIntList(String input){
		return Arrays.stream(splitToStringArr(input))
				.map(Integer::valueOf).collect(Collectors.toList());
	}
	
	public static int[] splitToIntArr(String input) {
		return Arrays.stream(splitToStringArr(input))
				.mapToInt(Integer::parseInt).toArray();
	}
	
	public static String[] splitToStringArr(String input) {
		return input.split(" ");
	}
	
}
