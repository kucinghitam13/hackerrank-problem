package algorithms.implementation;


public class UtopianTree {
	
	static int utopianTree(int n) {
		int result = 1;
		for(int i = 1; i <= n; i += 2) 
			result += result + (i+1 <= n ? 1 : 0);
		return result;
    }

	static int utopianTree2(int n) {
		int result = 1;
		for(int i = 1; i <= n; i++)
			result += i % 2 != 0 ? result : 1;
		return result;
	}
	
//	BEST O(1)
	static int utopianTree3(int n) {
		return (int) Math.pow(2, (n+3)>>1) - 1 - n %2;
	}
}
