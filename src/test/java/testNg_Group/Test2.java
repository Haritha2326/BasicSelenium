package testNg_Group;

import org.testng.annotations.Test;
public class Test2 {

	@Test(groups="smoke")
	
	public void sample3()
	{
		System.out.println("Sample3");
	}
	
	@Test
	public void sample4()
	{
		System.out.println("Sample4");
	}
}
