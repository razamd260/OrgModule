package Contact;

import org.testng.annotations.Test;

import generic.BaseClass;

public class Contact extends BaseClass{
     
	@Test(groups = "smoke")
	public void clickContect() {
		String smoke=System.getProperty("smoke");
		System.out.println(smoke);
		System.out.println(" Smoke Testing ====> Click On Contact module");
	}
	
	
	@Test(groups = "regression")
	public void CreateContect() {
		String regression=System.getProperty("regression");
		System.out.println(regression);
		System.out.println(" regression Testing ====> Create Contact module");
	}
}
