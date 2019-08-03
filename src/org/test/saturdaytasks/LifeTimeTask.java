package org.test.saturdaytasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LifeTimeTask {
	//Go To Locations And Click ComingSonn
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\ProjSomeClass\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lifetime.life/coming-soon-clubs.html");
		//*******************************************************************************************
		WebElement locElemnt=driver.findElement(By.xpath("//a[text()='Locations']"));
		locElemnt.click();
		
		WebElement comSoonElmnt=driver.findElement(By.xpath("//a[@class='dropdown-item  active']"));
		comSoonElmnt.click();
		
		
		
	}
}
