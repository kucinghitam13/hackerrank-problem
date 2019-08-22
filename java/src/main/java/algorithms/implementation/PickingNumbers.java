package algorithms.implementation;


import java.util.*;

public class PickingNumbers {

	public static int pickingNumbers(List<Integer> a) {
		Collections.sort(a);
		int count = 1;
		int maxCount = 0;
		boolean flag = true;
		for (int i = 0; i < a.size() - 1; i++) {
			switch (a.get(i) - a.get(i + 1)) {
			case 0:
				count++;
				break;
			case 1:
				if (flag) {
					count++;
					flag = false;
					break;
				}
			default:
				count = 1;
				flag = true;
				break;
			}
			if (count > maxCount)
				maxCount = count;
		}
		return maxCount;
	}

	public static int pickingNumbers2(List<Integer> a) {
		Collections.sort(a);
		int len = 1;
		for (int i = 0; i < a.size(); i++)
			for (int j = i + 1; j < a.size(); j++) {
				if (a.get(j) - a.get(i) <= 1) {
					if(len < j - i + 1)
						len = j - i + 1;
				}else
					break;
			}
		return len;
	}
}
