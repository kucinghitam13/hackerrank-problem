package algorithms.implementation;


public class DrawingBook {
	static int pageCount(int n, int p) {
		int mid = n / 2;
		return p <= mid ? p / 2 : (n % 2 == 0 ? (n-p)/2+(p%2) : (n-p)/2);
    }

	static int pageCount2(int n, int p) {
		int mid = n / 2 + 1;
		return p < mid ? p / 2 : (n-p)/2;
	}
}
