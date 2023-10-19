package Instalationbasic;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestW3Schol {
    WebDriver  driver;
    
    @BeforeTest
    @Parameters("browser")
	 void launchbrowser(String browser)
	{
    	if(browser.equalsIgnoreCase("chrome")) {
		 driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","F:\\seleniumdriver\\chromedriver.exe");
		
	}
    else if(browser.equalsIgnoreCase("firefox")) {
    	
    	System.setProperty("webdriver.gecko.driver", "F:\\seleniumdriver\\geckodriver.exe");
    	driver = new FirefoxDriver();
    }
    	
    }
	
    	   
   	   @BeforeClass
       @Parameters("url")
	 void launchurl(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	 @Test(priority=2)
	 void logoTest()
	 {
		     WebElement logo = driver.findElement(By.xpath("/html/body/div[2]/div[1]/a[1]"));
		     Boolean actualstatuas = logo.isDisplayed();
		      Assert.assertTrue(actualstatuas,"Logo test is successful");
		   if (logo.isDisplayed())
		   {
			   System.out.println("logo is present on home page hence test is pass");
		   }
		   else
		   {
			   System.out.println(" logo is not present on home page hence test  is failed");
		   }
	 }
	 @Test(priority=1)
	 void urlTest()
	 {
		  String url = driver.getCurrentUrl();
		  Assert.assertEquals(url,"https://www.w3schools.com/","url test is sucesfull pass");
		  
		  if(url.equalsIgnoreCase("https://www.w3schools.co")) {
			  System.out.println("URl is matching hence url test is pass");
		  }
		  else {
			  System.out.println("URL is not matching hence url test is failed");
		  }
	 }
	 @Test(priority=3)
	   void firstTryIturself() {
		   driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[2]/div/a")).click();
		     String parentWin = driver.getWindowHandle();//on parent window addres
		     Set<String> allwin =driver.getWindowHandles();//parent and all child window addressdeto
		     for(String childwind :allwin) {
		    	 
		    	if(!childwind.equalsIgnoreCase(parentWin))//parent window nsel tr child var switch match ny zaltr pude janar 
		    		{
		    		driver.switchTo().window(childwind);//child window switch
		    	    
		    	   WebElement iframe=  driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
		    	     driver.switchTo().frame(iframe);
		    	     
		    	     WebElement text= driver.findElement(By.xpath("//h1"));
		    	     System.out.println(text.getText());
		    	     driver.close();
		    	     driver.switchTo().window(parentWin);
		    	     
		    	     
		    	}
		     }
		   
	   }
	   @Test(priority =4)
	   void mysecondurself() {
		   driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div/div[2]/div/a")).click();
		     String parentWin = driver.getWindowHandle();//on parent window addres
		     Set<String> allwin =driver.getWindowHandles();//parent and all child window addressdeto
		     for(String childwind :allwin) {
		    	 
		    	if(!childwind.equalsIgnoreCase(parentWin))//parent window nsel tr child var switch match ny zaltr pude janar 
		    		{
		    		driver.switchTo().window(childwind);//child window switch
		    	    
		    	   WebElement iframe=  driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
		    	     driver.switchTo().frame(iframe);
		    	     
		    	     WebElement text= driver.findElement(By.xpath("//h1"));
		    	     System.out.println(text.getText());
		    	     driver.close();
		    	     driver.switchTo().window(parentWin);
		    	     
		    	     
		    	}
		     }
	   }  
	 @AfterClass
	  void closeBrowser()
	  {
		  driver.quit();
	  }
	
}
