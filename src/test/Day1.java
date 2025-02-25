package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	@Parameters({"URL"})
	@Test(groups= {"Smoke"})
	public void Demo(String url)
	{
		System.out.println("Hello");
		System.out.println("Hello1");
		System.out.println("Hello2");
		System.out.println("Hello3");
		System.out.println("Hell04");
		System.out.println("Hello5");
		System.out.println("Hello6");
		System.out.println(url);
	}
	
	@Test(enabled=false)
	public void SecondTest()
	{
		System.out.println("world");
	}
	
	@org.testng.annotations.BeforeTest
	public void BeforeTest()
	{
		System.out.println("I will execute before test");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("I will execute after test");
	}
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("I am the number 1 to execute");
	}
	
}
