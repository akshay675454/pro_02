package Instalationbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouse1 {
	@Test
	public void mouseaction()
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement mainmenu= driver.findElement(By.xpath("//html/body/main/div/nav/div[2]/ul/li[3]/a"));
	      
		WebElement submainu = driver.findElement(By.xpath("//html/body/main/div/nav/div[2]/ul/li[3]/a"));
		
		Actions act = new Actions(driver);
		
	
		act.moveToElement(mainmenu).moveToElement(submainu).click().build().perform();
	}

}
