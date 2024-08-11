package Listener;

import java.text.SimpleDateFormat;
import java.util.Date;  
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import generic.BaseClass;

public class Listener implements ITestListener,ISuiteListener{
	
	ExtentSparkReporter spark;
	ExtentReports report=new ExtentReports();
	ExtentTest test=null;
	
	public String d1;
	

	@Override
	public void onTestSuccess(ITestResult result) {
		test=report.createTest(result.getMethod().getMethodName());
		test.log(Status.PASS, "Test Is Pass  ===>  " + result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		    test=report.createTest(result.getMethod().getMethodName());
	        test.log(Status.FAIL, "Test is Failed  ===>  "+result.getMethod().getMethodName());
		    TakesScreenshot tc=(TakesScreenshot) BaseClass.driver;
			String file=tc.getScreenshotAs(OutputType.BASE64);
			test.addScreenCaptureFromBase64String(file);
		 
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test=report.createTest(result.getMethod().getMethodName());
		test.log(Status.SKIP, "Test Is Skip");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush(); 
	}

	

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		 Date d=new Date();
	     SimpleDateFormat format=new SimpleDateFormat("EEEE dd-MMMM-yyyy HH:mm:ss z ");
		 d1=format.format(d).replace(":", " ");
		 spark=new ExtentSparkReporter("./Reporter/"+d1  + "Reporter.html");
		 spark.config().setDocumentTitle("Check");
		 spark.config().setReportName("Fail_And_Pass");
		 spark.config().setTheme(Theme.DARK);
		 report.attachReporter(spark);
		 report.setSystemInfo("Platform", "WIndow");
		 
		 
			
		
	}

	
	

	

}
