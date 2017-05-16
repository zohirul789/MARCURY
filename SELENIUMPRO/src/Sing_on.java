import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sing_on {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText( "SIGN-ON")).click();
		Thread.sleep(1500);

		driver.findElement(By.name("userName")).sendKeys("zulfa013@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345678");
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(1500);
		

		
	}

}
