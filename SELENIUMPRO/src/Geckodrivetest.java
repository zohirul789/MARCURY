import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Geckodrivetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.gecko.driver","D://SELENIUM_PRO/geckodriver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		 
 
	}

}
