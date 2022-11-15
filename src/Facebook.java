import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	
		
		WebDriver driver = new ChromeDriver();  //invoke chrome browser
		driver.get("https://facebook.com/"); //open facebook page
		driver.findElement(By.name("email")).sendKeys("example@gmail.com"); //locate username field and insert the username
		driver.findElement(By.name("pass")).sendKeys("example"); //locate password field and insert the password
		driver.findElement(By.name("login")).click(); // locate and click login button
		//driver.findElement(By.xpath("//button[@type=\"submit\"] | //button[@value=\"OK\"]")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[3]/div/div[2]/div/div/div/div[1]/div/div[1]/span")).sendKeys("Hi");
		
		
	
		//driver.close();

		}

}
