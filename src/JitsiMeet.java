import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JitsiMeet {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://meet.jit.si/");  //open jitsi website on the chrome browser
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[3]/div[1]/button")).click();  // clicking on start meeting button
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div[3]/div[1]/div/div/div[1]/input")).sendKeys("Yuvraj");  //your name in the meeting
		Thread.sleep(1000); // making the thread sleep for 1000 milli seconds so that you can give permissions
		driver.findElement(By.xpath("//div[@id='overlay']")).click();  //clicking on the overlay before clicking  on join button
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div[3]/div[1]/div/div/div[1]/div/div")).click(); //clicking on join button
		TimeUnit.SECONDS.sleep(30); // waiting for 30 seconds before closing the meet
		driver.close();
		
		//WebElement target = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div[3]/div[1]/div/div/div[1]/div/div"));
		//new Actions(driver).moveToElement(target).click().perform();
       }

}
