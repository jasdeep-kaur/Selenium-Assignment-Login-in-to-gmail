package com.openqa.selenium;

public class FirefoxDriver implements WebDriver{

	public FirefoxDriver()
	{
		System.out.println("Launching FIrefox");
	}
	@Override
	public void click (String locator) {
	System.out.println("Clicked on an element="+locator);
		
	}

	@Override
	public void sendKeys(String locator, String value) {
		System.out.println("type in an element="+locator+"get a value="+value);
		
	}

	
}
