import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindPHPlocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.phptravels.net/");
		driver.findElement(By.xpath(".//*[@id='citiesInput']")).sendKeys("Dhaka,Bangladesh");
		lunchbrowser();
	}

	private static void lunchbrowser() {
		// TODO Auto-generated method stub
		
	}

}


