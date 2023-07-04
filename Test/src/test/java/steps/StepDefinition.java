package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition extends BaseClass {
	
	
   

	/*
	 * @Given("Open the chrome browser") public void openBrowser(){
	 * WebDriverManager.chromedriver().setup(); driver1 = new ChromeDriver();
	 * 
	 * 
	 * }
	 */
	/*
	 * @Given("launch the application") public void launchapplication(){
	 * driver1.get("http://leaftaps.com/opentaps/"); }
	 */
	@Given("Enter username as DemoSalesManager")
	public void enterUsername(){
		driver1.findElement(By.id("username")).sendKeys("DemoSalesManager");	}
	
	@Given("Enter password as crmsfa")
	public void enterPassword(){
		driver1.findElement(By.id("password")).sendKeys("crmsfa");

	}
	
	@When("Click on login button")
	public void clcikLogin(){
		driver1.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Homepage should be dispalyed")
	public void verifyHomepage(){
	String expTitle="Leaftaps - TestLeaf Automation Platform";
	String actTitle=driver1.getTitle();
	if(actTitle.equals(expTitle))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	}
	
//scn:2
	@Given("Enter username as {string}")
	public void enterUsername(String uName){
		driver1.findElement(By.id("username")).sendKeys(uName);	}
	
	@Given("Enter password as {string}")
	public void enterPassword(String pWord){
		driver1.findElement(By.id("password")).sendKeys(pWord);

	}
	

	@But("Error should be dispalyed")
	public void verifyError(){
	String expTitle="Leaftaps - TestLeaf Automation Platform";
	String actTitle=driver1.getTitle();
	if(actTitle.equals(expTitle))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("Error dispalyed");
	}
}
	
	
//scn 3:
	
	
	
}
