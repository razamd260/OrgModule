package Org;
import org.testng.annotations.Test;

import generic.BaseClass;

public class OrgCreate extends BaseClass{
	
	
	@Test(groups = "smoke")
	public void clickOrg() {
		
		String Browser=System.getProperty("Browser");
		System.out.println("browser Passing from  cmd   :  ===>  "+Browser);
		String regression_Suit=System.getProperty("regression");
		System.out.println("regression Passing from  cmd   :  ===>  "+regression_Suit);
		String evn=System.getProperty("evn");
		System.out.println("evn Passing from  cmd   :  ===>  "+evn);
		System.out.println("Smoke Testing ===>> Click Org");
	}
	
	
	@Test(groups = "regression")
	public void createOrg() {
		String Browser=System.getProperty("Browser");
		System.out.println("browser Passing from  cmd   :  ===>  "+Browser);
		String regression_Suit=System.getProperty("regression");
		System.out.println("regression Passing from  cmd   :  ===>  "+regression_Suit);
		String evn=System.getProperty("evn");
		System.out.println("evn Passing from  cmd   :  ===>  "+evn);
		
		System.out.println("Resgression Testing ===>> createOrg");
	}

}
