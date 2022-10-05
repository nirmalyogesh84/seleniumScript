package Testsuiteng;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Ilistner2 extends TestListenerAdapter
{
	
public void onTestStart(ITestResult tr)
{
System.out.println("TEST exicution is start start");	
}
public void onTestFailure(ITestResult tr)
{
	System.out.println(" TEST execution is failure");
}
public void onTestSuccess(ITestResult tr)
{
System.out.println("success");
}

public void onTestSkipped(ITestResult tr)
{
	System.out.println("Skipped");
}
}