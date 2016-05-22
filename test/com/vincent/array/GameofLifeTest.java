package com.vincent.array;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class GameofLifeTest extends TestCase{

	GameofLife gf;
	public GameofLifeTest(String method) {
		super(method);
	}
	
	
	public void setUp(){
		gf = new GameofLife();
	}
	
	public void testGameofLife() {

		int [][] game = {
				{1,1,0,0,0,1},
				{0,1,1,1,1,1},
				{1,1,1,0,1,0},
				{1,0,0,0,1,0},
				{0,1,1,1,0,1}
		};
		
		int [][] ret = {
				{1, 1, 0, 1, 0, 1}, 
				{0, 0, 0, 0, 0, 1}, 
				{1, 0, 0, 0, 0, 0}, 
				{1, 0, 0, 0, 1, 1}, 
				{0, 1, 1, 1, 1, 0} 
		};
		
		gf.gameOfLife(game);
		for (int i = 0; i < game.length; i++)
			for (int j = 0; j < game[0].length; j++)
				assertEquals(game[i][j], ret[i][j]);
	}
	
	public static TestSuite suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(
				new GameofLifeTest("testGameofLife"));
		return suite;
	}
}
