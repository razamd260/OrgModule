package Help;

import org.testng.annotations.Test;

public class Snippet {
	@Test(groups = "smokeTest")
		public void clickHelp() {
			
			String Browser=System.getProperty("Browser");
			System.out.println("browser Passing from  cmd   :  ===>  "+Browser);
			String regression_Suit=System.getProperty("regression");
			System.out.println("regression Passing from  cmd   :  ===>  "+regression_Suit);
			String evn=System.getProperty("env");
			System.out.println("evn Passing from  cmd   :  ===>  "+evn);
			System.out.println("Smoke Testing ===>> Click Org");
			System.out.println(" Noushad ansari Smolke Testing Done");
			System.out.println(" Noushad ansari Help Smoke Testing Done");
			System.out.println(" Noushad ansari Help Smoke Testing Done");
			System.out.println(" Noushad ansari Help Smoke Testing Done");
			
		}
		
		
		@Test(groups = "regressionTest")
		public void createHelp() {
			String Browser=System.getProperty("Browser");
			System.out.println("browser Passing from  cmd   :  ===>  "+Browser);
			String regression_Suit=System.getProperty("regression");
			System.out.println("regression Passing from  cmd   :  ===>  "+regression_Suit);
			String evn=System.getProperty("env");
			System.out.println("evn Passing from  cmd   :  ===>  "+evn);
			
			System.out.println("Resgression Testing ===>> createOrg");
			System.out.println("Noushad Ansari resgression Testing");
			System.out.println("Monday Noushad Ansari resgression Testing");
	
}
		
}

