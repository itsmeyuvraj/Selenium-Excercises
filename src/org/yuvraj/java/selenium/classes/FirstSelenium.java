package org.yuvraj.java.selenium.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize(); //maximize the window
		driver.navigate().to("https://facebook.com");   //redirect to another site
		driver.navigate().back(); // navigate to previous page
		driver.navigate().forward(); //navigate to next page
		driver.navigate().refresh();  //refresh the current page
		//Thread.sleep(3000);
		//driver.close();

	}

}
