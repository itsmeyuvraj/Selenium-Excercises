package org.yuvraj.java.selenium.classes;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 WebDriver b = new ChromeDriver();
		 b.get("https://demoqa.com/select-menu");
		 TakesScreenshot shot = (TakesScreenshot) b;  // casting driver object  to TakeScreenshot object
		 File as = shot.getScreenshotAs(OutputType.FILE);  //taking a screenshot and saving it to a memory
		 File des= new File("C:\\Users\\yuvar\\OneDrive\\Desktop\\image.jpg"); // creating an empty file 
		 Files.copy(as, des); //copying the screenshot to that empty file 
			

	}

}
