package handson;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	public static void main(String[] args) {

WebDriverManager.chromedriver().setup();
ChromeDriver driver1= new ChromeDriver();
driver1.get("https://www.redbus.in/");
driver1.findElement(By.id("src")).sendKeys("Chennai");
driver1.findElement(By.id("dest")).sendKeys("Bangalore");
driver1.findElement(By.xpath("//button[text()=\"Search Buses\"]"));


	}

}
