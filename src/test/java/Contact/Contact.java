package Contact;

import org.testng.annotations.Test;

import generic.BaseClass;

public class Contact extends BaseClass{
     
	@Test(groups = "smoke")
	public void clickContect() {
		String Browser=System.getProperty("Browser");
		System.out.println("browser Passing from  cmd   :  ===>  "+Browser);
		String regression_Suit=System.getProperty("regression");
		System.out.println("regression Passing from  cmd   :  ===>  "+regression_Suit);
		String evn=System.getProperty("evn");
		System.out.println("evn Passing from  cmd   :  ===>  "+evn);
		System.out.println(" Smoke Testing ====> Click On Contact module");
		
		System.out.println(" ==========  8 : 23 ==============");
	}
	
	
	@Test(groups = "regression")
	public void CreateContect() {
		String Browser=System.getProperty("Browser");
		System.out.println("browser Passing from  cmd   :  ===>  "+Browser);
		String regression_Suit=System.getProperty("regression");
		System.out.println("regression Passing from  cmd   :  ===>  "+regression_Suit);
		String evn=System.getProperty("evn");
		System.out.println("evn Passing from  cmd   :  ===>  "+evn);
		System.out.println(" regression Testing ====> Create Contact module");
	}
}
