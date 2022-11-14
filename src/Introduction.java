import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {

	public static void main(String[] args) {
		
	//invoking the browser (optional for older version of selenium)
	
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        
     // creating object of chromedriver to access all its methods
     // every browser driver has same methods when changing browser just need to modify the line below
        
		WebDriver driver = new ChromeDriver();
		
	//open the link on the browser
		
		driver.get("https://google.com");
		
	// get the title and print it to console
		
		System.out.println(driver.getTitle());
		
	// get current URL and print it 
		
		System.out.println(driver.getCurrentUrl());
		
    // Close the current window
		
		driver.close();
		
		
   // Close the  browser
		
	  //driver.quit();
					
			
		
	}

}
