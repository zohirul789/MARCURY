import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class FirsttestNGexample {
	WebDriver driver = new FirefoxDriver();
  @BeforeClass
  public void beforeClass() {
	  driver.get("https://www.google.com/");
	  System.out.println("Before class executed");
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
	  System.out.println("google page close");
  }


  @Test
  public void GOOGLEMETHOD() {
   System.out.println("google page open");
  }
}
