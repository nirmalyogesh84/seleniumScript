package Testsuiteng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrised extends Ilistner2 { 
	@Test
    @Parameters({"a","b"})
	public int stacko(int c,int s)
	{
		int d=c+s;
		System.out.println("value of d"+d);
		return d;
	}
	@AfterSuite
	public void demo()
	{
		System.out.println("iam demo");
	}
	@Test
	public void kemo()
	{
		System.out.println("iam kemo");
	}
	@ BeforeSuite
	public void nemo()
	{
		System.out.println("iam nemo");
	}

}
