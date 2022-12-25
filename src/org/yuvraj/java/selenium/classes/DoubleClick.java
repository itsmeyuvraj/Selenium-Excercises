package org.yuvraj.java.selenium.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		WebDriver b= new ChromeDriver();
		
		b.get("https://demoqa.com/buttons");
		WebElement button = b.findElement(By.xpath("//button[@id=\"doubleClickBtn\"]"));
		WebElement button2 = b.findElement(By.xpath("//button[@id=\"rightClickBtn\"]"));

		
		Actions as = new Actions(b);
		as.doubleClick(button).perform();
		as.contextClick(button2).perform();
		
	}

}
