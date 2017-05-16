import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Registrationnewtours {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(500);
		
		driver.findElement(By.name("firstName")).sendKeys("Jamal");				
		driver.findElement(By.name("lastName")).sendKeys("khan");
		driver.findElement(By.name("phone")).sendKeys("7189155916");
		driver.findElement(By.name("userName")).sendKeys("zufa013@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("97-20 78th st");
		driver.findElement(By.name("address2")).sendKeys("2ND FL");
		driver.findElement(By.name("city")).sendKeys("ozone park");
		driver.findElement(By.name("state")).sendKeys("NY");
		driver.findElement(By.name("postalCode")).sendKeys("11416");
		driver.findElement(By.name("country")).sendKeys("UNITED STATES");
		driver.findElement(By.name("email")).sendKeys("zufa013@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.name("confirmPassword")).sendKeys("12345678");
		driver.findElement(By.name("register")).click();
		Thread.sleep(500);
		driver.quit();
		

	}

}
