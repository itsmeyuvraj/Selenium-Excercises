package org.yuvraj.java.selenium.classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver b = new ChromeDriver();
		
		b.get("https://demoqa.com/select-menu");
		
		
		WebElement c=b.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		
		Select s = new Select(c);
		s.selectByIndex(2);
		TimeUnit.SECONDS.sleep(10);
		s.selectByValue("6");
		TimeUnit.SECONDS.sleep(10);
		s.selectByVisibleText("Black");
		TimeUnit.SECONDS.sleep(10);
		b.close();
		

	}

}
