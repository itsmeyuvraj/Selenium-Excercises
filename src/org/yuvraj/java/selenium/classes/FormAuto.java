package org.yuvraj.java.selenium.classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormAuto {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver b= new ChromeDriver();
		
		b.get("https://demoqa.com/automation-practice-form");
		
		// Enter first and last names 
		
		b.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Yuvraj");
		b.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Sharma");
		
		// enter email 
		
		b.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("example@example.com");
		
		// select gender 
		TimeUnit.SECONDS.sleep(5);
		b.findElement(By.xpath("//label[@for='gender-radio-1']")).click();  //clicking on the overlay
		//b.findElement(By.xpath("//input[@id='gender-radio-1']")).click();
		//b.findElement(By.id("gender-radio-1")).click();
		
		// enter mobile number
		
		b.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9002486185");
		
		//enter DOB
		
		//b.findElement(By.id("dateOfBirthInput")).clear(); // clearing default value 
		//b.findElement(By.id("dateOfBirthInput")).sendKeys("04 Dec 2022");   // fucked up 
		
		// enter subjects
		
		b.findElement(By.id("subjectsInput")).sendKeys("Maths,Science,Geography");
		
		// select all hobbies 
		
		b.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
		b.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
		b.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();

        
		// file upload 
		
		WebElement addFile = b.findElement(By.xpath("//input[@id='uploadPicture']"));
		addFile.sendKeys("C:\\Users\\yuvar\\OneDrive\\Desktop\\image.jpg");  // send file location to the addFile object
		
		// enter address
		
		b.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Earth");

        
		// select state and city
		
		/*
		 * WebElement c=b.findElement(By.xpath("//input[@id='react-select-3-input']"));
		 * // not working //todo Select s = new Select(c); s.selectByIndex(2);
		 */
		
		// click on submit button
		
		b.findElement(By.xpath("//button[@id='submit']")).click();  //fucking ad
	}

}
