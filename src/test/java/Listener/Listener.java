package Listener;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listener implements ITestListener{

	ExtentSparkReporter spark;
	ExtentReports report=new ExtentReports();
	ExtentTest test=null;
	
	@Override
	public void onTestStart(ITestResult result) 
	{
	 
     spark=new ExtentSparkReporter("./Reporter.html");
	 spark.config().setDocumentTitle("Check");
	 spark.config().setReportName("Fail_And_Pass");
	 spark.config().setTheme(Theme.DARK);
	 report.attachReporter(spark);
	 report.setSystemInfo("Platform", "WIndow");
	 
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ExtentTest test=report.createTest(result.getMethod().getMethodName());
		test.log(Status.PASS, "Test Is Pass");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ExtentTest test=report.createTest(result.getMethod().getMethodName());
		test.log(Status.SKIP, "Test Is Skip");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
	report.flush(); 
		
	}

	

	

}
