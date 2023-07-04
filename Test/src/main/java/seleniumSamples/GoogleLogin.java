package seleniumSamples;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class GoogleLogin {

	public void login ()
	{

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver1=new ChromeDriver();
		driver1.get("https://www.Facebook.com/");
       EdgeDriver driver2=new EdgeDriver();
       driver2.get("https://www.Facebook.com/");
	}

	

}
