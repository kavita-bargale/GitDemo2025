package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	@Parameters({"URL","username"})
	@Test(groups= {"Smoke"})
	public void WebLoginCarLoan(String url, String uname)
	{
		System.out.println("WebLoginCarLoan");
		System.out.println(url);
		System.out.println(uname);
	}
	
	@Test
	public void MobileLoginCarLoan()
	{
		System.out.println("MobileLoginCarLoan");
	}
	
	@Test
	public void APILoginCarLoan()
	{
		System.out.println("APILoginCarLoan");
	}
	
	@AfterSuite
	public void AfterSuite() 
	{
		System.out.println("I am the number 1 to execute last");
	}
	
	@BeforeClass
	public void BeforeClassExc()
	{
		System.out.println("I will execute before executing any methods in the class");
	}
	
	@AfterClass
	public void AfterClassExc()
	{
		System.out.println("I will execute after executing all methods in the class");
	}
}
