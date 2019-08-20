package algorithms.warmup;


public class Staircase {
	
	static /*void*/ String staircase(int n) {
		StringBuilder builder = new StringBuilder(n*n);
		for(int i = 0; i < n; i++) {
			StringBuilder temp = new StringBuilder(n);
			for(int j = 0; j < n; j++)
				temp.append(j < n-(i+1) ? ' ' : '#');
			builder.append(temp + "\n");
		}
//		System.out.println(builder.toString());
		return builder.toString();
	}
}
