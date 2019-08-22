package algorithms.implementation;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MigratoryBirds {
	
	static int migratoryBirds(List<Integer> arr) {
		Map<Integer, Integer> container = new HashMap<>();
		arr.stream().forEach(i -> {
			if(container.containsKey(i))
				container.put(i, container.get(i).intValue() + 1);
			else
				container.put(i, 1);
		});
		int maxCount = container.entrySet().stream().mapToInt(c -> c.getValue()).max().getAsInt();
		List<Integer> keyList = container.entrySet().stream().filter(c -> c.getValue() == maxCount)
				.mapToInt(c -> c.getKey()).boxed().collect(Collectors.toList());
		return !(keyList.size() > 1) ? keyList.get(0) : 
			keyList.stream().mapToInt(i -> i).min().getAsInt();
    }
	
	static int migratoryBirds2(List<Integer> arr) {
		int[] birds = new int[5];
		arr.forEach(i -> birds[i-1]++);
		int maxCount = birds[0];
		int mostBird = 0;
		for(int i = 1; i< birds.length; i++)
			if(birds[i] > maxCount) {
				maxCount = birds[i];
				mostBird = i;
			}
		return mostBird+1;
    }
	
//	static int migratoryBirds3(List<Integer> arr) {
//		Map<Integer, Set<Integer>> collect = arr.stream().collect(Collectors.groupingBy(Integer::valueOf, Collectors.toSet()));
//		return 0;
//	}
}
