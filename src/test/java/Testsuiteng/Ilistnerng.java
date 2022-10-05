package Testsuiteng;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Testsuiteng.Ilistner2.class)
public class Ilistnerng extends Ilistner2 {
    @Test
	public void lenovo()
	{   int a=10;
	    int b=0;
	    int c=a/b;
	    
		System.out.println("ok done "+c);
	}
    @Test
    public void lenovo1()
	{  
    boolean DataAvailable=false;
    System.out.println("Test Case3 - Conditional Skip");
    if(!DataAvailable)
    throw new SkipException("Skipping this exception");
    System.out.println("Executed Successfully");
	
	}
	
	
	
	
	
	

}
