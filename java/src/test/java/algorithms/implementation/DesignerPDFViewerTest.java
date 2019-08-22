package algorithms.implementation;

import static org.junit.Assert.*;

import org.junit.Test;

import util.Util;

public class DesignerPDFViewerTest {

	@Test
	public void test() {
		int[] h = Util.splitToIntArr("1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5");
		String word = "abc";
		int expected = 9;
		
		assertEquals(expected, DesignerPDFViewer.designerPdfViewer(h, word));
	}

	@Test
	public void test1() {
		int[] h = Util.splitToIntArr("1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 7");
		String word = "zaba";
		int expected = 28;
		
		assertEquals(expected, DesignerPDFViewer.designerPdfViewer(h, word));
	}

}
