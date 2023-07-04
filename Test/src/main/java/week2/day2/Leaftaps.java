package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leaftaps {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Create Lead")).click();

WebElement sourcedropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));

Select dropdown1= new Select(sourcedropdown);
dropdown1.selectByVisibleText("Conference");

WebElement industrydropdwon = driver.findElement(By.id("createLeadForm_industryEnumId"));
Select dropdown2=new Select(industrydropdwon);
dropdown2.selectByValue("IND_FINANCE");

WebElement ownershipdropdown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
Select dropdown3= new Select(ownershipdropdown);
dropdown3.selectByIndex(3);
	}

}
