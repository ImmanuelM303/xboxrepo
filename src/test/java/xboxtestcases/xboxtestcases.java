package xboxtestcases;



import org.testng.Assert;
import org.testng.annotations.Test;

import xboxbasepages.XboxLeaderboardPage;

import util.TestCaseBase;


public class xboxtestcases extends TestCaseBase {
	@Test
	public void testGamertag() throws Exception
	{
		XboxLeaderboardPage XboxTopFive = new XboxLeaderboardPage();
		XboxTopFive.open();
		Assert.assertTrue(XboxTopFive.getGamertags());
	}
}

