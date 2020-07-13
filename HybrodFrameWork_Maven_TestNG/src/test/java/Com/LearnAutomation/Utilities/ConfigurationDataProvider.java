package Com.LearnAutomation.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ConfigurationDataProvider {
	
	Properties pro;
	
	public ConfigurationDataProvider(WebDriver driver)
	{
		
		
		try {
			File src = new File ("./Configurations/Configurations");
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} 
		catch (Exception e) 
		{
			System.out.println("please check the config file"+ e.getMessage());
		}
	}	
		
		public String GetDataConfig(String keyttosearch)
		{
			return pro.getProperty(keyttosearch);
		}
		
		public String GetDataConfigBrowser(WebDriver driver)
		{
			return pro.getProperty("Browser");
		}
		
		public String GetDataConfigurl(WebDriver driver)
		{
			return pro.getProperty("URLLink");
		}
		public String GetDataConfigurlUserID(WebDriver driver)
		{
			return pro.getProperty("USER");
		}
		
		public String GetDataConfigurlPassword(WebDriver driver)
		{
			return pro.getProperty("PASS");
		}
	}
	
