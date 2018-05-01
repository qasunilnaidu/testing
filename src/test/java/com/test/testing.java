package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testing {

	@Test
	public void m1() {
		
		
		WebDriver d = new FirefoxDriver();
		d.get("http://testingmasters.com/hrm");
	d.manage().window().maximize();
	
	}
	
}
