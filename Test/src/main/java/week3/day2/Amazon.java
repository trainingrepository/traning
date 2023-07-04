package week3.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones",Keys.ENTER);
	List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	
	List<Integer> lt=new ArrayList<Integer>();
	System.out.println(price);
	
for (int i = 0; i < price.size(); i++) {
	
	
	
}
	}


	
	}


