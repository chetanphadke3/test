package com.technocredits.orangehrm.base;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PredefinedMethods {
	WebDriver driver;
	
	
	public PredefinedMethods() {
		// TODO Auto-generated constructor stub
		
		driver=new ChromeDriver();
	}
	
	
	public void setText(String locator, String value) {
		driver.findElement(By.xpath(locator)).sendKeys(value);
		
	}
}
