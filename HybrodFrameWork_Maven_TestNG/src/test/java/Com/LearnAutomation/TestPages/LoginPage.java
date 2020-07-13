package Com.LearnAutomation.TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	
	public WebDriver driver;
	
	public LoginPage(WebDriver Rdriver)
	{
		this.driver= Rdriver;
	}
	
	/*
	 * @FindBy(xpath = "//*[@id=\"menu-item-901\"]/a") WebElement openLogin;
	 */
	
	@FindBy(id = "username")
	WebElement EmailButton;
	
	@FindBy(id = "password")
	WebElement PasswordButton;
	
	@FindBy(xpath = "//*[@id=\"tp-form\"]/div[3]/label/span[1]")
	WebElement CheckboxButton;
	
	@FindBy(name = "login")
	WebElement SignInButton;


public void ENterCredentials(String UN,String PW)
{
  try 
  {
	Thread.sleep(30);
} 
  catch (InterruptedException e) 
  {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  //openLogin.click();
  EmailButton.sendKeys(UN);
  PasswordButton.sendKeys(PW);
  CheckboxButton.click();
  SignInButton.click();
  
}

}