package Com.LearnAutomation.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	
	public static WebDriver LaunchDriver(WebDriver driver,String browsername, String Url)
	{
		
		if(browsername.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browsername.equals("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browsername.equals("IE"))
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		else if(browsername.equals("opera"))
		{
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		}
		
		else
		{
			System.out.println("please check the browser");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void CloseDriver(WebDriver driver)
	{
		driver.quit();
	}

}
