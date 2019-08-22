package algorithms.implementation;


public class DesignerPDFViewer {
	
	static int designerPdfViewer(int[] h, String word) {
		final char A = 'a';
		int max = 0;
		for(int i = 0; i < word.length(); i++)
			if(h[word.charAt(i) - A] > max)
				max = h[word.charAt(i) - A];
		return max*word.length();
    }

}
