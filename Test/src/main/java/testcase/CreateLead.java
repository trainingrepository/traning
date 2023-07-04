package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateLead {

	@Test
	public void runCreateLead() {
		/*
		 * WebDriverManager.chromedriver().setup(); 
		 * ChromeDriver driver = new ChromeDriver();
		 */
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("url/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("test");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("user1");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("999");
		driver.findElement(By.name("submitButton")).click();
		throw new RuntimeException();
		//driver.close();
}
}






