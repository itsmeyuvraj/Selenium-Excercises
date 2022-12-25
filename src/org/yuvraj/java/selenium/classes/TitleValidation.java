package org.yuvraj.java.selenium.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver b = new ChromeDriver();
		
        String expected="ToolsQA ";
		b.get("https://demoqa.com/select-menu");
		
		
		String actual = b.getTitle();
		
		if(actual.contentEquals(expected))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
			System.out.println("Actual title is " + actual);
		}
		

	}

}
