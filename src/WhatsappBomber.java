import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WhatsappBomber {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://web.whatsapp.com"); 
		TimeUnit.SECONDS.sleep(35);
		driver.findElement(By.xpath("//span[contains(@title,\"Meenank M\")]")).click();
		TimeUnit.SECONDS.sleep(5);
		
		for(int count = 0;count<100;count++)
		{
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]")).sendKeys("Bomb!");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/footer/div[1]/div/span[2]/div/div[2]/div[2]/button")).click();
        //TimeUnit.SECONDS.sleep(5);
        	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/footer/div[1]/div/span[2]/div/div[2]/div[2]/button")).click();
        	//TimeUnit.SECONDS.sleep(5);

        }
		
		driver.close();

}
}

