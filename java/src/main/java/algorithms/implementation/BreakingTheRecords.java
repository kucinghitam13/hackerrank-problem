package algorithms.implementation;

public class BreakingTheRecords {

	static int[] breakingRecords(int[] scores) {
		int min = scores[0], max = scores[0], minCount = 0, maxCount = 0;
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] < min) {
				min = scores[i];
				minCount++;
			} else if (scores[i] > max) {
				max = scores[i];
				maxCount++;
			}
		}
		return new int[] { maxCount, minCount };
	}
}
