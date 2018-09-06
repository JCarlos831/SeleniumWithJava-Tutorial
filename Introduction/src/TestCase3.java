import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Selenium Code:
		
		// Create Driver Object for Safari
		// invoke .exe file
//		System.setProperty("webdriver.safari.driver", "/Users/JuanCMontoya/Desktop/geckodriver");
		WebDriver driver = new SafariDriver();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);
		driver.quit();
	}

}
