package org.test.saturdaytasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart {
	public static void main(String[] args) throws InterruptedException { 
		//FlipKart >> Mens >> T-shirt >> 5th T-shirt
		
			System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\ProjSomeClass\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			//*******************************************************************************************
			WebElement popUp=driver.findElement(By.xpath("//button[text()='✕']"));
			popUp.click();	
			
			Thread.sleep(3000);
			WebElement men=driver.findElement(By.xpath("//span[text()='Men']"));
			Actions action = new Actions(driver);
			action.moveToElement(men).perform();
			Thread.sleep(1000);
			
			WebElement Tshirt=driver.findElement(By.xpath("//a[text()='T-Shirts']"));
			action.moveToElement(Tshirt).click().perform();
			Thread.sleep(3000);
			WebElement Elem=driver.findElement(By.xpath("//a[text()='Striped Men Hooded Neck Maroon T-Shirt']"));
			Elem.click();
	}

}
