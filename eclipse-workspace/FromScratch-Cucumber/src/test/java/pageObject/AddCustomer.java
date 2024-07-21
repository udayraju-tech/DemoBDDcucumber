package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddCustomer {
	
		public WebDriver Idriver;
			
			public AddCustomer(WebDriver rdriver)
			{
				Idriver=rdriver;
				PageFactory.initElements(rdriver, this);
			}
			
	
	By lnkCustomers_menu= By.xpath("//p[contains(text(),'Customers')]");
	By LnkCustomer_Menu_Item= By.xpath("//a[@href='/Admin/Customer/List']//p[contains(text(), 'Customers')]");
	
	By btnAddNew= By.xpath("//a[@class='btn btn-primary']");
	
	By txtAddEmailId= By.xpath("//input[@name='Email']");
	By txtAddPassword= By.xpath("//input[@name='Password']");
	By txtAddFirstName = By.xpath("//input[@id='FirstName']");
	
	By txtAddLastName = By.xpath("//input[@name='LastName']");
	By txtAddGender = By.xpath("//input[@id='Gender_Male']");
	By txtAddDateOfBirth = By.xpath("//input[@id='DateOfBirth']");
	By txtAddCompany = By.xpath("//input[@id='Company']");
	By txtAddCheckboxTaxExm = By.xpath("//input[@id='IsTaxExempt']");
	
	By txtSaveButton = By.xpath(" //div[@class='float-right']//button[@type='submit']");
	
		public void clickmenu() {
			
			Idriver.findElement(lnkCustomers_menu).click();
			
		}
		
		public void clickCustomers() {
			
			Idriver.findElement(LnkCustomer_Menu_Item).click();
			
		}

		public void AddCustomers() {
	
			Idriver.findElement(btnAddNew).click();
	
		}
		
		public void AddEmail(String email) {
			
			Idriver.findElement(txtAddEmailId).sendKeys(email);
	
		}
		
		public void txtAddPassword(String password) {
			
			Idriver.findElement(txtAddPassword).sendKeys(password);
	
		}
		
		public void txtAddFirstName(String FirstName) {
			
			Idriver.findElement(txtAddFirstName).sendKeys(FirstName);
	
		}
		public void txtAddLastName(String LastName) {
			
			Idriver.findElement(txtAddLastName).sendKeys(LastName);
	
		}
		public void txtAddGender() {
			
			Idriver.findElement(txtAddGender).click();
	
		}
		
		public void txtSaveButton() {
			
			Idriver.findElement(txtSaveButton).click();
	
		}
			

}
