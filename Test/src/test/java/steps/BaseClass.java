package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass extends AbstractTestNGCucumberTests{

	public static ChromeDriver driver1;
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void preCondition(String url, String username,String password) {
		WebDriverManager.chromedriver().setup();
		driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver1.get("url");
		driver1.findElement(By.id("username")).sendKeys("username");
		driver1.findElement(By.id("password")).sendKeys("password");
		driver1.findElement(By.className("decorativeSubmit")).click();
		driver1.findElement(By.linkText("CRM/SFA")).click();
		driver1.findElement(By.linkText("Leads")).click();
	}
	
	@AfterMethod
	public void postCondition() {
	
		driver1.close();
	}
}
