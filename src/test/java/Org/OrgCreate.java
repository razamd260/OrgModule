package Org;
import org.testng.annotations.Test;

import generic.BaseClass;

public class OrgCreate extends BaseClass{
	
	
	@Test(groups = "smoke")
	public void clickOrg() {
		
		String smoke=System.getProperty("smoke");
		System.out.println(smoke);
		System.out.println("Smoke Testing ===>> Click Org");
	}
	
	
	@Test(groups = "regression")
	public void createOrg() {
		String regression=System.getProperty("regression");
		System.out.println(regression);
		
		System.out.println("Resgression Testing ===>> createOrg");
	}

}
