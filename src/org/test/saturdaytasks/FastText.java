package org.test.saturdaytasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FastText {
	public static void main(String[] args) throws InterruptedException { 
	//Fast >> Get Speed Value in Console
		
	System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\ProjSomeClass\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://fast.com/");
	//***************************************************************************
	Thread.sleep(8000);
	WebElement speedVal = driver.findElement(By.id("speed-value"));
	String val=speedVal.getText();
	System.out.println(val);
	
	
	
	
	
	
	}
}
