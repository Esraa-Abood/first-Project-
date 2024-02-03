import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class newClass {

	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void setUp() {

		driver.manage().window().maximize();
	}

	@Test
	public void myTest() {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.name("user-name")).sendKeys("standard_user");

		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();

	}

	@AfterTest
	public void postTest() {

	}
}