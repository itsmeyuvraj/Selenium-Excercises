import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.TimeUnit;




public class InstagramDownloader {

	public static void main(String[] args) throws InterruptedException, IOException  {
		// TODO Auto-generated method stub
            
		WebDriver driver = new ChromeDriver();
		String url = " ";
		Path fileName = Path.of("url.txt");

		 
		driver.get("https://instagram.com");
		TimeUnit.SECONDS.sleep(5);
		
		// Login into instagram
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("memeticpolyalloy");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("8KAs6ZcNivGsxJ");
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas']")).click();
		
		
		// handling notifications and any other popup messages 
		
		TimeUnit.SECONDS.sleep(5);
		
		driver.findElement(By.xpath("//button[@class='_acan _acao _acas']")).click(); // dont save info
		
		TimeUnit.SECONDS.sleep(5); 
		
		driver.findElement(By.xpath("//button[@class='_a9-- _a9_1']")).click(); // dont turn on notification
		
		
		// Opening profile page
		
		driver.findElement(By.xpath("//a[@class='x1i10hfl xjbqb8w x6umtig x1b1mbwd xaqea5y xav7gou x9f619 x1ypdohk xt0psk2 xe8uvvx xdj266r x11i5rnm xat24cr x1mh8g0r xexx8yu x4uap5 x18d9i69 xkhd6sd x16tdsg8 x1hl2dhg xggy1nq x1a2a7pz _aak1 _a6hd']")).click();
		
		
		// scrolling the page to load all the images 
		TimeUnit.SECONDS.sleep(6); 
		JavascriptExecutor js = (JavascriptExecutor)driver;  // type casting driver object 
		
		long lastHeight = (long) js.executeScript("return document.body.scrollHeight");

	    while (true) {
		     js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		     Thread.sleep(2000);

		     long newHeight = (long) js.executeScript("return document.body.scrollHeight");
		     if (newHeight == lastHeight) {
		          break;
		        }
		     
		      lastHeight = newHeight;
		    }
		
		//get all the image links from the page and write it to a text file
		
		TimeUnit.SECONDS.sleep(5);  // use explicit/implicit  wait  function  //todo 
		
		List<WebElement> j=driver.findElements(By.xpath("//img[contains(@src,'http')]"));  // store location of all the img tags
		
		 
		 for(WebElement n:j)  //css selector //todo
		    {
			url = url + "\r\n" +  n.getDomAttribute("src").substring(0,105);  //extract image link from the list and store it to string object
			 
			 }
		 Files.writeString(fileName, url);// fileinput string // todo  replace

		 System.out.print("URLs written to file successfully.");
		 
		 
		 
		 
		// download all the files using wget command 
         Process p = Runtime.getRuntime().exec("wget -i url.txt");   // might  only work on Linux distribution  //todo test
        
		
	}

}

        