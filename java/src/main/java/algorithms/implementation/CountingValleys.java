package algorithms.implementation;


public class CountingValleys {
	
	static int countingValleys(int n, String s) {
		int altitude = 0;
		int countValley = 0;
		for(char c : s.toCharArray()) {
			switch(c) {
			case 'U':
				if(++altitude == 0) countValley++;
				break;
			case 'D':
				altitude--;
				break;
			}
		}
		return countValley;
    }
}
