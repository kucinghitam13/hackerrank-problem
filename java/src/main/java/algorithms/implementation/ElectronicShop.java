package algorithms.implementation;


public class ElectronicShop {
	
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		int max = -1;
		for(int k = 0; k< keyboards.length; k++)
			for(int d = 0; d < drives.length; d++)
				if(keyboards[k] + drives[d] <= b && keyboards[k] + drives[d] > max)
					max = keyboards[k] + drives[d];
		return max;
    }

	static int getMoneySpent2(int[] keyboards, int[] drives, int b) {
		int max = -1;
		for(int k = 0; k< keyboards.length; k++)
			for(int d = 0; d < drives.length; d++)
				if(keyboards[k] + drives[d] <= b )
					if(keyboards[k] + drives[d] > max)
						max = keyboards[k] + drives[d];
		return max;
	}
}
