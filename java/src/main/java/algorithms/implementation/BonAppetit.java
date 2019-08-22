package algorithms.implementation;


import java.util.List;

public class BonAppetit {
	
	private static final String BON_APPETIT = "Bon Appetit";
	static void bonAppetit(List<Integer> bill, int k, int b) {
		Integer allergy = bill.get(k);
		
		int anna = bill.stream().filter(i -> i != allergy).mapToInt(i -> i).sum() / 2;
		System.out.println(anna == b ? BON_APPETIT : b - anna);
    }

	static /*void*/String bonAppetit2(List<Integer> bill, int k, int b) {
		int anna = 0;
		for(int i = 0; i< bill.size(); i++)
			if(i != k)
				anna += bill.get(i);
		anna /= 2;
		
//		System.out.println(anna == b ? BON_APPETIT : b - anna);
		return anna == b ? BON_APPETIT : String.valueOf(b - anna);
	}
}
