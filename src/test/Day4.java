package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day4 {
	
	@Test(groups= {"Smoke"})
	public void pLoan()
	{
		System.out.println("Ploan");
	}
	
	@Test(dataProvider = "getData")
	public void MobileLogin(String uname, String pwd)
	{
		System.out.println("MOBILE LOGIN WITH  DIFFERENT USERS");
		System.out.println(uname);
		System.out.println(pwd);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "FirstUserName";
		data[0][1] = "FirstPassword";
		data[1][0] = "SecondUserName";
		data[1][1] = "SecondPassword";
		data[2][0] = "ThirdUserName";
		data[2][1] = "ThirdPassword";
		return data;
	}

}
