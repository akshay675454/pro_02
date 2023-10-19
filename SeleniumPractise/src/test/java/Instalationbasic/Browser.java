package Instalationbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		 System.setProperty("webdriver.chrome.driver","F:\\seleniumdriver\\chromedriver.exe");
		 driver.get("https://www.facebook.com/");
		
	}
		
	}

