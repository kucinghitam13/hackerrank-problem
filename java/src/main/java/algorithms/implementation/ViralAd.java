package algorithms.implementation;


public class ViralAd {

//	O(n)
	static int viralAdvertising(int n) {
		int likes = 0;
		for(int i = 0, shares = 5; i < n; i++, shares = shares/2*3)
			likes += shares/2;
		return likes;
    }
	
//	O(1)
	static int viralAdvertising2(int n) {
		// TO DO
		throw new UnsupportedOperationException("Not implemented yet");
	}
}
