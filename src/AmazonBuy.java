import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBuy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.in");
		TimeUnit.SECONDS.sleep(5);
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();  // clicking on cart link to open the login page
		
		TimeUnit.SECONDS.sleep(5);
		
		driver.findElement(By.name("email")).sendKeys("itsmeyuvraj@protonmail.com");  //filling username
		driver.findElement(By.id("continue")).click(); //clicking on continue button
		
		TimeUnit.SECONDS.sleep(2);
		
		driver.findElement(By.name("password")).sendKeys(""); // filling password
		driver.findElement(By.id("signInSubmit")).click(); //clicking on signin button
		driver.findElement(By.id("nav-cart-count")).click();  // an overlay thats needs to be clicked before proceeding
		driver.findElement(By.xpath("//*[@id=\"nav-cart-count-container\"]")).click(); // click on cart icon
		
		TimeUnit.SECONDS.sleep(5);
		
		//driver.findElement(By.id("nav-cart-count"));
		driver.findElement(By.name("proceedToRetailCheckout")).click(); //click on proceed button on cart page
		driver.findElement(By.xpath("//*[@id=\"orderSummaryPrimaryActionBtn\"]/span/input")).click();
		
		TimeUnit.SECONDS.sleep(18);
		
		driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div/div[5]/div/div[3]/div/div[2]/div/div/div[2]/div/form/div/div[1]/div/div[2]/div[2]/div/div[1]/div/div[1]/span/div/label/input")).click();  // select amazon pay later // use dynamic xpath // todo
		driver.findElement(By.xpath("//input[@class='a-button-input' and @aria-labelledby='orderSummaryPrimaryActionBtn-announce']")).click();
		
		TimeUnit.SECONDS.sleep(15);
		
		driver.findElement(By.xpath("//input[@name='placeYourOrder1' and @aria-labelledby='submitOrderButtonId-announce']")).click();
		
	}

}
