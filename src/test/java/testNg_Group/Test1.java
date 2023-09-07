package testNg_Group;

import org.testng.annotations.Test;
public class Test1 {

	@Test(groups="smoke")
	
	public void sample1()
	{
		System.out.println("Sample1");
	}
	
	@Test
	public void sample2()
	{
		System.out.println("Sample2");
	}
}
