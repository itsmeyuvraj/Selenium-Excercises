import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JitsiMeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://meet.jit.si/");
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[3]/div[1]/button")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div[3]/div[1]/div/div/div[1]/input")).sendKeys("Yuvraj");
		
		WebElement target = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div[3]/div[1]/div/div/div[1]/div/div"));
		new Actions(driver).moveToElement(target).click().perform();
       }

}
