package variousConcepts;

import java.io.InterruptedIOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGtest {
	String username = "demo@techfios.com";
	String password = "abc123";
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("http://www.techfios.com/billing/?ng=admin/");
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.name("login")).click();
	}
	
	@Test
	public void click() {
		System.out.println("Hello there TestNG");
	}
	
	public void tearDown() throws InterruptedException{
		Thread.sleep(5000);
		
	}

}
