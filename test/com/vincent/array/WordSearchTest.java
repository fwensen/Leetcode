package com.vincent.array;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * test class for WordSearch
 * @author vincent
 *
 */
public class WordSearchTest extends TestCase{

	WordSearch ws;
	public WordSearchTest(String method) {
		super(method);
	}
	
	public void setUp() {
		ws = new WordSearch();
	}
	
	public void testExist() {
		
		char [][] board1 = {
				{'A', 'B', 'C', 'D'},
				{'B', 'Y', 'U', 'O'},
				{'Q', 'V', 'E', 'L'}
		};
		
		char [][] board2 = {
				{'R'}
		};
		
		char [][] board3 = {
				{'A', 'B', 'C', 'D', 'I','P'},
				{'B', 'Y', 'U', 'O','E','W'},
				{'Q', 'V', 'E', 'L','B','N'},
				{'A', 'B', 'C', 'D','V','C'},
				{'B', 'Y', 'U', 'O','S','C'},
				{'Q', 'V', 'E', 'L','Z','A'},
				{'A', 'B', 'C', 'D','Q','L'},
				{'B', 'Y', 'U', 'O','X','V'},
				{'Q', 'V', 'E', 'L','Z','O'}
		};
		assertEquals(true, ws.exist(board1, "ABYV"));
		assertEquals(false, ws.exist(board1, "QVZ"));
		assertEquals(false, ws.exist(board2, "W"));
		assertEquals(true,ws.exist(board3, "VBCDOLDCB"));
		assertEquals(false, ws.exist(board3, "WNCCAPPP"));
	}
	
	public static TestSuite suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(
				new WordSearchTest("testExist"));
		return suite;
	}
	
}
