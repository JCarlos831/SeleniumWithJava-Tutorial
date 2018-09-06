import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Users/JuanCMontoya/Desktop/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		// Go to Google
		driver.get("https://www.google.com");
		
		// Enter CareerDevs in search box
		driver.findElement(By.name("q")).sendKeys("CareerDevs" + Keys.ENTER);
		
		// Quit the browser
		driver.quit();

	}

}
