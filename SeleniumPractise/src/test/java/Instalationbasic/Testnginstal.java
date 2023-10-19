package Instalationbasic;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import dev.failsafe.internal.util.Assert;

public class Testnginstal {

	@Test
	public void testng()
	{
		 WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","F:\\seleniumdriver\\chromedriver.exe");
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		 //driver.quit();
		
	}
}
