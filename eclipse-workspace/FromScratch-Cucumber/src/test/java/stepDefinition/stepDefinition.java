package stepDefinition;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObject.loginPage;

public class stepDefinition {
	
	public WebDriver driver;
	public loginPage lp;
	
	@Given("user is able to login")
	public void user_is_able_to_login() {
		
		String URL= System.getProperty("user.dir");
		System.out.println("Path of local" +URL);
		System.setProperty("WebDriver.chrome.driver", URL+"/src/test/resources/Driver/chromedriver.exe");
		driver= new ChromeDriver();
		
		lp= new loginPage(driver);
	}

	@When("user provide credential")
	public void user_provide_credential() throws InterruptedException {
		
		driver.get("https://admin-demo.nopcommerce.com/");
		driver.manage().window().maximize();
		System.out.println("Given Statement");
	}

	
		@When("user provide credential {string} and {string}")
	public void user_provide_credential_and(String uname, String pwd) throws InterruptedException {   
		
		Thread.sleep(2000);
		lp.setUserName(uname);
		Thread.sleep(2000);
		lp.setPassword(pwd);
		Thread.sleep(2000);
		 lp.ClickLogin();
		 Thread.sleep(5000);
		 driver.close();
		 driver.quit();
		System.out.println("given username and pwd");
		}
	
		@When("Click on Custmer Menu")
		public void click_on_custmer_menu() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}
		@When("User can view add customer page")
		public void user_can_view_add_customer_page() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}
		@Then("user can enter customer info")
		public void user_can_enter_customer_info() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}
		@When("clic on save button")
		public void clic_on_save_button() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}
		@When("verify confrmation message")
		public void verify_confrmation_message() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}
		@Then("close browser")
		public void close_browser() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

	}



