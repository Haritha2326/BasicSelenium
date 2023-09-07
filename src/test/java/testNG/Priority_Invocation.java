package testNG;

import org.testng.annotations.Test;

public class Priority_Invocation {

	//1.main method
	
	@Test(enabled=false)
	
	public void demo1()
	{
		System.out.println("Hi Hari");
	}
	
	//2. main method
	
	@Test(priority=3, invocationCount=5)
	
	public void demo2()
	{
		System.out.println("Hi Haritha");
	}
	
	//3. main method
	@Test(priority=1, invocationCount=1)
	
	public void demo3()
	{
		System.out.println("Hi Haritha V");
	}
	
	
	
}
