package Com.LearnAutomation.Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.LearnAutomation.TestPages.BaseClass;
import Com.LearnAutomation.TestPages.LoginPage;

public class TC_01_LoginAPP extends BaseClass {
  @Test
  public void logintoApplication() 
  {
	  LoginPage log = PageFactory.initElements(driver, LoginPage.class);
	  log.ENterCredentials(excel.GetStringDataExcel("1", 0, 0), excel.GetStringDataExcel("1", 0, 1));
  }
}
