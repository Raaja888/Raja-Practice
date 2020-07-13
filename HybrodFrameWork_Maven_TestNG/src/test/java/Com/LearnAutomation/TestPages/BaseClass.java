package Com.LearnAutomation.TestPages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import Com.LearnAutomation.Utilities.BrowserFactory;
import Com.LearnAutomation.Utilities.ConfigurationDataProvider;
import Com.LearnAutomation.Utilities.ExcelDataProvider;

public class BaseClass {
	
	
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigurationDataProvider config;
	
	
	@BeforeSuite
	
	public void setupsuite()
	{
		excel = new ExcelDataProvider(driver);
		config = new ConfigurationDataProvider(driver);	
	}
	
	@BeforeClass
	
	public void setupApp()
	{
		driver = BrowserFactory.LaunchDriver(driver, config.GetDataConfigBrowser(driver), config.GetDataConfigurl(driver));
		driver = BrowserFactory.LaunchDriver(driver, config.GetDataConfigurlUserID(driver), config.GetDataConfigurlPassword(driver));
	}
	
	@AfterClass
	
	public void teardown()
	{
		BrowserFactory.CloseDriver(driver);
	}

}
