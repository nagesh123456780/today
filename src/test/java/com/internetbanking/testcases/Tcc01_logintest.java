package com.internetbanking.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.internetbanking.pageobject.loginpage;

public class Tcc01_logintest extends basesclass{

	@Test
	public void loginTest() throws IOException
	{
		//logger.info("URL is opened");
		
		loginpage lp=new loginpage(driver);
		lp.setUserName(username);
		//logger.info("Login test passed");
		lp.setPassword(password);
		//logger.info("Login test passed");
		lp.clickSubmit();
   // String y=  	driver.getTitle();
   // System.out.print(""+y);
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			//logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			 Assert.assertTrue(false);
			
			//Assert.assertTrue(false);
		 // logger.info("Login test failed"); 
		}
		
		
		
	}
	
	
	
	
	
	
}
