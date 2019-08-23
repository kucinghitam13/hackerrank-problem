package algorithms.implementation;

public class SaveThePrisoner {
	
	static int saveThePrisoner(int n, int m, int s) {
		int result  = (m % n + (s-1)) % n;
		return result == 0 ? n : result;
    }
	
	static int saveThePrisoner2(int n, int m, int s) {
		return ((s-1) + m - 1) % n + 1;
	}
}
