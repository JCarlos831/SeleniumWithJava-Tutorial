import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Users/JuanCMontoya/Desktop/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		// Navigate to Facebook
		driver.get("https://www.facebook.com");
		
		// Identify "id" of the email field and enter email address
		driver.findElement(By.id("email")).sendKeys("email@youremailaddress.com");
		
		// Identify "name" of the password field and enter text
		driver.findElement(By.name("pass")).sendKeys("password");
		
		// Identify "linkText" of the forgot password link and click
		driver.findElement(By.linkText("Forgot account?")).click();
		
		// Navigate to Salesforce Login Page
		driver.get("https://login.salesforce.com");
		
		// Identify id for username
		driver.findElement(By.id("username")).sendKeys("hello");
		
		// Identify password field
		driver.findElement(By.name("pw")).sendKeys("123456");
		
		// Click log in button
//		driver.findElement(By.className("button r4 wide primary")).click(); // Error due to compound class name
		
		// Click login button via xpath
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		
		// Quit the browser
		driver.quit();
		
	}

}
