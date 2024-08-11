package generic;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass {
	
	public static WebDriver driver;
	@BeforeSuite(groups = {"smokeTest", "regressionTest"})
	public void configBS() throws Throwable {
		System.out.println("===Connect to DB , Report Config===");
		
	}
	
	
   //  @Parameters ("BROWSER")
    @BeforeClass(groups = {"smokeTest", "regressionTest"})
    public void configBC() throws Throwable {
    	driver=new ChromeDriver();
    System.out.println("==Launch the BROWSER==");
	
    }
    
    @BeforeMethod(groups = {"smokeTest", "regressionTest"})
	public void configBM() throws Throwable {
		System.out.println("=login=");

	}
    
    
	@AfterMethod(groups = {"smokeTest", "regressionTest"})
	public void configAM() {
		System.out.println("=logout=");
	
	}
	
    
    @AfterClass(groups = {"smokeTest", "regressionTest"})
    public void configAC() {
    	System.out.println("==Close the BROWSER==");
   
    }
    
   @AfterSuite(groups = {"smokeTest", "regressionTest"})
	public void configAS() throws SQLException {
		System.out.println("===close Db , Report backUP====");
		
	}

}
