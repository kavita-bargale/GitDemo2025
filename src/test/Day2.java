package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day2 {

	@Test(groups= {"Smoke"})
	public void WebLoginHomeLoan()
	{
		System.out.println("WebLoginHomeLoan");
	}
	
	@Test(timeOut=4000)
	public void MobileLoginHomeLoan()
	{
		System.out.println("MobileLoginHomeLoan");
	}
	
	@Test
	public void FalseTest()
	{
		System.out.println("I am in FalseTest");
		Assert.assertTrue(false);
	}
	
	@Test
	public void MobileLoginHomeLoan1()
	{
		System.out.println("MobileLoginHomeLoan1");
	}
	
	@Test
	public void MobileLoginHomeLoan2()
	{
		System.out.println("MobileLoginHomeLoan2");
	}
	
	@Test(dependsOnMethods="WebLoginHomeLoan")
	public void APILoginHomeLoan()
	{
		System.out.println("APILoginHomeLoan");
	}
	
	@BeforeMethod
	public void BeforeMethods() 
	{
		System.out.println("Before every test case BeforeMethod will execute");
	}
	
	@AfterMethod
	public void AfetrMethods()
	{
		System.out.println("After every test case AfterMethod will execute");
	}
	
}
