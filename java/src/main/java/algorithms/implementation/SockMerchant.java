package algorithms.implementation;


import java.util.HashMap;
import java.util.Map;

public class SockMerchant {
	
	static int sockMerchant(int n, int[] ar) {
		Map<Integer, Integer> socks = new HashMap<>();
		int count = 0;
		for(int i = 0; i< n; i++) {
			if(socks.containsKey(ar[i]))
				socks.put(ar[i], socks.get(ar[i]) + 1);
			else
				socks.put(ar[i], 1);
			if(socks.get(ar[i]) > 1) {
				count++;
				socks.put(ar[i], 0);
			}
		}
		return count;
    }
}
