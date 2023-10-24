package com.sdet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWaitPrg {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vipulgusain/downloads/chromedriver");
		
		WebDriver obj = new ChromeDriver();
		obj.manage().window().maximize();
		
		
		obj.get("https://demoqa.com/select-menu");
		
		obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		
		Thread.sleep(3000);
		
		WebElement dd= obj.findElement(By.id("oldSelectMenu"));
		
		Select s1= new Select(dd);
		
		s1.selectByIndex(6);
		Thread.sleep(3000);

		s1.selectByVisibleText("Magenta");	
		Thread.sleep(3000);
		
		s1.selectByValue("8");
		
	}

}
