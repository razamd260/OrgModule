package Org;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseClass;
@Listeners(Listener.Listener.class)
public class OrgCreate extends BaseClass{
	
	
	@Test(groups = "smokeTest")
	public void clickOrg() {
		
		String Browser=System.getProperty("Browser");
		System.out.println("browser Passing from  cmd   :  ===>  "+Browser);
		String regression_Suit=System.getProperty("regression");
		System.out.println("regression Passing from  cmd   :  ===>  "+regression_Suit);
		String evn=System.getProperty("env");
		System.out.println("evn Passing from  cmd   :  ===>  "+evn);
		System.out.println("Smoke Testing ===>> Click Org");
		//org.testng.Assert.assertTrue(false);
	
	}
	
	
	@Test(groups = "regressionTest")
	public void createOrg() {
		String Browser=System.getProperty("Browser");
		System.out.println("browser Passing from  cmd   :  ===>  "+Browser);
		String regression_Suit=System.getProperty("regression");
		System.out.println("regression Passing from  cmd   :  ===>  "+regression_Suit);
		String evn=System.getProperty("env");
		System.out.println("evn Passing from  cmd   :  ===>  "+evn);
		
		System.out.println("Resgression Testing ===>> createOrg");
		Assert.assertTrue(false);
	}

}
