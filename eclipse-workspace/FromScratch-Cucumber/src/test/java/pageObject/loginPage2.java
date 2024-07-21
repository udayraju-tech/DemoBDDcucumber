package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage2 {
	public WebDriver Idriver;
		
		public loginPage2(WebDriver rdriver)
		{
			Idriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(name="Email")
		@CacheLookup
		WebElement txtEmail;
		
		@FindBy(id="Password")
		@CacheLookup
		WebElement txtPassword;
		
		@FindBy(xpath="//button[contains(text(),'Log in')]")
		@CacheLookup
		WebElement btnLogin;
		
		public void setUserName(String uname)
		{
			txtEmail.clear();
			txtEmail.sendKeys(uname);
			
		}
		
		public void setPassword(String pwd)
		{
			txtPassword.clear();
			txtPassword.sendKeys(pwd);
			
		}
		
		public void ClickLogin()
		{
			btnLogin.click();
			
		}


	}


