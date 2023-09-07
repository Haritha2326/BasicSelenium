package testNg_Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_General {

	@BeforeSuite
	
	public void bsuite()
	{
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	
	public void asuite()
	{
		System.out.println("After Suite");
	}
	
	@BeforeTest
	
	public void btest()
	{
		System.out.println("Before Test");
	}
	
	@AfterTest
	
	public void atest()
	{
		System.out.println("After Test");
	}
	
	@BeforeClass
	
	public void bclass()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	
	public void aclass()
	{
		System.out.println("After Class");
	}
	
	@BeforeMethod
	
	public void bmethod()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	
	public void amethod()
	{
		System.out.println("After Method");
	}
	
	@Test
	
	public void test()
	{
		System.out.println("Hi");
	}
	
	@Test
	
	public void test1()
	{
		System.out.println("Hello");
	}
}
